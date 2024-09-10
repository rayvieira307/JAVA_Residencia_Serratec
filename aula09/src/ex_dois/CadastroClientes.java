package ex_dois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroClientes  {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
 
		List <Cliente> clientes = new ArrayList<>();
		
		while (true) {
			
		System.out.println("Digite o id do cliente: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		if (id < 0) {
			 break;
		 }
	
		System.out.println("Digite o nome do Cliente: ");
		String nome = sc.next();
		
		System.out.println("Digite a idade do Cliente: ");
		int idade = sc.nextInt();
		
		System.out.println("Digite o numero do Cliente: ");
		String num = sc.next();
		
		Cliente cliente = new Cliente(id, idade, nome, num);
		clientes.add(cliente);
		
		}
		
		System.out.println("Lista de Clientes Cadastrados");
		 
		for(Cliente cliente : clientes) {
			System.out.println(cliente);
			
		}
		sc.close();
		
		
	}

}
