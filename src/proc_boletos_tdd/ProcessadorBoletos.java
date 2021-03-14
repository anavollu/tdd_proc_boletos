package proc_boletos_tdd;

public class ProcessadorBoletos {

	public static void processa(Fatura fatura) {
		fatura.setStatus(Fatura.STATUS.PAGO);
	}

}
