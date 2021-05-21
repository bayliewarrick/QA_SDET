package polymorphism;

public abstract class Vehicle {
	

	private boolean hasGas;
	private int doors;
	private String manufacturer;
	private String model;
	

	public Vehicle(String manufacturer, String model, int doors) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.doors = doors;
		this.hasGas = true;
		
	}
	
	public boolean hasGas() {
		return hasGas;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Vehicle [hasGas=" + hasGas + ", doors=" + doors + ", manufacturer=" + manufacturer + ", model=" + model
				+ "]";
	}
	
	
}