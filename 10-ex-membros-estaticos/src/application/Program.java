package application;

import java.util.Scanner;
import util.Conversao;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quual o preco do dolar: ");
		double preco = sc.nextDouble();
		System.out.print("Quantos dolar ocê quer comprar: ");
		double compra = sc.nextDouble();
		System.out.print("Você irá pagar: ");
		System.out.printf("R$ %.2f",  Conversao.pagar(preco, compra));
		
		sc.close();
	}
}
