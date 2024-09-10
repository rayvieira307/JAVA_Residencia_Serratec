package relacao;

public class TimeAtleta {

	public static void main(String[] args) {
		
		Atleta a1 = new Atleta ("Luís Henrique", 24);
		Atleta a2 = new Atleta ("Bruno Henrique", 29);
		Atleta a3 = new Atleta ("Davi Luiz", 36);
		
		Time time = new Time ("Brasil", new Atleta[3]);
		
		
		time.adicionarAtleta(a1);
		time.adicionarAtleta(a2);
		time.adicionarAtleta(a3);
		time.mostarTime();
		
		
		System.out.println("\n-------------Atletas--------------");
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println("----------------------------------");
	}

}
