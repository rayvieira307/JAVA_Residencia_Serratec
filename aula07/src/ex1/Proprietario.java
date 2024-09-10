package ex1;

public class Proprietario {
    
	private String nome;

	

    Proprietario(String nome){
        this.nome = nome;
    }
	
	@Override
	public String toString() {
		return "Proprietario: " + nome;
	}

	public String getNome() {
		return nome;
	}
	
}
