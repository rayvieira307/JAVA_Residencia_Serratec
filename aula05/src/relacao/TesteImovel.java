package relacao;

public class TesteImovel {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Rayssa", "rayssa@gmail.com");
		Pessoa p2 = new Pessoa("Douglas", "douglas@gmail.com");
		
		Imovel i1 = new Imovel("Casa", 188000., p2);
		
		System.out.println(p1);
		System.out.println(i1);
	}

}
