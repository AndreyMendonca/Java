
public class Main {
	public static void main(String[] args) {
		String original = "abcd EFGHI abS sasn sajsb    ";
		String p1 = original.toLowerCase();
		String p2 = original.toUpperCase();
		String p3 = original.trim(); //remove todos os espaços em brancos da frente da frase
		String p4 = original.substring(2); //cria uma nova string a partir do numero de digitos colocados como argumento
		String p5 = original.substring(2,9); //cria uma nova string do 2 ao 9 de elemento
		String p6 = original.replace("a", "x"); //troca uma letra/palavra por o proximo elemento adicionado
		int i = original.indexOf("bc"); // primeira ocorrencia de "bc", irá retornar 1
		int j = original.lastIndexOf("bc"); // ultima ocorrencia de bc
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(i);
		System.out.println(j);
		
		String s = "banana maça limão";
		String [] vetor = s.split(" "); //nesse caso ele vai criar vetor a partir do espaço " "
		
		System.out.println(vetor[1]);
		
	}
}
