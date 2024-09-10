package enumeradores;

public class TestaTurma {

	public static void main(String[] args) {
	
		Turma t = new Turma(123, PeriodoCurso.INTEGRAL);
       
		System.out.println("Curso: " + t.getNumero());
		System.out.println("Dias: " + t.getPeriodoCurso());
		System.out.println("Carga horaria: " + t.getPeriodoCurso().getCargaHoraria());
		System.out.println("Valor: " + t.getPeriodoCurso().getValor());
	}

}
