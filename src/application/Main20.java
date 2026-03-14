import java.util.Locale;
import java.util.Scanner;

public class Main20 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n, posMaior;
		double maior;
		
		
		System.out.println("Quantos números você vai digitar?");
		
		n = sc.nextInt();
		
		double [] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		maior = vect[0];
		posMaior = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posMaior = i;
			}
		}
		
		System.out.println("Valor Maior: " + maior);
		System.out.println("Posição Maior: " + posMaior);
		sc.close();
	}
}
