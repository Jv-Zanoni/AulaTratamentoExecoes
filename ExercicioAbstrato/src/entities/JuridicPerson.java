package entities;

public class JuridicPerson extends Person {

	private Integer employee;
	
	public JuridicPerson() {
		super();
	}
	
	public JuridicPerson(String name, Double anualRend, Integer employee) {
		super(name, anualRend);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	@Override
	public double impostoCalc() {
		double impost = 0;
		if(employee <= 10) {
			impost = anualRend * 0.16;
		}else {
			impost = anualRend * 0.14;
		}
		return impost;
	}
	
}
