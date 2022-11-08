package util;

public class Funcionario {
	private String nome;
	private Double salario;
	private Integer id;
	
	public Funcionario() {
	}
	public Funcionario(String nome, Double salario, Integer id) {
		this.nome = nome;
		this.salario = salario;
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public Integer getId() {
		return id;
	}
	public Double getSalario() {
		return salario;
	}
	public void aumentoSalario(double porcentagem) {
		salario = salario + (salario * porcentagem/100.0);
	}
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f",salario);
		
	}
}
