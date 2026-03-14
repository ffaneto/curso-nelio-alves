import java.util.Locale;
import java.util.Scanner;

public class Main27 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("How many rooms will be rented?");

		n = sc.nextInt();
		
		sc.nextLine();

		String[] nomes = new String[10];
		String[] emails = new String[10];

		for (int i = 0; i < n; i++) {
			System.out.printf("Rent #%d:%n", i + 1);
			System.out.print("Name: ");
			String nomeDigitado = sc.nextLine();
			System.out.print("Email: ");
			String emailDigitado = sc.nextLine();
			System.out.print("Room: ");
			int numeroDoQuarto = sc.nextInt();
			sc.nextLine();
			nomes[numeroDoQuarto] = nomeDigitado;
			emails[numeroDoQuarto] = emailDigitado;
		}

		System.out.println("Busy rooms:");

		for (int i = 0; i < 10; i++) {
			if (nomes[i] != null) {
				System.out.printf("%d: %s, %s%n", i, nomes[i], emails[i]);
			}
		}
		sc.close();
	}

}
