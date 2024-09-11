package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {
	
		HashMap <String, String> estados = new HashMap<>();
		estados.put("RJ", "Rio de Janeiro");
		estados.put("SP", "São Paulo");
		estados.put("MG", "Minas Gerais");
		
		
		//System.out.println(estados.keySet());
		System.out.println("---------------------");
		//imprime a chave
		for (String s : estados.keySet()) {
			
			System.out.println(s);
		}
		System.out.println("---------------------");
		//imprime o valor
		for (String string : estados.values()) {
			
			System.out.println(string);
			
		}
		
		//imprime um ao lado do outro
		System.out.println("---------------------");
		for (Map.Entry<String, String> dados: estados.entrySet()) {
			
			System.out.println(dados.getValue() + "-" + dados.getKey());
			
		}
	}

}
