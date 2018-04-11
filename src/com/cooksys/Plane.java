package com.cooksys;

public class Plane extends Vehicle {
	
	private String name;
	
	public Plane(Person driver, String engine) {
		super();
		this.setDriver(driver);
		this.setEngine(engine);
	}

	@Override
	public void honk(String sound) {
		System.out.println(sound);
	}

	@Override
	public void move(Person Driver, int distance) {
		System.out.println(distance);
	}
	
	@Override
	public void stop () {
		System.out.println("Landed!");
	}

	@Override
	public String toString() {
		return this.getEngine() + " " + this.getDriver().getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
