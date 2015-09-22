package AbstractFactory;

import FabricaConcreta.LuxuryVehicleFactory;
import FabricaConcreta.NonLuxuryVehicleFactory;
import ProductoA.Car;
import ProductoB.SUV;

public abstract class VehicleFactory {
	//Se declaran constantes
	public static final String LUXURY_VEHICLE = "Luxury";
	public static final String NON_LUXURY_VEHICLE = "Non-Luxury";
	
	//Define un método de creación de objetos tipo Car en forma abstracta
	public abstract Car getCar();
	
	//Define un método de creación de objetos tipo SUV en forma abstracta
	public abstract SUV getSUV();
	
	//Método de clase que determina la fábrica concreta del tipo suministrado en la variable type
	public static VehicleFactory getVehicleFactory(String type) 
	{
		if (type.equals(VehicleFactory.LUXURY_VEHICLE))
			return new LuxuryVehicleFactory();
	
		if (type.equals(VehicleFactory.NON_LUXURY_VEHICLE))
			return new NonLuxuryVehicleFactory();
		return new LuxuryVehicleFactory();
	}
}
