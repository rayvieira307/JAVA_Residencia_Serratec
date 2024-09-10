package exercicio;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.placa = "KYZ8893";
		veiculo.tipo = "Flex";
		veiculo.valor = 200;

		System.out.println("O valor do IPVA é: " + veiculo.calcularIPVA());
	}

}
