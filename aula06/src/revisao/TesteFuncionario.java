package revisao;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Assistente a = new Assistente("Rayssa", 2200., "Noite", "Nivel-1");
		Diretor d = new Diretor ("Douglas",  8500., "Integral", "Financeiro");
        
		a.ReajusteSalarial();
		d.ReajusteSalarial();
		
		System.out.println(a);
		System.out.println(d);
		
	}

}
