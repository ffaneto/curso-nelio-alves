import java.io.*;
import java.util.StringTokenizer;


public class Main06 {
	public static void main(String[] args) throws IOException {
		
		// Leitor do teclado e Coloca o buffer em volta dele pra ganhar velocidade
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Digite com espaço");
				
		String linhaComEspaco = br.readLine();
		StringTokenizer st = new StringTokenizer(linhaComEspaco);
		
		int soma = 0;
		int contador = 0;
		
		while (st.hasMoreTokens()) {
			try {
				int valor = Integer.parseInt(st.nextToken());
				soma +=valor;
				contador++;
				System.out.println("Número: "+ contador + " processando:" + valor);
			} catch (NumberFormatException e) {
				System.out.println("Um dos itens não era número");
			}
			
		}
		System.out.println("Total de números válidos: "+ contador);
		System.out.println("Soma final: "+ soma);
	}
}
