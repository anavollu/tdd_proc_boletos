package proc_boletos_tdd;

import java.util.Date;

public class Pagamento {

	public static enum TYPE {
		BOLETO
	};

	private Double valorPago;
	private Date data;
	private TYPE tipo;

	public Double getValorPago() {
		return valorPago;
	}

	public Date getData() {
		return data;
	}

	public TYPE getTipo() {
		return tipo;
	}

	public Pagamento(Double valorPago, Date data, TYPE tipo) {
		super();
		this.valorPago = valorPago;
		this.data = data;
		this.tipo = tipo;
	}
}
