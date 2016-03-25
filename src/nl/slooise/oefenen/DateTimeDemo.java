package nl.slooise.oefenen;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class DateTimeDemo {
	
	static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		//deelEen();
		//deelTwee();
		//deelDrie();
		deelVier();
	}
	
	public static void deelVier(){
		
		System.out.println("Noem een jaar");
		int jaar = Integer.valueOf(s.next());
		System.out.println("Noem een maand");
		int maand = Integer.valueOf(s.next());
		
		LocalDate begindatum = LocalDate.of(jaar, maand, 1);
		int maandlengte = begindatum.lengthOfMonth();
		
		int dagnummer = 1;
		int weekdag = begindatum.getDayOfWeek().getValue();
		
		System.out.println("Ma\tDi\tWo\tDo\tVr\tZa\tZo");
		
		for (int j = 0; j < 6; j ++){
			for (int i = 1; i < 8; i ++){
				if (i == weekdag){
					if (dagnummer <= maandlengte){
						System.out.print(dagnummer + "\t");
						dagnummer++;
						begindatum = begindatum.plusDays(1);
						weekdag = begindatum.getDayOfWeek().getValue();
					}
				}
				else {System.out.print("\t");}
			}
		System.out.print("\n");
		}
	}
	
	public static void deelDrie(){
		System.out.println("Welke dag is je geboortedatum?");
		int dag = Integer.valueOf(s.next());
		int maand = Integer.valueOf(s.next());
		int jaar = Integer.valueOf(s.next());
		
		LocalDate geboortedatum = LocalDate.of(jaar, maand, dag);
		LocalDate vandaag = LocalDate.now();
		
		Period p = Period.between(geboortedatum, vandaag);
		long m = ChronoUnit.MONTHS.between(geboortedatum, vandaag);
		
		if (p.getMonths() < 1 && p.getYears() < 1){
			System.out.println("Uw baby is " + p.getDays() + " dagen oud!");
		}
		else if (p.getMonths() < 3 && p.getYears() < 1){
			System.out.println("Uw baby is " + (p.getMonths() * 4) + " weken oud!");
		}
		else if (p.getYears() < 2){
			System.out.println("Heej dreumes. Jij bent al " + m + " maanden oud!");
		}
		else if (p.getYears() < 4){
			System.out.println("Jij bent een peuter van " + p.getYears() + " jaar en " + p.getMonths() + " maanden oud!");
		}
		else if (p.getYears() < 12){
			if (p.getMonths() > 6){
				System.out.println("Jij bent een kind van " + p.getYears() + " jaar en een half jaar oud!");
			}
			else {
				System.out.println("Jij bent een kind van " + p.getYears()+ " jaar!");
			}
		}
		else if (p.getYears() < 18){
			System.out.println("Jij bent een tiener! Jij bent " + p.getYears() + " jaar oud!");
		}
		else {
			System.out.println("Je bent nu volwassen en al " + p.getYears() + " oud!");
		}
		
	}
	
	public static void deelTwee(){
	
		LocalDate datum = LocalDate.now();
		LocalDate start = LocalDate.of(1976, Month.MARCH, 31);
		
		long p = ChronoUnit.DAYS.between(start, datum) +31;
		System.out.println(p);
		
		LocalDate nieuw = start.plusDays(1000-31);
		System.out.println(nieuw);
	}
	
	public static void deelEen(){

		System.out.println("Welke dag is je verjaardag?");
		int dag = Integer.valueOf(s.next());
		int maand = Integer.valueOf(s.next());
		
		LocalDate verjaardag = LocalDate.of(0, maand, dag);
		LocalDate vandaag = LocalDate.now();
		
		int verj = verjaardag.getDayOfYear();
		int vand = vandaag.getDayOfYear();
		int nachtjes = verj - vand;
		
		if (nachtjes < 0){
			nachtjes += 365;
		}
		
		System.out.println(nachtjes);
	}
}
