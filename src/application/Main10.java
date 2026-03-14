import java.util.Scanner;
import java.util.Locale;

public class Main10 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.println("Digite temp em C");
			double C = sc.nextDouble();
			double F = ((9.0 * C) / 5.0) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Quer repetir? s/n");	
			resp = sc.next().charAt(0);
		} while (resp != 'n');
	}
}
