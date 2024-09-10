package interfaces;

public class TotalTributos {
         
	private Double totalGeral;

	public Double getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(Double totalGeral) {
		this.totalGeral = totalGeral;
	}
	
	public void totalizarTributos (Tributos t) {
		
		totalGeral = 0.0;
		totalGeral += t.calcularIR() + t.calcularICMS();
	}
	
	
}
