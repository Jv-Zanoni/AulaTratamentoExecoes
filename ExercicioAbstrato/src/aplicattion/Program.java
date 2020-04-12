package aplicattion;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FisicPerson;
import entities.JuridicPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for( int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Tax payer #" + i + " data");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualRend = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthSpeding = sc.nextDouble();
				list.add(new FisicPerson(name, anualRend, healthSpeding));
			}else {
				System.out.print("Number of employees: ");
				int employee = sc.nextInt();
				list.add(new JuridicPerson(name, anualRend, employee));
			}
		}
			
		double total = 0;
		System.out.println("\nTAXES PAID");
		for(Person person : list) {
			System.out.printf(person.getName() + ": R$ " + String.format("%.2f\n", person.impostoCalc()));
			total += person.impostoCalc();
		}
		System.out.println("\nTOTAL TAXES: " + String.format("%.2f\n", total));
		sc.close();
		
	}
}
