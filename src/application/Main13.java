import entities.Triangle;
import java.util.*;

public class Main13 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Sem POO:
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X:");
		
		double ax = sc.nextDouble();
		double bx = sc.nextDouble();
		double cx = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");

		double ay = sc2.nextDouble();
		double by = sc2.nextDouble();
		double cy = sc2.nextDouble();
		
		double px = (ax + bx + cx) /2;
		double py = (ay + by + cy) /2;
		
		double opx = px *(px-ax) * (px-bx) * (px-cx);
		double opy = py *(py-ay) * (py-by) * (py-cy);
		
		double areaX = Math.sqrt(opx);
		double areaY = Math.sqrt(opy);
		
		System.out.printf("Triangle X area: $.4f%n", areaX);
		System.out.printf("Triangle Y area: $.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: " + areaX);
		} else {
			System.out.println("Larger area: " + areaY);
		*/	
		
		// Com POO: ]
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX= x.area();
		
		double areaY= y.area(); 

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: " + areaX);
		} else {
			System.out.println("Larger area: " + areaY);
		}
		
		sc.close();
		}
	}
