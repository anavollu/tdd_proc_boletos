package proc_boletos_tdd;

import java.util.Date;

public class Fatura {
	
	public static enum STATUS {PAGO};
	
	private Date data;
	private Double valorTotal;
	private String nomeCliente;
	private STATUS status;
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
	public Fatura(Date data, Double valorTotal, String nomeCliente, STATUS status) {
		super();
		this.data = data;
		this.valorTotal = valorTotal;
		this.nomeCliente = nomeCliente;
		this.status = status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
}
