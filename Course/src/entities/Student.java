package entities;

public class Student {
	
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	public String name;
	
	public void media() {
		 media = (nota1 + nota2 + nota3);
	}
	
	public void mostra() {
		if(media >= 60) {
			System.out.println("FINAL GRADE = " + String.format("%.2f", media) + "\nPASS");
		}else {
			System.out.println("FINAL GRADE = " + String.format("%.2f", media) + "\nFAILED");
			double folt = 60 - media;
			System.out.println("MISSING " + String.format("%.2f", folt) + " POINTS");
		}
	}

}
