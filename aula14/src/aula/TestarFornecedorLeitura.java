package aula;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;


public class TestarFornecedorLeitura {

	public static void main(String[] args) {
		System.out.println("Leitura dos objetos");
		List<Fornecedor> fornecedores = new ArrayList<>();
		
		try {
			
			FileInputStream argLeitura = new FileInputStream("/curso/fornecedor.dat");
			ObjectInputStream lerObjeto = new ObjectInputStream(argLeitura);
			fornecedores = (ArrayList<Fornecedor>)lerObjeto.readObject();
			
			lerObjeto.close();
			argLeitura.close();
			System.out.println(fornecedores);
		} catch (Exception e) {
			
			System.out.println("Erro!");
		}
	}

}
