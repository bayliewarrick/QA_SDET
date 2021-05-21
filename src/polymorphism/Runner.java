package polymorphism;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// public Motorcycle(String manufacturer, String model, int doors, boolean hasMirrors, boolean hasSaddleBags)
		//	public Airplane(String manufacturer, String model, int doors, boolean isCommercialVehicle, double wingspan)
		Motorcycle m = new Motorcycle("honda", "fast bike", 0, true, true);
		Airplane a = new Airplane("Boeing", "747", 2, true, 180.0);

		
		Garage bayliesGarage = new Garage("Baylie's Garage", "1001 Louisiana Street, Houston, TX");
		
		
		bayliesGarage.addVehicle(m);
		bayliesGarage.addVehicle(a);

		//System.out.println(bayliesGarage.getVehicles());
		bayliesGarage.printVehicles();

	}

}
