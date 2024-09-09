package exercicio;

public class Fatorial {
    // Método para calcular o fatorial de um número
    // Criar um método para calcular o fatorial de um número.
    // Usar um loop para calcular e exibir os fatoriais de 1 a 10.

    // Método para calcular o fatorial de um número
    // Este método recebe um número inteiro como parâmetro e retorna o fatorial
    // desse número.
    public static long calcularFatorial(int numero) {
        long fatorial = 1; // Inicializa a variável fatorial com 1, pois o fatorial de 0 e 1 é 1.

        // Loop para calcular o fatorial
        // Este loop multiplica a variável fatorial pelos números de 1 até o valor do
        // parâmetro 'numero'.
        for (int i = 1; i <= numero; i++) {
            fatorial *= i; // Multiplica o valor atual de fatorial pelo valor de i.
        }

        return fatorial; // Retorna o valor do fatorial calculado.
    }

    public static void main(String[] args) {
        // Loop para calcular e exibir os fatoriais de 1 a 10
        // Este loop percorre os números de 1 a 10 e exibe o fatorial de cada um.
        for (int i = 1; i <= 10; i++) {
            // Exibe o fatorial do número atual (i)
            // Chama o método calcularFatorial para obter o fatorial do número i e exibe o
            // resultado.
            System.out.println("O Fatorial de " + i + " é : " + calcularFatorial(i));
        }
    }
}
