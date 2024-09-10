package ex_aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteMarca {

	//Unindo dois tipos de arrays

	public static void main(String[] args) {
		
		List<Marca> marcas = new ArrayList();
	//usando outro tipo para juntar no final
		List<Marca> marcas1 = Arrays.asList(new Marca (3, "Salon Line"), 
				                            new Marca(4, "Kolenne"));
		
		marcas.add(new Marca (0, "Dove"));
		marcas.add(new Marca (1, "Elseve"));
		marcas.add(new Marca (2, "Lola"));
		
		//une marcas1 com marca
		marcas.addAll(marcas1);
		
		System.out.println(marcas);
		
		
	}

}
