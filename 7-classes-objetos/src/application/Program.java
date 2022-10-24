package application;

import java.util.Scanner;
import recursos.Triangulo;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo t1,t2;
		t1 = new Triangulo();
		t2 = new Triangulo();
		
		System.out.println("Digite os lados do Trinagulo: ");
		t1.a = sc.nextDouble();
		t1.b = sc.nextDouble();
		t1.c = sc.nextDouble();
		
		System.out.println("Digite os lados do Trinagulo: ");
		t2.a = sc.nextDouble();
		t2.b = sc.nextDouble();
		t2.c = sc.nextDouble();
		
		System.out.println("Area: " + t2.a); 
		
		
		sc.close();
	}
}
