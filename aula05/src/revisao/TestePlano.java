package revisao;

public class TestePlano {

	public static void main(String[] args) {
		
		Clinica c = new Clinica ("Amil", "Checukp", "1234567");
		Medico m = new Medico ("Unimed", "José", "456");
		Anestesista a = new Anestesista ("Amil", "Carlos", "123", "Geral");
		ControlePGTO cp = new ControlePGTO();
		
		
		
		c.calcularPagamento();
		cp.calcularTotal(c);
		
		m.calcularPagamento();
		cp.calcularTotal(m);
		
		a.calcularPagamento();
		cp.calcularTotal(a);
		
		
		
		System.out.println(c);
		System.out.println(m);
		System.out.println(a);
		
		System.out.println("Total Geral Pago:" + cp.getTotalPago());
		
		//Deve ser usado caso as informações serem atualizadas cosntantemente.
		
		//System.out.printf("\nO valor total do plano é: " + (a.getValorPago() + m.getValorPago() + c.calcularPagamento()));

	}

}
