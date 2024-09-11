package ex1;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {

	private Map <String, String> contatos;

	public AgendaTelefonica(){
		
		contatos = new HashMap<>();
		
	}

	public void inserir(String nome, String numero) {

		contatos.put(nome, numero);

	}

	public String buscarNumero(String nome) {

	  return contatos.get(nome);

	}

	public void remover(String nome) {
		
		contatos.remove(nome);
	}
	

	public int tamanho() {
		
		return contatos.size();
	}
	
	
	
}
