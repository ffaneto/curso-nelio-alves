
public class Main05 {
	public static void main(String[] args) {
		// Sintaxe:
		// (condição) ? valor_se_verdadeiro : valor_se_falso
		// (2 > 4) ? cu : mole - > mole
		// (10 !=3) ? sim : não - > sim
		
		//	double preco = 34.5;
		//double desconto;
		
		// Com If e Else
		//if (preco < 20) {
		//	desconto = preco * 0.1;
		//} else {
		//	desconto = preco * 0.05;
		//}
		
		// Ternário:
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		System.out.println(preco - desconto);
		
	}
}
