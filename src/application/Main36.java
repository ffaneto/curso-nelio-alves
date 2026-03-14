package application;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import Entities.Employee02;
import Entities.OutsourcedEmployee;

public class Main36 {
        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            List<Entities.Employee02> list = new ArrayList<>();

            System.out.print("Enter the number of employees:");
            int n = sc.nextInt();

            for (int i =1 ; i <=n ; i++) {
                System.out.printf("Employee #%d data: ", i);
                System.out.print("Outsourced (y/n)? ");
                char ch = sc.next().charAt(0);
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Hours: ");
                int hours = sc.nextInt();
                System.out.println("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                if (ch == 'y') {
                    System.out.println("Additional charge: ");
                    double additionalCharge = sc.nextDouble();
                    list.add(new Entities.OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
                } else {
                    list.add(new Entities.Employee02(name, hours, valuePerHour));
                }
            }

            System.out.println();

            System.out.println("PAYMENTS:");

            for(Entities.Employee02 emp : list) {
                System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
            }

            sc.close();
        }
}
