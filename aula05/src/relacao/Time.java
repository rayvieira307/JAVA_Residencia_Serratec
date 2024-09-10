package relacao;

public class Time {

	private String nome;
	private Atleta[] atletas;

	public Time(String nome, Atleta[] atletas) {
		this.nome = nome;
		this.atletas = atletas;
	}

	@Override
	public String toString() {
		return "Time: " + nome;
	}

	public Time(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarAtleta(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				return;
			}
		}

	}

	public void mostarTime() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println(atletas[i].getNome());
		}

	}

}
