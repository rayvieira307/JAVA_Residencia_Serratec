package interfaces;

public class Empresa implements Tributos{
    
	private String razaoSocial;
	private Double rendimentos;
	
	
	public Empresa(String razaoSocial, Double rendimentos) {
		super();
		this.razaoSocial = razaoSocial;
		this.rendimentos = rendimentos;
	}


	@Override
	public String toString() {
		return "RazaoSocial: " + razaoSocial + "\nRendimentos: " + rendimentos;
	}


	@Override
	public double calcularIR() {
		
		return rendimentos + IRPESSOAJURIDICA;
	}


	@Override
	public Double calcularICMS() {
		
		return rendimentos * ICMS;
	}


	public String getRazaoSocial() {
		
		return razaoSocial;
	}


	
	
}
