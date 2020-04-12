import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seus 3 números:");
		
		double  A, B, C, areat, areac, areaTr, areaq, arear;
		String s1, s2, s3;
		
		A = sc.nextDouble();
		s1 = sc.nextLine();
		B = sc.nextDouble();
		s2 = sc.nextLine();
		C = sc.nextDouble();
		s3 = sc.nextLine();
		
		areat = A * C / 2.00;
		areac = 3.14159 * Math.pow(C, 2.00);
		areaTr = (A+B)*C / 2.00;
		areaq = Math.pow(B, 2.00);
		arear = A*B;
		
		System.out.printf("O valor da Área do triangulo A-C é: %.3f.\n", areat);
		System.out.printf("O valor da Área do circulo C é: %.3f.\n", areac);
		System.out.printf("O valor da Área do trapézio A-B-C é: %.3f.\n", areaTr);
		System.out.printf("O valor da Área do quadrado B é: %.3f.\n", areaq);
		System.out.printf("O valor da Área do retângulo A-B é: %.3f.\n", arear);

		sc.close();
	}

}
