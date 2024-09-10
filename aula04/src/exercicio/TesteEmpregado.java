package exercicio;

import java.util.Scanner;

public class TesteEmpregado {

	public static void main(String[] args) {

		Character opcao = 'N';
		int Vendedor;
		Double valorVenda;
		Double totalVenda = 0.;

		Fixo fixo1 = new Fixo("Rayssa", "209038144729", 1000., 0.10);
		Fixo fixo2 = new Fixo("Douglas", "144556611777", 3000., 0.15);

		Scanner sc = new Scanner(System.in);

		System.out.println("---------Sistema de Vendas----------\n" + "Vendedores:\n" + "1- Rayssa\n" + "2- Douglas\n");

		

		while (opcao != 'S' && opcao != 's') {
			System.out.println("Escolha o vendedor: ");
			Vendedor = sc.nextInt();

			switch (Vendedor) {
			
			case 1:
				System.out.println("Digite o valor da venda: ");
				valorVenda = sc.nextDouble();
				totalVenda += valorVenda;
				fixo1.calcularSalario(valorVenda);
				break;
				
			case 2:
				System.out.println("Digite o valor da venda: ");
				valorVenda = sc.nextDouble();
				totalVenda += valorVenda;
				fixo2.calcularSalario(valorVenda);
				break;
			default:
				break;
			}
			
			 System.out.println("Deseja encerrar o programa? (S/N)");

			  opcao = sc.next().charAt(0);
	            if(opcao == 'S' || opcao == 's'){
	                System.out.printf("""
	                        --------Salário dos vendedores--------
	                        Nome: %s
	                        Salário Bruto: %.2f
	                        Nome: %s
	                        Salário Bruto: %.2f
	                        --------Total vendido---------
	                        Total: R$ %.2f
	                        """, fixo1.getNome(), fixo1.getSalarioBruto(), fixo2.getNome(), fixo2.getSalarioBruto(), totalVenda);
	            }
	            sc.nextLine();
			 
			 
		}
			 
		}

	}

