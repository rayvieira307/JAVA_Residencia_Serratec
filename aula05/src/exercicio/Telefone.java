package exercicio;

public class Telefone {
	
    private String numero;
  
	

	@Override
	public String toString() {
		return "\nTelefone: "+ numero;
	}

	public Telefone(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

    
}
