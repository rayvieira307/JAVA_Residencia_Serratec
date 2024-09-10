package ex_tres;

public class Atleta extends Time {
   
	private String nome, posicao;
	private int idade;
	
	public Atleta(String nomeTime, String tecnico, String diretor, String nome, String posicao, int idade) {
		super(nomeTime, tecnico, diretor);
		this.nome = nome;
		this.posicao = posicao;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Atleta: " + nome + ", Posição: " + posicao + ", Idade: " + idade + " Time: " + getNomeTime();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
