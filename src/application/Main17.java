import java.util.Locale;
import java.util.Scanner;

public class Main17 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n;
		double sum =0.0;
		double avg = 0.0;
		
		System.out.println("Quantos numeros voce vai digitar?");
		
		n = sc.nextInt();
		
		double vect[] = new double[n];
		
		for(int i =0; i< vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		System.out.print("Valores = " );
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] +"  ");
		}
		
		avg = sum/vect.length;
		
		System.out.println();
		
		System.out.printf("Soma = %.2f%n" ,sum);
		
		System.out.printf("Media = %.2f%n", avg);
		
		sc.close();
	}
}
