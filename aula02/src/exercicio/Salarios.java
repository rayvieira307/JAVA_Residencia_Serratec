package exercicio;

import revisao.JOptionPane;

public class Salarios {
	    public static void main(String[] args) {
	        String nome = ""; // Variável para armazenar o nome do usuário
	        String telefone = ""; // Variável para armazenar o telefone do usuário
	        String email = ""; // Variável para armazenar o email do usuário
	        double salario = 0; // Variável para armazenar o salário do usuário

	        // Ler e validar o nome do usuário
	        while (true) {
	            nome = JOptionPane.showInputDialog("Digite o seu nome:"); // Exibe uma caixa de diálogo para o usuário
	                                                                      // digitar o nome
	            if (nome != null && !nome.trim().isEmpty()) { // Verifica se o nome não é nulo e não está vazio
	                break; // Sai do loop se o nome for válido
	            } else {
	                JOptionPane.showMessageDialog(null, "Nome inválido. Por favor, insira um nome válido."); // Exibe uma
	                                                                                                         // mensagem de
	                                                                                                         // erro
	            }
	        }

	        // Ler e validar o telefone do usuário
	        while (true) {
	            telefone = JOptionPane.showInputDialog("Digite o seu telefone:"); // Exibe uma caixa de diálogo para o
	                                                                              // usuário digitar o telefone
	            if (telefone != null && !telefone.trim().isEmpty()) { // Verifica se o telefone não é nulo e não está vazio
	                break; // Sai do loop se o telefone for válido
	            } else {
	                JOptionPane.showMessageDialog(null, "Telefone inválido. Por favor, insira um telefone válido."); // Exibe
	                                                                                                                 // uma
	                                                                                                                 // mensagem
	                                                                                                                 // de
	                                                                                                                 // erro
	            }
	        }

	        // Ler e validar o email do usuário
	        while (true) {
	            email = JOptionPane.showInputDialog("Digite o seu email:"); // Exibe uma caixa de diálogo para o usuário
	                                                                        // digitar o email
	            if (email != null && !email.trim().isEmpty()) { // Verifica se o email não é nulo e não está vazio
	                break; // Sai do loop se o email for válido
	            } else {
	                JOptionPane.showMessageDialog(null, "Email inválido. Por favor, insira um email válido."); // Exibe uma
	                                                                                                           // mensagem
	                                                                                                           // de erro
	            }
	        }

	        // Ler e validar o salário do usuário
	        while (true) {
	            String salarioStr = JOptionPane.showInputDialog("Digite o seu salário:"); // Exibe uma caixa de diálogo para
	                                                                                      // o usuário digitar o salário
	            try {
	                salario = Double.parseDouble(salarioStr); // Tenta converter o salário para um número decimal
	                if (salario > 0) { // Verifica se o salário é positivo
	                    break; // Sai do loop se o salário for válido
	                } else {
	                    JOptionPane.showMessageDialog(null, "Salário inválido. Por favor, insira um valor positivo."); // Exibe
	                                                                                                                   // uma
	                                                                                                                   // mensagem
	                                                                                                                   // de
	                                                                                                                   // erro
	                }
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número."); // Exibe uma
	                                                                                                       // mensagem de
	                                                                                                       // erro se a
	                                                                                                       // conversão
	                                                                                                       // falhar
	            }
	        }

	        // Calcular o salário com acréscimo de 10%
	        double salarioComAcrescimo = salario * 1.10; // Calcula o novo salário adicionando 10%

	        // Exibir as informações digitadas e o salário com acréscimo
	        String mensagem = String.format(
	                "Nome: %s\nTelefone: %s\nEmail: %s\nSalário com acréscimo de 10%%: %.2f",
	                nome, telefone, email, salarioComAcrescimo); // Formata a mensagem com as informações do usuário
	        JOptionPane.showMessageDialog(null, mensagem); // Exibe a mensagem em uma caixa de diálogo
	    }
	}