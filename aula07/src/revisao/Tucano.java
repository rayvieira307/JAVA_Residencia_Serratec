package revisao;

import java.time.LocalDate;

public class Tucano extends Ave {

	private double peso;
	
	public Tucano(String nome, LocalDate dataVacinacao, String cor, double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}

	@Override
	public String voar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String emitiSom() {
		// TODO Auto-generated method stub
		return null;
	}
  
	
	
	
	
	
	
}
