package FabricaConcreta;

import AbstractFactory.VehicleFactory;
import ProductoA.Car;
import ProductoAConcreto.LuxuryCar;
import ProductoB.SUV;
import ProductoBConcreto.LuxurySUV;

public class LuxuryVehicleFactory extends VehicleFactory{
	public Car getCar() {
		return new LuxuryCar("L-C");
	}
	
	public SUV getSUV() {
		return new LuxurySUV("L-S");
	}
}
