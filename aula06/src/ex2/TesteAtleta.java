package ex2;

public class TesteAtleta {

	public static void main(String[] args) {
		
		Pais p1 = new Pais ("Brasil");
		Pais p2 = new Pais ("EUA");
		Atleta a1 = new Atleta ("Anderson Silva", 98.,p1);
		Atleta a2 = new Atleta ("Jon Jone", 59., p2);
		Atleta a3 = new Atleta ("Vitor Belfort", 110., p1);
		
		System.out.println("O atleta: "  + a1.getNome()+ " " + a1.verificaSituacao());
		System.out.println("O atleta: " + a2.getNome() + " " +  a2.verificaSituacao());
		System.out.println("O atleta: " + a3.getNome() + " "  +  a3.verificaSituacao());
		
		System.out.println("Total de participantes é: " + Atleta.getTotalParticipantes());
	}

}
