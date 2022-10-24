package util;

public class Conversao {
	public static final double IOF =  6.00;
	
	public static double pagar(double preco, double compra) {
		double custo = preco*compra;
		custo += custo * IOF / 100.00;
		return custo;
	}
}
