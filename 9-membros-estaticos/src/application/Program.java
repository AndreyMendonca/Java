package application;

import java.util.Scanner;
import util.Calculator;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do RAIO");
		double raio = sc.nextDouble();
		double c = Calculator.circunferencia(raio);
		double v = Calculator.volume(raio);
		System.out.println(c);
		System.out.println(v);
		
	}
}
