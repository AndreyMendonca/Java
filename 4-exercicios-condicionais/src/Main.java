import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		System.out.println("Quantidade de minutos consumido");
		valor = sc.nextInt();
		
		if(valor <= 100) {
			System.out.println("Valor a pagar: R$ 50,00");
		}else {
			valor = valor - 100;
			valor = 50 + (valor * 2);
			System.out.println("Valor a pagar: R$ " + valor + ",00");
		}
		
		sc.close();
		
	}
}
