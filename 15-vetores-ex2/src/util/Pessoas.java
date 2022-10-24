package util;
import application.Program;

public class Pessoas {
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoas(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNome(){
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getAltura() {
		return altura;
	}
	
	public String toString() {
		return "Nome: " + nome + " Idade: " + idade + " Altura: " + altura;
	}
	
}
