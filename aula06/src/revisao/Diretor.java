package revisao;

public class Diretor extends Funcionario {

	
	private String categoria;

	public Diretor(String nome, Double salario, String turno, String categoria) {
		super(nome, salario, turno);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Cat: " + categoria + "\nDados " + super.toString();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override

	public void ReajusteSalarial() {
		
		salario = salario * 1.15;
	}

	@Override
	public void ReajusteDeSalario() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
