package ProductoBConcreto;

import ProductoB.SUV;

public class LuxurySUV implements SUV{

	private String name;
	public LuxurySUV(String sName) {
		name = sName;
	}
	
	public String getSUVName() {
		return name;
	}
	
	public String getSUVFeatures() {
		return "Luxury SUV Features";
	}

}
