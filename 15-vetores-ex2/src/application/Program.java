package application;


import java.util.Scanner;
import util.Pessoas;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("Quantas pessoas deseja cadastrar: ");
		int n = sc.nextInt();
		Pessoas[] pessoa = new Pessoas[n];
		for(int i = 0; i < pessoa.length; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Pessoas(nome, idade, altura);
		}
		System.out.println("Média de altura: " + media(n,pessoa));
		
		sc.close();
	}
	public static double media(int n, Pessoas[] p) {
		double media1 = 0;
		for(int i=0; i < n; i++) {
			media1 += p[i].getAltura();
			System.out.println(media1);
		}
		media1 = media1/n;
		return media1;
	}
}
