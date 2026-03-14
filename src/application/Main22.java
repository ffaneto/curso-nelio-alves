
import java.util.Locale;
import java.util.Scanner;

public class Main22 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n;
		double media;
		double soma;
		
		System.out.println("Quantos elementos terá cada vetor? ");
		
		n = sc.nextInt();
		
		double[] vect = new double[n];
		
		soma = 0.0;
		media = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
			// media = soma / (i + 1) 
		}
		
		media = soma / n;
		
		System.out.printf("Media do vetor = %.3f%n", media);
		
		System.out.println("Elementos Abaixo da Média: ");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect [i] < media) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();
	}
}
