package ex_tres;

import java.util.ArrayList;
import java.util.List;

public class TestarTime {

	public static void main(String[] args) {
		
		List <Atleta> atletas = new ArrayList<>();
		
		Atleta at = new Atleta("Flamengo", "Cleiton", "Cleitin", "Rayssa", "2", 19);
		Atleta at1 = new Atleta("Fluminense", "Cleiton", "Cleitin", "Douglas", "3", 31);
		Atleta at2 = new Atleta("Vasco", "Cleiton", "Cleitin", "Rayssa", "1", 15);
		
		System.out.println(at);
		System.out.println(at1);
		System.out.println(at2);
		
	}

}
