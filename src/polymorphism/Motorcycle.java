package polymorphism;

public class Motorcycle extends Vehicle {
	private boolean hasSaddleBags;
	private boolean hasMirrors;

	public Motorcycle(String manufacturer, String model, int doors, boolean hasMirrors, boolean hasSaddleBags) {
		super(manufacturer, model, doors);
		
		this.hasMirrors = hasMirrors;
		this.hasSaddleBags = hasSaddleBags;
	}
	
	public boolean getMirrors() {
		return hasMirrors;
	}
	
	public boolean getSaddleBags() {
		return hasSaddleBags;
	}
	

}