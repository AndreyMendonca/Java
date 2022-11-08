package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Andrey");
		list.add("Jorge");
		list.add("Mateus");
		list.add("Ana");
		list.add("Daiane");
		System.out.println( list.size() );
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		list.remove("Andrey");
		list.remove(0);
		list.removeIf( x -> x.charAt(0) == 'D' );
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		System.out.println(list.indexOf("bob"));
		System.out.println(list.indexOf("Mateus"));
		// quando resultado é 1 == true e -1 == false ou seja não tem 
		
		System.out.println("---------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList() );
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		String name = list.stream().filter( x -> x.charAt(0) == 'A' ).findFirst().orElse(null);
		System.out.println(name);
	}
}
