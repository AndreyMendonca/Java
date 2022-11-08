package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.Funcionario;

public class Program {	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Quantos registros você quer fazer? ");
		int N = sc.nextInt();
		
		Funcionario novo;
		
		for(int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Cadastrando pessoa #" + (i+1));
			System.out.println("Digite o ID");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o nome da pessoa: ");
			String nome = sc.nextLine();
			System.out.println("Digite o Salario: ");
			Double salario = sc.nextDouble();
			
			novo = new Funcionario(nome, salario,id);
			
			list.add(novo);
		}
		System.out.println("Qual ID você quer buscar: ");
		int id = sc.nextInt();
		Integer pos = posicao(list,id);
		if(pos == null) {
			System.out.println("ID NÃO EXISTE");
		}else {
			System.out.println(pos);
			System.out.println("Qual a porcentagem voce quer aumentar: ");
			double porcentagem = sc.nextDouble();
			System.out.println(porcentagem);
			list.get(pos - 1).aumentoSalario(porcentagem);
			list.get(pos-1);
		}
		for(Funcionario e : list ){
			System.out.println(e);
		}
		sc.close();
	}
	public static Integer posicao(List<Funcionario> list, int id) {
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getId() == id) {
				System.out.println("CHEGUEI AQUI");
				return id;
			}
		}
		return null;
	}
}
