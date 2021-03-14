package proc_boletos_tdd;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	
	private List<Boleto> listaBoletos = new ArrayList<>();
	
	public void addBoleto(Boleto boleto) {
		this.listaBoletos.add(boleto);
	}
	
	private List<Pagamento> listaPagamento = new ArrayList<>();

	public void addPagamento(Pagamento pagamento) {
		this.listaPagamento.add(pagamento);
	}
	
	public List<Pagamento> getListaPagamento() {
		return listaPagamento;
	}
	
	public List<Boleto> getListaBoletos() {
		return listaBoletos;
	}
}
