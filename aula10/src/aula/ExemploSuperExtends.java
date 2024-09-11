package aula;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploSuperExtends {

	public static void main(String[] args) {
		
		List<Object> listaObjetos = new ArrayList<>();
		
		List<Integer> listaNumeros = Arrays.asList(10, 20, 40, 9, 50);
		
		List<String> listaStrings = Arrays.asList("Samsung", "Apple", "LG" );	
		
		
	//	imprimirListas(listaNumeros);
	//	imprimirListas(listaStrings);
	 copiarListas(listaNumeros, listaObjetos);
	 imprimirListas(listaObjetos);
	 

	}
	
	//Para representar qualquer tipo de elemento deve-se colocar o ?
	public static void imprimirListas(List<?> lista) {
		
		
		for (Object o : lista) {
			
			System.out.println(o);
		}
		
	}
		
	//Qualquer coisa que é filho de number e qualquer coisa acima de number 
		public static void copiarListas(List<? extends Number> origem, List<? super Number> destino) {
			
			for (Number numero : origem) {
				
				destino.add(numero);
				
			}
			
			
		}
			
		
		
	}

	
	

	

