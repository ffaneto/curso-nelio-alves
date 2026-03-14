import java.util.Locale;
import java.util.Scanner;

public class Main18 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n, nmenores;
		double alturaTotal, alturaMedia, percentualMenores;
		
		System.out.println("Quantas pessoas serão digitadas?");
		
		n = sc.nextInt();
		
		String[] vectNome = new String[n];
		int[] vectIdade = new int[n];
		double[] vectAltura = new double[n];
		
		for(int i =0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			vectNome[i] = sc.next();
			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();
			System.out.print("Altura: ");
			vectAltura[i] = sc.nextDouble();
		}
		
		nmenores = 0;
		alturaTotal = 0;
		alturaMedia = 0.0;
		
		for (int i = 0; i <n; i++) {
			if (vectIdade[i] < 16) {
				nmenores ++;
			}
			alturaTotal += vectAltura[i];
		}
		
		alturaMedia = alturaTotal/vectAltura.length;
		
		percentualMenores = ((double)nmenores/n) * 100;
		
		System.out.printf("Altura média: %.2f%n" , alturaMedia);
		System.out.printf("Pessoa com menos de 16 anos: %.1f%%\n" , percentualMenores);
		
		for (int i =0; i<n; i++) {
			if (vectIdade[i] < 16) {
				System.out.printf("%s\n", vectNome[i]);
			}
		}
		
		sc.close();
	}
}
