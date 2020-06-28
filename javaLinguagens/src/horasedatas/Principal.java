package horasedatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {
	
		// Data
		LocalDate data = LocalDate.now();
		System.out.println(data);
		
		// Hora
		LocalTime hora = LocalTime.now();
		System.out.println(hora);
		
		// Data e Hora
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora);
		
		// Formatar Dados
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dataHora.format(formatar));
		
		

	}

}
