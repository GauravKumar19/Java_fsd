package newfeatures;

public class car implements vehicle {

	private String brand;

	car(String brand)
	{
	this.brand=brand;
	}
	
	@Override
	public String getBrand() {

		return brand;
	}

	@Override
	public String speedUp() {

		return "vehicle is speeding up!!";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "vehicle is speeding down!!";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
