package listas;

import java.util.Arrays;
import java.util.Iterator;

public class VarArgs {

	public static void main(String[] args) {
		int total=0;
		total = calcularSoma(10,20,30,100);
		
		
		
		System.out.println("Total: " + total);
	}
	// quem chamar esse método poderá passar quantos valores quiser
	public static int calcularSoma(int num, int...numeros){
		
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		
		System.out.printf("Soma: " + soma);
		
		return soma * num;
		
	}

}
