package uk.co.ltw.service.kart.model;

public class Kart {
	
	private final Integer id;
	private final String name;
	private final String make;
	private final String chassisNumber;
	
	public Kart(Integer id, String name, String make, String chassisNumber) {
		super();
		this.id = id;
		this.name = name;
		this.make = make;
		this.chassisNumber = chassisNumber;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMake() {
		return make;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}
	
	
	
	

}
