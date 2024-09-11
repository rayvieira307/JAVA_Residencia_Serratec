package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ExemploDate {

	public static void main(String[] args) {

		// Date dataAtual = new Date();
		// System.out.println(dataAtual);
		// System.out.println(dataAtual.getDate());
		// System.out.println(dataAtual.getDay());

		// Calendar hoje = Calendar.getInstance();
		// hoje.get(Calendar.DAY_OF_MONTH);
		// System.out.println(hoje);

		// informa so a data
		// LocalDate hoje = LocalDate.now();
		// System.out.println(hoje);
		// LocalDate entrada = LocalDate.of(2024, 9, 10);

		// pula tres dias da data selecionada
		// System.out.println(entrada.plusDays(3));

		// verifica se o ano é bissexto
		// System.out.println(entrada.isLeapYear());

		// Mostra o tempo
		// LocalTime hora = LocalTime.now();
		// LocalTime horaEntrada = LocalTime.of(1, 10, 01);
		// System.out.println(hora);
		// System.out.println(horaEntrada);

		// calcula hora extra
		//System.out.println(hora.plusHours(0));

		// Mostra tudo
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora);

		// Mostra fuso
		// ZoneId fuso = ZoneId.systemDefault();
		// System.out.println(fuso);

		// Mostra todos os fuso existentes
		// for (String f : ZoneId.getAvailableZoneIds()) {
		// System.out.println(f);
		// }

	}

}
