package exercicio;

import java.util.Arrays;
import java.util.List;

public class TesteTudo {
   
	public static void main(String[] args) {

		Estado estado1 = new Estado("Rio", "Errejota");
		Cidade cidade1 = new Cidade("Petrópolis", estado1);
		Endereco endereco1 = new Endereco("Custódio", "São Sebastião", "25645-141", cidade1);
		// Telefone telefone1 = new Telefone("4002-8922");
		// Telefone telefone2 = new Telefone("2233-4455");
		List<Telefone> telefones = Arrays.asList(new Telefone("4002-8922"), new Telefone("2233-4455"));

		Contato contato1 = new Contato("Rayssa");
		contato1.adicionarTelefone(telefones);
		//contato1.adicionarTelefone(telefone2);
		contato1.setEndereco(endereco1);

		System.out.println(contato1);

	}
  
}
