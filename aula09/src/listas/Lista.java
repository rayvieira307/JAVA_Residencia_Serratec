package listas;

import java.util.ArrayList;
import java.util.List;

//Primeiro mais usado

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List <definir variavel>

		List<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("Carlos");
		nomes.add("Rayssa");
		nomes.add("Douglas");

		// apagar um item da matriz
		// nomes.remove(0);

		// lista um do lado do outro dentro do[]
		// System.out.println(nomes);

		// remove um item
		if (nomes.contains("Rayssa")) {
           
			//mostra o indice 
			//System.out.println(nomes.indexOf("Rayssa"));
			nomes.remove(nomes.indexOf("Rayssa"));
            
		}

		// listar um abaixo do outro
		for (String nome : nomes) {

			System.out.println(nome);
		}

	}

}
