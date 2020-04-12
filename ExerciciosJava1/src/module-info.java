
import java.util.Scanner;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		
		int numero1, numero2, x;
		
		numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero:");
		
		numero2 = sc.nextInt();
		
		x = numero1 + numero2;
		
		System.out.println("A soma dos seus valores é: " + x);

		sc.close();
	}

}
