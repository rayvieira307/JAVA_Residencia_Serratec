package revisao;

public class Auxiliar extends Funcionario {
   
	private String tipo;

	public Auxiliar(String nome, Double salario, String turno, String tipo) {
		super(nome, salario, turno);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Auxiliar: " + tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void ReajusteDeSalario() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
}
