package proc_boletos_tdd;

import java.util.Date;

public class Fatura {
	
	public static enum STATUS {PAGO, NAO_PAGO};
	
	private Date data;
	private Double valorTotal;
	private String nomeCliente;
	private STATUS status = STATUS.NAO_PAGO;
	public Date getData() {
		return data;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public STATUS getStatus() {
		return status;
	}
	public Fatura(Date data, Double valorTotal, String nomeCliente) {
		super();
		this.data = data;
		this.valorTotal = valorTotal;
		this.nomeCliente = nomeCliente;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	public static void addBoleto(Boleto boletoA) {
		// TODO Auto-generated method stub
		
	}
}
