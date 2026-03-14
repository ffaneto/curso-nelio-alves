
import java.util.Locale;
import java.util.Scanner;

public class Main21 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n;
		
		System.out.println("Digite quantos valores terá cada vetor: ");
		
		n = sc.nextInt();
		
		int[] vectA = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		int[] vectB = new int[n];
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vectA.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		int [] vectC = new int[n];
		
		for (int i = 0; i < vectC.length; i++) { //Aqui
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("Vetor Resultante: ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d\n", vectC[i]);
		}
		
		sc.close();
	}
}
