package ex1;


import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
	
		
	 LocalDate date = LocalDate.now();	
		
	 Proprietario p = new Proprietario ("Rayssa");
	 
	 Carro c = new Carro ("Ford", date, p, "Esportivo");
	 
	c.trocarOleo();
	c.revisao();
	
	System.out.println(c);

	 
	 
	}

}
