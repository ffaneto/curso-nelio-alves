import java.util.Locale;
import java.util.Scanner;

public class Main26 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n,totalHomens;
		double totalMulheres, mediaAlturaMulheres, somaAlturaMulheres, maiorAltura, menorAltura;
		
		System.out.print("Quantas pessoas serão digitadas?");
		
		n = sc.nextInt();
		
		double [] alturas = new double[n];
		char [] generos = new char[n];
		
		
		for (int i = 0; i < alturas.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			generos[i] = sc.next().charAt(0);
			generos[i] = Character.toUpperCase(generos[i]);
			while (generos[i] !='M' && generos[i] !='F') {
				System.out.println("Valor Inválido, Digite M ou F: ");
				generos[i] = sc.next().charAt(0);
				generos[i] = Character.toUpperCase(generos[i]);
			}
			sc.nextLine();
		}
		
		maiorAltura = alturas[0];
		menorAltura = alturas[0];
		
		for (int i = 0; i < alturas.length; i++) {
			if (alturas [i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}
		
		for (int i = 0; i < alturas.length; i++) {
			if (alturas [i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		
		totalMulheres = 0;
		mediaAlturaMulheres = 0;
		somaAlturaMulheres=0;
		
		for (int i = 0; i < generos.length; i++) {
			if (generos[i] == 'F') {
				totalMulheres++;
				somaAlturaMulheres += alturas[i];
			}
		}		
		
		totalHomens =0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i] == 'M') {
				totalHomens++;
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		
		if (totalMulheres > 0) {
			mediaAlturaMulheres = somaAlturaMulheres / totalMulheres;
			System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		} else {
			System.out.println("Não há Mulheres no Vetor");
		}
		
		System.out.printf("Número de Homens = %d", totalHomens);
				
		sc.close();
	}
}
