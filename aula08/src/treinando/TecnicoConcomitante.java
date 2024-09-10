package treinando;

public final class TecnicoConcomitante extends ColegioAplicacao {
  
	private String nomeCurso;

	protected TecnicoConcomitante(String nome, String nomeCoordenador, String nomeCurso) {
		super(nome, nomeCoordenador);
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	@Override
	public void reuniaoDePais() {
		// TODO Auto-generated method stub
		super.reuniaoDePais();
	}

	
	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub
		super.fazerMatricula();
	}



	
	
	
	
}
