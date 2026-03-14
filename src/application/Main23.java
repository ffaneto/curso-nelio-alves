
import java.util.Locale;
import java.util.Scanner;

public class Main23 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n, qtdPares;
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
		
		qtdPares = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] %2 ==0) {
				soma += vect[i];
				qtdPares ++;
			}
		}
		
		//Media = soma/ onde vect[i] % 2
		
		
		if (qtdPares == 0) {
			System.out.println("Nenhum Número Par");
		} else {
			media = soma / qtdPares;
			System.out.printf("Media dos Pares = %.3f%n", media);
		}
				
		sc.close();
	}
}
