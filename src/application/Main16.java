import java.util.Locale;
import java.util.Scanner;

public class Main16 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		
		n = sc.nextInt();
		
		while (n <=0 || n >10) {
			System.out.print("Valor Invalido, Digite um valor entre 1 e 10: ");
			n = sc.nextInt();
		}
		
		int[] vect = new int[n];
		
		for(int i =0; i < vect.length ; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Numeros Negativos: ");
		
		for(int i =0; i < vect.length ; i++) {
			if (vect[i] < 0) {
				System.out.printf("%d\n",vect[i]);
			}
		}
		
		sc.close();
	}
}
