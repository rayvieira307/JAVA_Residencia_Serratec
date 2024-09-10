package treinando;

public abstract class Universidade {
  
	private String nome;

	
	
	public Universidade(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Universidade: " + nome;
	}

	public String getNome() {
		return nome;
	}

    public void fazerMatricula() {}
	
}
