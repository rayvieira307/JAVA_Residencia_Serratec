package revisao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exemplo {

	public static void main(String[] args) {
	 
		
		//
		List<String> lista = new ArrayList<>();
		lista.add("Branco");
		lista.add("Azul");
		lista.add("Preto");
		lista.add("Amarelo");
		lista.add("Amarelo");
		//Collections ordena em ordem alfábetica
	    Collections.sort(lista);
		System.out.println(lista);
		
		//Nao permite elementos duplicados e gera ordem aleatoria
		//Set<Integer> numeros = new HashSet<>();
		
		//tryset ordenado
		
		//ordem em que os elementos são inseridos 
		Set<Integer> numeros =	new LinkedHashSet<>();
		numeros.add(14);
		numeros.add(10);
		numeros.add(15);
		numeros.add(25);
		numeros.add(55);
		
		System.out.println(numeros);
		
	}

}
