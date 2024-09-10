package interfaces;

public class Poupanca implements Conta {
      
	private String titular;
	private Double saldo;
	
	public Poupanca(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Titular: " + titular + "\nSaldo: " + saldo;
	}

	@Override
	public void saque(Double valor) {
		if (saldo < valor) {
			
			System.out.println("Saldo insuficiente");
		} else {
			
			saldo = saldo - valor;
			System.out.println("Saque efetuado com sucesso");
		}
		
	}

	@Override
	public void deposito(Double valor) {
		if (valor < 0) {
			 System.out.println("Valor Inválido!");
		} else {
			
			System.out.println("Depósito efetuado!");
		}
		
		
	}
	
	
}