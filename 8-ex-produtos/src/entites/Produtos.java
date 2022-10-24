package entites;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;
	
	public void remQuantidade(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public void addQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	public String toString() {
		return nome;
	}
}
