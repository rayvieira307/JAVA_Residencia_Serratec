package listas;

import java.util.HashSet;
//import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;

public class ExemplosSet {

	public static void main(String[] args) {
	
		//Set - Uma interface 
		//HashSet - Não aceita elementos duplicados
        //Insere aleatoriamente e nao na ordem colocada
		
	  Set<String> lista= new HashSet<>	();
	  
	 // Scanner sc = new Scanner(System.in);
	 // String time = sc.next().toUpperCase();
	  
	  lista.add("Flamengo");
	  lista.add("Vasco");
	  lista.add("Botafogo");
	  lista.add("Botafogo"); //nao ira entrar novamente na lista
	  lista.add("Fluminense");
	  
	  System.out.println(lista);
	  
	  
	}

}
