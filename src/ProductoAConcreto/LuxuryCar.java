package ProductoAConcreto;

import ProductoA.Car;

public class LuxuryCar implements Car{
	private String name;
	
	public LuxuryCar (String cName){
		name = cName;
	}
	
	@Override
	public String getCarName() {
		return name;
	}

	@Override
	public String getCarFeatures() {
		// TODO Auto-generated method stub
		return "Luxury Car Features";
	}


}
