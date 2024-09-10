package ex_dois;

public class Cliente {
   
	private int id, idade;
	private String nome, telefone;
	
	
	public Cliente(int id, int idade, String nome, String telefone) {
		super();
		this.id = id;
		this.idade = idade;
		this.nome = nome;
		this.telefone = telefone;
	}


	@Override
	public String toString() {
		return "Cliente: " + id + ", Idade" + idade + ", Nome: " + nome + ", Telefone: " + telefone;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
	
	
	
	
	
	
}


