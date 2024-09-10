package ex1;

public final class TesteLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro ("Marco Antônio", "Cisco CCNA", 85.);
		Livro livro2 = new Livro ("Kathy Sierra", "Use a Cabeça Java", 98.);
		
		Operacao op = new Operacao("Venda", livro);
		Operacao op2 = new Operacao("Empréstimo", livro2);
	
		livro.reajuste(6);
		
		op.venderlivro();
		op2.emprestarlivro();
		
		System.out.println(op);
		System.out.println(op2);

		
		
		
	}

}
