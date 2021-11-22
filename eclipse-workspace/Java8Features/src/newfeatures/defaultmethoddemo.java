package newfeatures;

public class defaultmethoddemo {

	public static void main(String[] args) {
		
		vehicle car = new car("BMW");
		
		//Invoke overriden methods
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		
		//Invoke Default methods
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmoff());

		//Invoke Ststic Methods
		System.out.println(vehicle.getHorsePower(2500,400));

	}

}
