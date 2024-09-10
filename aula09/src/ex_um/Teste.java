package ex_um;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) throws AlunoException  {
		
		List<Aluno> listaAlunos = new ArrayList<>();
		
		
		try {
			
			Aluno aluno1 = new Aluno ("Brenda", 9, 1);
			Aluno aluno2 = new Aluno ("Douglas", 5, 1);
			Aluno aluno3 = new Aluno ("Gabriel", 5, 5);
			
			listaAlunos.add(aluno1);
			listaAlunos.add(aluno2);
			listaAlunos.add(aluno3);
			
		} catch (Exception e) {
			
			System.out.println("Erro ao criar Aluno. " + e.getMessage());
		}
		
		for(Aluno aluno : listaAlunos ) {
			
			System.out.println(aluno.toString());
			
		}
		
	}

}
