package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import proc_boletos_tdd.Boleto;
import proc_boletos_tdd.Fatura;
import proc_boletos_tdd.ProcessadorBoletos;

class ProcBoletosTest {

	@Test
	void testFaturaPaga() {
		Fatura fatura = new Fatura(new Date(), 1500.00, "Jo?o Ferreira");
		fatura.addBoleto(new Boleto("890", new Date(), 500.00));
		fatura.addBoleto(new Boleto("891", new Date(), 400.00));
		fatura.addBoleto(new Boleto("892", new Date(), 600.00));
		ProcessadorBoletos.processa(fatura);

		assertEquals(Fatura.STATUS.PAGO, fatura.getStatus());
		
		assertEquals(fatura.getListaPagamento().size(), 3);
	}

	@Test
	void testFaturaPagaAcimaValor() {
		Fatura fatura = new Fatura(new Date(), 1500.00, "Jo?o Ferreira");
		fatura.addBoleto(new Boleto("890", new Date(), 1000.00));
		fatura.addBoleto(new Boleto("891", new Date(), 500.00));
		fatura.addBoleto(new Boleto("892", new Date(), 250.00));
		ProcessadorBoletos.processa(fatura);

		assertEquals(Fatura.STATUS.PAGO, fatura.getStatus());
		
		assertEquals(fatura.getListaPagamento().size(), 3);
	}

	@Test
	void testFaturaPagaAbaixoValor() {
		Fatura fatura = new Fatura(new Date(), 2000.00, "Jo?o Ferreira");
		fatura.addBoleto(new Boleto("890", new Date(), 600.00));
		fatura.addBoleto(new Boleto("891", new Date(), 400.00));
		ProcessadorBoletos.processa(fatura);

		assertEquals(Fatura.STATUS.NAO_PAGO, fatura.getStatus());
		
		assertEquals(fatura.getListaPagamento().size(), 2);
	}

}
