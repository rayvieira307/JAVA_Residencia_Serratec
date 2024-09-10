package ex1;

import java.time.LocalDate;

public class TesteVenda {

	public static void main(String[] args) {
		
		
		
		Produto p = new Produto (1, "TV", 3000.,Categoria.ELETRONICO);
		Produto p1 = new Produto (2, "PNEU", 800.,Categoria.AUTOMOTIVO);
		Produto p2 = new Produto (3, "CELULAR", 2500.,Categoria.ELETRONICO);
		
	    Venda v = new Venda (p, LocalDate.now(), 1);
	    Venda v1 = new Venda (p1, LocalDate.now(), 1);
	    Venda v2 = new Venda (p2, LocalDate.now(), 1);
	    
	    v.calcularVenda();
	    v1.calcularVenda();
	    v2.calcularVenda();
	    
	    System.out.printf(""" 
	    		 
	    		 Total por Item:
	    		 --------------------
	    		 %s 
	    		 %s
	    		 %s
	    		 --------------------
	    		 Total Geral Venda: %.2f
	    		
	    		""",v,v1,v2, Venda.getTotalVenda());
	    
	    
		
	}

}
