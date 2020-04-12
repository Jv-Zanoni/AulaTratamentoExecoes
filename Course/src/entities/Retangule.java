package entities;

public class Retangule {
	
	public double width;
	public double heigth;
	public double area;
	public double perimeter;
	public double diagonal;
	
	public void area() {
		this.area = width * heigth;
	}
	public void perimeter() {
		this.perimeter = 2 * (width + heigth);
	}
	public void diagonal() {
		this.diagonal = Math.sqrt((width * width)+(heigth * heigth));
	}
	public String toString() {
		return "Area: "
				+ String.format("%.2f", area)
				+ " Perimeter: "
				+ String.format("%.2f", perimeter)
				+ " Diagonal: "
				+ String.format("%.2f", diagonal);
				
	}
}
