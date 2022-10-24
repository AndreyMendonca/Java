package application;

import java.util.Scanner;

public class Program {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números deseja digitar: ");
		int n = sc.nextInt();
		System.out.println();
		int[] vetor = new int[n];
		for(int i = 0; i < vetor.length; i++ ) {
			System.out.println("Digite o valor da posição " + i);
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("VALORES NEGATIVOS: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0 ) {
				System.out.print(" [" + vetor[i] + "] ");;
			}
		}
		sc.close();
	}
}
