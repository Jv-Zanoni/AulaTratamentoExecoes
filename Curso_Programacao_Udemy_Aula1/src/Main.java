import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu salário:");
		
		double imposto = 0;
		double salario;
		
		salario = sc.nextDouble();
				
		if(salario <= 2000.00)
		{
			imposto = 0;
		} else {
			if(salario > 2000.00 && salario <= 3000.00) {
				imposto = (salario - 2000.00) * 0.08;
			}else {
				if(salario > 3000.00 && salario <= 4500.00) {
					imposto = 80 + ((salario - 3000.00) * 0.18);					
				}else {
					imposto = 80 + 270 + ((salario - 4500) * 0.28);
				}
			}
		}
		
		System.out.printf("O valor do imposto a ser pago é: %.2f.", imposto);

		sc.close();
	}

}
