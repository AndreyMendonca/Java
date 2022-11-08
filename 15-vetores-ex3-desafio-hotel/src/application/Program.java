package application;

import java.util.Scanner;

import util.Quartos;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quartos[] quarto = new Quartos[10];
		
		System.out.println("Quantos você quer cadastrar");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Cadastro #" + i+1);
			System.out.println("Qual o nome da pessoa: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Qual o email da pessoa: ");
			String email = sc.next();
			System.out.println("Qual o número do quarto:  ");
			int nQuarto = sc.nextInt();
			
			quarto[nQuarto] = new Quartos(nome,email);
		}
		for(int i = 0; i <10; i++) {
			if(quarto[i] != null) {
				System.out.println(i + " " + quarto[i]);
			}
		}
		
		sc.close();
		
	}
}
