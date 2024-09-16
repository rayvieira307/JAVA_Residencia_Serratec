package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeituraDelimitador {

	public static void main(String[] args) {
	
		//sera usado no trabalho
		try {
			
			Scanner sc = new Scanner (new File("src/arquivos/alunos.csv"));
			sc.useDelimiter(";");
		    
			while (sc.hasNext()) {
				
				System.out.println(sc.nextLine());
				
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			
			System.err.println("Arquivo não encontrado!!");
		}
		
		

	}

}
