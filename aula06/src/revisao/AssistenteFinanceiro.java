package revisao;

public class AssistenteFinanceiro extends Assistente {
    
	private String curso;

	public AssistenteFinanceiro(String nome, String turno, String nivel, String curso, Double salario) {
		super(nome, salario, turno, nivel);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "AssistenteFinanceiro: " + curso ;
	}
	
	
}
