package entities;

public class FisicPerson extends Person {
	
	private Double healthSpeding;

	public FisicPerson() {
		super();
	}
	
	public FisicPerson(String name, Double anualRend, Double healthSpeding) {
		super(name, anualRend);
		this.healthSpeding = healthSpeding;
	}

	public Double getHealthSpeding() {
		return healthSpeding;
	}

	public void setHealthSpeding(Double healthSpeding) {
		this.healthSpeding = healthSpeding;
	}

	@Override
	public double impostoCalc() {
		double impost = 0;
		if(anualRend < 20000.00) {
			impost = anualRend * 0.15;
		}else {
			impost = anualRend * 0.25 - healthSpeding * 0.50;
		}
		return impost;		
	}
	
	}
