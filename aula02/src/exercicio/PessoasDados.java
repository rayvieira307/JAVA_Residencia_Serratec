package exercicio;

import java.util.Scanner;

public class PessoasDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        Pessoa[] pessoas = new Pessoa[4]; // Cria um array para armazenar 4 objetos Pessoa

        // Leitura dos dados de 4 pessoas
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = input.nextLine(); // Lê o nome da pessoa

            double peso = 0;
            // Loop para validar a entrada do peso
            while (true) {
                System.out.println("Digite o peso da pessoa " + (i + 1) + ":");
                if (input.hasNextDouble()) { // Verifica se a entrada é um número
                    peso = input.nextDouble(); // Lê o peso
                    if (peso > 0) { // Verifica se o peso é positivo
                        break; // Sai do loop se o peso for válido
                    } else {
                        System.out.println("Peso inválido. Por favor, insira um valor positivo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    input.next(); // Consumir a entrada inválida
                }
            }

            double altura = 0;
            // Loop para validar a entrada da altura
            while (true) {
                System.out.println("Digite a altura da pessoa " + (i + 1) + ":");
                if (input.hasNextDouble()) { // Verifica se a entrada é um número
                    altura = input.nextDouble(); // Lê a altura
                    if (altura > 0) { // Verifica se a altura é positiva
                        break; // Sai do loop se a altura for válida
                    } else {
                        System.out.println("Altura inválida. Por favor, insira um valor positivo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    input.next(); // Consumir a entrada inválida
                }
            }

            input.nextLine(); // Consumir a nova linha

            // Cria um novo objeto Pessoa e armazena no array
            pessoas[i] = new Pessoa(nome, peso, altura);
        }

        // Inicialização das variáveis para cálculos
        int maxPesoIndex = 0; // Índice da pessoa com maior peso
        int maxAlturaIndex = 0; // Índice da pessoa com maior altura
        double somaPeso = 0; // Soma dos pesos
        double somaAltura = 0; // Soma das alturas

        // Cálculos para encontrar a pessoa com maior peso, maior altura e calcular as
        // médias
        for (int i = 0; i < 4; i++) {
            if (pessoas[i].peso > pessoas[maxPesoIndex].peso) {
                maxPesoIndex = i; // Atualiza o índice da pessoa com maior peso
            }
            if (pessoas[i].altura > pessoas[maxAlturaIndex].altura) {
                maxAlturaIndex = i; // Atualiza o índice da pessoa com maior altura
            }
            somaPeso += pessoas[i].peso; // Acumula o peso
            somaAltura += pessoas[i].altura; // Acumula a altura
        }

        double mediaPeso = somaPeso / 4; // Calcula a média de peso
        double mediaAltura = somaAltura / 4; // Calcula a média de altura

        // Exibição dos resultados
        System.out.println("Pessoa com maior peso: " + pessoas[maxPesoIndex].nome);
        System.out.println("Pessoa com maior altura: " + pessoas[maxAlturaIndex].nome);
        System.out.println("Média de peso: " + mediaPeso);
        System.out.println("Média de altura: " + mediaAltura);

        input.close(); // Fecha o Scanner
    }
}