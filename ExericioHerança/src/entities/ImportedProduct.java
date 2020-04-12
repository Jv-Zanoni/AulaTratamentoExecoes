package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;

	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return price = price + customsFee;
	}
	
	@Override
	public String toString() {
		return name + " R$ " + String.format("%.2f", totalPrice()) + " (Customs Fee: R$ " + String.format("%.2f", this.customsFee) + ")";
	}

}
