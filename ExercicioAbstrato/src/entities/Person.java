package entities;

public abstract class Person {

	protected String name;
	protected Double anualRend;
	
	public Person() {
	}
	
	public Person(String name, Double anualRend) {
		this.name = name;
		this.anualRend = anualRend;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getAnualRend() {
		return anualRend;
	}
	
	public void setAnualRend(Double anualRend) {
		this.anualRend = anualRend;
	}
	
	public abstract double impostoCalc();
	
}