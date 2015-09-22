package FabricaConcreta;

import AbstractFactory.VehicleFactory;
import ProductoA.Car;
import ProductoAConcreto.NonLuxuryCar;
import ProductoB.SUV;
import ProductoBConcreto.NonLuxurySUV;

public class NonLuxuryVehicleFactory extends VehicleFactory{
	public Car getCar() {
		return new NonLuxuryCar("NL-C");
	}
	
	public SUV getSUV() {
		return new NonLuxurySUV("NL-S");
	}
}
