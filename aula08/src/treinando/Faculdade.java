package treinando;

public abstract class Faculdade extends Universidade  {
   
	 private String nomeFaculdade;
	 private int bloco;
	
	

	protected Faculdade(String nome, String nomeFaculdade, int bloco) {
		super(nome);
		this.nomeFaculdade = nomeFaculdade;
		this.bloco = bloco;
	}


	@Override
	public String toString() {
		return "Faculdade: " + nomeFaculdade + "\nBloco" + bloco;
	}


	public String getNomeFaculdade() {
		return nomeFaculdade;
	}


	public void setNomeFaculdade(String nomeFaculdade) {
		this.nomeFaculdade = nomeFaculdade;
	}


	public int getBloco() {
		return bloco;
	}


	public void setBloco(int bloco) {
		this.bloco = bloco;
	}
	 
	
	public String matrizCurricular () {
		
		return matrizCurricular();
	}
	
	 
}
