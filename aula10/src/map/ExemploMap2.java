package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ExemploMap2 {

	public static void main(String[] args) {
		
		//TreeMap <String, Integer> pessoas = new TreeMap<>();	
		//Mantem em ordem crescente e não pode ter valores nulos
	
		
		
		HashMap <Integer, String> pessoas = new HashMap<>();	
		//Nao ordena e pode conter valor nulo
		
		pessoas.put(1, "Rayssa");
		pessoas.put(2, "Douglas");
		pessoas.put(3, "Brenda");
		pessoas.put(4, "Jonathan");
		
		System.out.println(pessoas);
		
//ordena na ordem indice		
for (Entry<Integer, String> dados: pessoas.entrySet()) {
			
	System.out.println(dados.getKey() + " - " + dados.getValue());
			
}
				
	}

}
