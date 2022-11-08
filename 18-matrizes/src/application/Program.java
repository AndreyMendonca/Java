package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade da matriz");
		int n = sc.nextInt();
		int nn = n;
		int[][] mat = new int[n][nn];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < nn; j++) {
				System.out.println("Cadadastre a posição [" + i + "][" + j + "]" );
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("-------------------");
		System.out.println("LINHA DA DIAGONAL");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < nn; j++) {
				if(i == j) {
					System.out.print(" - [" + mat[i][j] + "]");
				}
			}
		}
		System.out.println("-------------------");
		System.out.println("NUMEROS NEGATIVOS");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < nn; j++) {
				if(mat[i][j] < 0) {
					System.out.println(" - " + mat[i][j]);
				}
			}
		}
		
		sc.close();
	}
}
