package application;

public class Program {
	public static void main(String[] args){
		String[] vect = new String[] {"Andrey", "Mateu","teste"};
		for(int i = 0 ; i<vect.length; i++) {
			System.out.println(vect[i] + " - " + i);
		}
		System.out.println("---");
		for (String obj : vect ) {
			System.out.println(obj);
		}
 	}
}