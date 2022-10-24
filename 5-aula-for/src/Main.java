import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		for (int i = 0; i < x; i++) {
			int z = sc.nextInt();
			soma += z;
		}
		System.out.println(soma);
		
		sc.close();
	}
}
