import java.util.Locale;

public class Main02 {
	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		Locale.setDefault(Locale.US);
		System.out.printf("Raiz quadrada de "+x +" = %.7f %n",A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C); 
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		double a = 1;
		double b = 2;
		double c = 2;
		
		double delta = Math.pow(b, 2.0) + 4 * a * c;
		
		double x1 = (-b + Math.sqrt(delta) / 2.0 * a);
		double x2 = (-b - Math.sqrt(delta) / 2.0 * a);;
		
		System.out.printf("O valor de x1 = :%f %n", x1);
		System.out.printf("O valor de x2 = :%f %n", x2);
	}
}