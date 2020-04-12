package entities;

public class Employee {

	public String name;
	public double grosssalary;
	public double tax;
	
	public double salarycleam() {
		return grosssalary - tax;
		
	}
	
	public String toString() {
		return name
			   + " , R$ "
			   + String.format("%.2f", salarycleam());
	}

	public void increaseSalary(double percenta) {
		grosssalary = grosssalary * (1 + percenta/100);
		
	}
}
