import java.util.Locale;
import java.util.Scanner;

public class Main24 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n, maiorIdade;
		String pessoaMaisVelha;
		System.out.print("Quantas pessoas você vai digitar?");
		
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %d pessoa:%n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		maiorIdade = 0;
		pessoaMaisVelha = null;
		
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade =idades[i];
				pessoaMaisVelha = nomes[i];
			}
		}
		
		System.out.println("Pessoa Mais Velha: " + pessoaMaisVelha);
		
		/*
		 * OU int posMaior = 0; Assumimos que a pessoa mais velha está na cadeira 0
		 * 
		 * Começamos o loop do 1, já que o 0 é o nosso campeão atual for (int i = 1; i <
		 * idades.length; i++) { Se a idade da cadeira atual for maior que a idade da
		 * cadeira campeã... if (idades[i] > idades[posMaior]) { posMaior = i; //
		 * ...atualizamos o número da cadeira campeã! } }
		 * 
		 * No final, basta ir no vetor de nomes e chamar quem está na cadeira campeã
		 * System.out.println("Pessoa Mais Velha: " + nomes[posMaior]);
		 */
		
				
		sc.close();
	}
}
