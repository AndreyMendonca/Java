package application;
import entites.Produtos;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produtos p = new Produtos();
		System.out.println("Digite o nome do produto: ");
		p.nome = sc.nextLine();
		System.out.println("Digite o preco: ");
		p.preco = sc.nextDouble();
		System.out.println("Digite a quantidade inicial: ");
		p.quantidade = sc.nextInt();
		
		System.out.println(p.nome + " " + p.preco + " " + p.quantidade);
		sc.close();
		
		System.out.println(p.toString());
		
	}
}
