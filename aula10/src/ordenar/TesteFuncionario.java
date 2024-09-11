package ordenar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteFuncionario {;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Funcionario> funcionarios = Arrays.asList(new Funcionario("Rayssa", 35),
				                                      new Funcionario("Douglas", 31),
				                                      new Funcionario("Rayane", 18));                    
		Collections.sort(funcionarios);
		
		for (Funcionario f :  funcionarios) {
			
			System.out.println(funcionarios.indexOf(f));
			System.out.println(f);
			
		}
		//Ele aceita uma string
		//List<String> cores = Arrays.asList("Roxo", "Amarelo");
		
		
	}

}
