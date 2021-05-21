package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	//attributes
	private String name;
	private String address;
	
	List<Object> thisGarage = new ArrayList<Object>();

	//constructor
	public Garage(String name, String address) {
		this.setName(name);
		this.setAddress(address);
	}
	
	
	//methods
	public void addVehicle(Object vehicle) {
		thisGarage.add(vehicle);
	}
	
	public void printVehicles() {
		for(Object vehicle : thisGarage) {
			System.out.println(vehicle);
		}
	}
	
	
	//getters & setters
	public List<Object> getVehicles() {
		return thisGarage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
