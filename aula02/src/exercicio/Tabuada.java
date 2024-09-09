package exercicio;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		
		int result;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número: ");
		Integer num = sc.nextInt();
		
		System.out.println("+---Resultado---+");
		
		for (int i = 1; i <= 10; i++)  {
			result = i * num;
			
			if (result < 10) {
				
				 System.out.println("| " + i + " X " + num + " = " + result + "  |");	
			}
			
			else {
				
				 System.out.println("| " + i + " X " + num + " = " + result + " |");
			}
			 
			
		}
		
		System.out.println("+---------------+");

	}

}   
