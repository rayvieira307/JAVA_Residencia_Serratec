package revisao;

public class ControlePGTO {
   
	private Double totalPago= 0.0;
	
	public Double getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(Double totalPago) {
		this.totalPago = totalPago;
	}
	
	public void calcularTotal(PlanoSaude p) {
		
		totalPago = totalPago + p.getValorPago ();
	}
}
