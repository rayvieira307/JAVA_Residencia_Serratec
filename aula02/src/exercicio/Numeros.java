package exercicio;

import revisao.JOptionPane;

public class Numeros {
    public static void main(String[] args) {
       
    	int numero = 0; // Variável para armazenar o número inteiro do usuário

        // Ler e validar o número inteiro do usuário
        while (true) {
            String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro:"); // Exibe uma caixa de diálogo
                                                                                         // para o usuário digitar um
                                                                                         // número
            try {
                numero = Integer.parseInt(numeroStr); // Tenta converter a entrada de texto para um número inteiro
                break; // Sai do loop se a conversão for bem-sucedida
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número inteiro."); // Exibe
                                                                                                               // uma
                                                                                                               // mensagem
                                                                                                               // de
                                                                                                               // erro
                                                                                                               // se a
                                                                                                               // conversão
                                                                                                               // falhar
            }
        }

        // Calcular o antecessor e o sucessor
        int antecessor = numero - 1; // Calcula o antecessor subtraindo 1 do número
        int sucessor = numero + 1; // Calcula o sucessor adicionando 1 ao número

        // Exibir o antecessor e o sucessor
        String mensagem = String.format("O antecessor de %d é %d\nO sucessor de %d é %d", numero, antecessor, numero,
                sucessor); // Cria uma mensagem formatada com o número, seu antecessor e seu sucessor
        JOptionPane.showMessageDialog(null, mensagem); // Exibe a mensagem em uma caixa de diálogo
    }
}