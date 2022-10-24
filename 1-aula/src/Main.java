
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//string
		String X, xx;
		X = sc.next();
		System.out.println("Você digitou: " + X);
		xx = sc.nextLine();
		System.out.println("Você digitou: " + xx);
	
		//inteiros
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		//double
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou: " + z);
		
		//char 
		char v;
		v = sc.next().charAt(0); //pega somente a primeira linha
		System.out.println("Você digitou: " + v);
		
		
		sc.close();
	}

}
