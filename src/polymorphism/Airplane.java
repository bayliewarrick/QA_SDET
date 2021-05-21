package polymorphism;

public class Airplane extends Vehicle {
	private boolean isCommercialVehicle;
	private double wingspan;

	public Airplane(String manufacturer, String model, int doors, boolean isCommercialVehicle, double wingspan) {
		super(manufacturer, model, doors);
		
		this.isCommercialVehicle = isCommercialVehicle;
		this.wingspan = wingspan;
	}
	
	public boolean isCommercialVehicle() {
		return isCommercialVehicle;
	}
	
	public double wingspan() {
		return wingspan;
	}
	

}