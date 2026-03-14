import java.util.*;

import entities.*;

public class Main30 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
			
		List<Employee> list = new ArrayList <>();
		
		System.out.println("How many employees will be registered?");

		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d%n", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
		//	while (hasId(list, id)) {
		//		System.out.println("Id already taken, try again: ");
		//		id = sc.nextInt();
		//	}
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			list.add(new Employee(id, name, salary));
		}

		System.out.println();
		
		System.out.println("Enter the employee id that will have salary increase: ");
		
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		System.out.println("Enter the percentage: ");
		
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("List of employees:");
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		sc.close();
		
	}
}
