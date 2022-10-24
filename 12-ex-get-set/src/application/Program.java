package application;
import java.util.Scanner;
import util.Conta;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os seguintes dados para abrir a conta: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Valor inicial(opcional): ");
		double valor = sc.nextDouble();
		Conta c1 = null;
		if( valor == 0) {
			c1 = new Conta(12,nome);
		}else {
			c1 = new Conta(1,nome,valor);
		}
		
		System.out.println("DADOS \n Nome: " + c1.getNome() + "\nN conta: " + c1.getnConta() + "\nValor: " + c1.getValor() );
		
		sc.close();
	}
}
