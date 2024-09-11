package data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ExemploInstant {

	public static void main(String[] args) {
		
		//imprime o horario global
		Instant dataHora = Instant.now();
		System.out.println(dataHora);
		
		//colocando o horario Local
		LocalDateTime dataLocal = LocalDateTime.ofInstant(dataHora, ZoneId.systemDefault());
		System.out.println(dataLocal);	
		
		//Mostra a diferença do fuso
		System.out.println(dataHora.atZone(ZoneId.systemDefault()));
		
		//Mostra a diferença de outro lugar
		System.out.println(dataHora.atZone(ZoneId.of("Japan")));
	}

}
