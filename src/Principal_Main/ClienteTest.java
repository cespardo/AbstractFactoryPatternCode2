package Principal_Main;

import AbstractFactory.VehicleFactory;
import ProductoA.Car;
import ProductoB.SUV;

public class ClienteTest {

	public static void main(String[] args) {
		String vhCategory = "Non-Luxury"; // o se puede colocar Luxury
		
		String vhType = "Suv"; // o se puede colocar Car
		
		String searchResult = "";

		// Obtiene la fábrica concreta en vf
		VehicleFactory vf = VehicleFactory.getVehicleFactory(vhCategory);

		// Obtiene un Car de lujo o no lujo dependiendo de la fábrica y muestra en pantalla la información
		Car c = vf.getCar();
		
		searchResult = "Name: " + c.getCarName() + " Features: " + c.getCarFeatures();
		System.out.println(searchResult);
		
		//Obtiene un SUV de lujo o no lujo dependiendo de la fábrica y muestra en pantalla la información
		SUV s = vf.getSUV();
		
		searchResult = "Name: " + s.getSUVName() + " Features: "+ s.getSUVFeatures();
		System.out.println(searchResult);
		
	}

}
