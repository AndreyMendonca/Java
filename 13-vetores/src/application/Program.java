package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double [] vect = new double[n];
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		System.out.println("Vetor vect[]");
		for(int i=0; i<n; i++) {
			System.out.print("[" + vect[i] + "]");
		}
		sc.close();
	}
}
