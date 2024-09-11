package ex1;

import java.util.HashMap;
import java.util.Map;

public class TesteAgenda {

	public static void main(String[] args) {
		
	AgendaTelefonica agenda= new AgendaTelefonica();
		
		agenda.inserir("Rayssa", "(24)98282834");
		agenda.inserir("Douglas", "(24)98282833");
		agenda.inserir("Brenda", "(24)98282832");
		agenda.inserir("Jonathan", "(24)98282839");
		agenda.inserir("Gabriel", "(24)98282838");
		
		//Mostra o numero
		System.out.println(agenda.buscarNumero("Douglas"));
		
		//Mostra o tamanho da lista
		System.out.println(agenda.tamanho());
		
		//Remove um item
		agenda.remover("Rayssa");
		
		//Mostra o tamanho atual
		System.out.println(agenda.tamanho());
		
		
	}

}
