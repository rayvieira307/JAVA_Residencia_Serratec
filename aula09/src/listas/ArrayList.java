package listas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Segundo mais usado

public class ArrayList {
	
	public static void main(String[] args) {
		
		List<String> bichos = Arrays.asList("Cachorro", "Gato", "Coelho", "Pato");
		
	  //trocar um item de uma ista
       bichos.set(3, "Papagaio");
		
		if (bichos.isEmpty()) {
			
			System.out.println("A lista está vazia");
		}
		
		//Mostra o que esta dentro do indice
		System.out.println(bichos.get(0));
		
		//E uma classe que é um metodo static 
		//O SORT espera uma lista e ordena de ordem crescente
		Collections.sort(bichos);
		System.out.println(bichos);
               
       
       
	}

}
