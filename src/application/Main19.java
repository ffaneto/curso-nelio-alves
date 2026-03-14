import java.util.Locale;
import java.util.Scanner;

public class Main19 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n;
		int totalPares;
		
		System.out.println("Quantos números você vai digitar?");
		
		n = sc.nextInt();
		
		int [] vect = new int[n];
		
		totalPares = 0;
		
		for(int i =0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			if (vect[i] %2 ==0) {
				totalPares ++;
			}
		}
		
		System.out.println();
		System.out.println("Numeros Pares: ");
		
		for(int i =0; i<vect.length; i++) {
			if (vect[i] % 2 ==0) {
				System.out.print(vect[i] +" ");
			}
		}
		
		System.out.println();
		
		System.out.println("Quantidade de pares = " + totalPares);
		
		
		sc.close();
	}
}
