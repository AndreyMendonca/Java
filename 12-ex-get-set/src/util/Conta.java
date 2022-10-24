package util;

public class Conta {
	private int nConta;
	private String nome;
	private double valor; 
	
	public Conta(int nConta, String nome) {
		this.nConta = nConta;
		this.nome = nome;
	}
	public Conta(int nConta, String nome, double valor) {
		this.nConta = nConta;
		this.nome = nome;
		this.valor = valor;
	}
	public int getnConta() {
		return nConta;
	}
	public String getNome() {
		return nome;
	}
	public double getValor() {
		return valor;
	}
	public void deposito(double valor) {
		this.valor += valor;
	}
	public void saque(double valor) {
		this.valor -= (valor + 5.00);
	}
}
