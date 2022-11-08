package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.xml.datatype.Duration;

public class Program {
	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); 
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:20:36");
		Instant d06 = Instant.parse("2022-07-20T01:20:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:20:26-03:00");
		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("10/10/2000", fmt1);
		DateTimeFormatter fmt2  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("10/10/2000 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 10, 2);
		LocalDateTime d11 = LocalDateTime.of(2022, 2, 10, 1, 20);
		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d04 = " + d04.format(fmt1));
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		
		System.out.println("r1 = " + r1);
		System.out.println("r1 = " + r2);
		System.out.println("r1 = " + r3);
		System.out.println("r1 = " + r4);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		
		LocalDate semanaPassada = d04.minusDays(7);
		LocalDate seamanQueVem = d04.plusDays(7);
		LocalDateTime semanaPassadaTime = d05.minusDays(7);
		LocalDateTime seamanQueVemTime = d05.plusDays(7);
		Instant semanaPassadaInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant semanaQueVemTime = d06.plus(7, ChronoUnit.DAYS);
		
		
		Duration t1 = Duration.between(seamanQueVem.atStartOfDay(), d04.atStartOfDay());
		Durarion t2 = Duration.between();
		
		
		
		
	}
}
