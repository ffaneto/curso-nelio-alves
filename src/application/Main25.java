import java.util.Locale;
import java.util.Scanner;

public class Main25 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n;
		double media, soma;
		System.out.print("Quantas alunos serão digitados?");
		
		soma = 0.0;
		media = 0.0;
		n = sc.nextInt();
		
		String[] alunos = new String[n];
		double[] n1 = new double[n];
		double[] n2 = new double[n];
		
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ", i + 1);
			alunos[i] = sc.nextLine();
			n1[i] = sc.nextDouble();
			n2[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println("Alunos Aprovados: ");
		
		for (int i = 0; i < n1.length; i++) {
			soma = n1[i] + n2[i];
			media = soma / 2.0;
			if (media >=6.0) {
				System.out.println(alunos[i]);
			}
		}
				
		sc.close();
	}
}
