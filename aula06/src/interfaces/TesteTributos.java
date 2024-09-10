package interfaces;

public class TesteTributos {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa ("Rayssa", 98000.);
		Empresa e = new Empresa ("ABC Ltda", 288500.);
		TotalTributos t = new TotalTributos();
		
		t.totalizarTributos(e);
		t.totalizarTributos(p);
 
		System.out.println(p.getNome() + "-" + p.calcularIR());
		System.out.println(p.getNome() + "-" + p.calcularICMS());
		
		System.out.println(e.getRazaoSocial() + "-" + e.calcularIR());
		System.out.println(e.getRazaoSocial() + "-" + e.calcularICMS());
		
		System.out.println("Total Geral: " + t.getTotalGeral());
		
	}

}
