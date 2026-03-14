import java.util.*;


public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double minuto = sc.nextDouble();
		
		double valor = 50.00;
		
		if (minuto <100 ) {
			System.out.printf("Valor a pagar: R$%.2f" ,valor);
		} else if (minuto >100){
			valor += 2.0 *(minuto - 100);
			System.out.printf("Valor a pagar: R$%.2f" ,valor);

		}
		
		sc.close();
	}
}
