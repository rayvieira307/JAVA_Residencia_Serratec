package revisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner (System.in);
			System.out.println("Digite um numero: ");
			int num = sc.nextInt();
				
		} catch (InputMismatchException e) {
			
			System.err.println("Erro!! Digite um numero inteiro!!");
			
		}
	}

}
