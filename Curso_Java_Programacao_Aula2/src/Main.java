import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seus 3 n�meros:");
		
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
		
		System.out.printf("O valor da �rea do triangulo A-C �: %.3f.\n", areat);
		System.out.printf("O valor da �rea do circulo C �: %.3f.\n", areac);
		System.out.printf("O valor da �rea do trap�zio A-B-C �: %.3f.\n", areaTr);
		System.out.printf("O valor da �rea do quadrado B �: %.3f.\n", areaq);
		System.out.printf("O valor da �rea do ret�ngulo A-B �: %.3f.\n", arear);

		sc.close();
	}

}
