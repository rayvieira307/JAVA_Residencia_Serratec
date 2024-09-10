package exercicio;

public class FreeLancer extends Vendedor {

	private Integer diasTrabalhados;
	private Double valorDia;
	
	
	public FreeLancer(String nome, String cPF, Integer diasTrabalhados, Double valorDia) {
		super(nome, cPF);
		this.diasTrabalhados = diasTrabalhados;
		this.valorDia = valorDia;
	}


	public Integer getDiasTrabalhados() {
		return diasTrabalhados;
	}


	public void setDiasTrabalhados(Integer diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}


	public Double getValorDia() {
		return valorDia;
	}


	public void setValorDia(Double valorDia) {
		this.valorDia = valorDia;
	}
	
	
	
	
	
	
}
