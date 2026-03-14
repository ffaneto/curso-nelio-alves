

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main29 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "fiDePuta");

		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------");
		
		list.removeIf(x -> x.charAt(0) == 'M'); // Todo String X, tal que o primeiro caractere seja igual a M
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------");

		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // -1 quando não encontrado
		System.out.println("-----------");

		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
		
		for (String string : result) {
			System.out.println(string);
		}
		
		System.out.println("-----------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // Encontrar a primeira String com caractere inicial A
		
		System.out.println(name);
	}
}
