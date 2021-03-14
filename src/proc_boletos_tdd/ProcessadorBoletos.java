package proc_boletos_tdd;

import java.util.Date;

public class ProcessadorBoletos {

	public static void processa(Fatura fatura) {
		for (int i = 0; fatura.getListaBoletos().size() > i; i++) {
			Boleto boleto = fatura.getListaBoletos().get(i);
			Pagamento pagamento = new Pagamento(boleto.getValorPago(), new Date(), Pagamento.TYPE.BOLETO);
			fatura.addPagamento(pagamento);
		}

		if (fatura.getTotalBoletos() >= fatura.getValorTotal()) {
			fatura.setStatus(Fatura.STATUS.PAGO);
		}
	}

}
