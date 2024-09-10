package treinando;

public final class Direito extends Faculdade implements Oab, Eventos {
  
	

	private int tempoDuracao;

	protected Direito(String nome, String nomeFaculdade, int bloco, int tempoDuracao) {
		super(nome, nomeFaculdade, bloco);
		this.tempoDuracao = tempoDuracao;
	}


	@Override
	public String toString() {
		return "Direito [tempoDuracao=" + tempoDuracao + "]";
	}


	public int getTempoDuracao() {
		return tempoDuracao;
	}


	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}


	@Override
	public boolean realizarProva() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public String matrizCurricular() {
		// TODO Auto-generated method stub
		return super.matrizCurricular();
	}



	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub
		super.fazerMatricula();
	}


	@Override
	public String programacao() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void conteudoEventos() {
		// TODO Auto-generated method stub
		
	}

    
    

	
	
	
	
}
