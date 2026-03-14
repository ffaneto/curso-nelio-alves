import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int mask = 0b100000;
	int n = sc.nextInt();
	
	if((n & mask) != 0) {
		System.out.println("o 6 bit é true");
	} else {
		System.out.println("o 6 bit é false");
	}
	
	sc.close();
		
	}
}
