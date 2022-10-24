package application;

import java.util.Scanner;
import util.Produtos;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos você quer cadastrar ");
		int n = sc.nextInt();
		Produtos[] vetor = new Produtos[n];
		for(int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			vetor[i] = new Produtos(nome, preco);
		}
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Nome: ");
			System.out.println(vetor[i].getNome());
			System.out.print("Preco: ");
			System.out.println(vetor[i].getPreco());
			System.out.println();
		}
		
		
		
		sc.close();
		
	}
}
