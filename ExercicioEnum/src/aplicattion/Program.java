package aplicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Client;
import entites.Order;
import entites.OrderItem;
import entites.Product;
import entites.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Cliente Data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthdate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthdate);
		
		System.out.println("\nEnter Order Data");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());;
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("\nHow many items to this order? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("\nEnter #" + i + " item data");
			System.out.print("Product Name: ");
			sc.nextLine();
			String productname = sc.nextLine();
			System.out.print("Product Price: ");
			double productprice = sc.nextDouble();
			
			Product product = new Product(productname, productprice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderitem = new OrderItem(quantity, productprice, product);
			
			order.addItem(orderitem);
			
		}
		
		System.out.println("\nOrder Sumary:");
		System.out.println(order);
		
		sc.close();
	}

}
