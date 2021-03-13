package proc_boletos_tdd;

import java.util.Date;

public class Boleto {
	private String codigo;
	private Date data;
	private Double valorPago;
	
	public String getCodigo() {
		return codigo;
	}
	
	public Date getData() {
		return data;
	}
	
	public Double getValorPago() {
		return valorPago;
	}
	
	public Boleto(String codigo, Date data, Double valorPago) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.valorPago = valorPago;
	}
}

