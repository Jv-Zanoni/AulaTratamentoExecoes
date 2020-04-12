package entities;

public class Accont {
	
	private String name;
	private double captal;
	private int number;
	
	
	public Accont(String name, int number , double captal) {
		this.name = name;
		deposit(captal);
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCaptal() {
		return captal;
	}

	public int getNumber() {
		return number;
	}

	public String toString() {
		return name + " - " + number + " - R$" + String.format("%.2f", captal);
		
	}
	public void withdrawal(double money) {
		this.captal = this.captal - money - 5;
	}
	public void deposit(double money) {
		this.captal += money;
	}
	
}
