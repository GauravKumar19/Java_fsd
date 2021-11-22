package newfeatures;

public interface vehicle {

	//By Default all are abstract methods
	String getBrand();
	String speedUp();
	String slowDown();
	
	// Any non-abstract method is declare as Default to add any new feature
	default String turnAlarmOn()
	{
	return "Turning the Vehicle Alarm ON.";
	}
	
	default String turnAlarmoff()
	{
	return "Turning the Vehicle Alarm OFF.";
	}
	
	static int getHorsePower(int rpm,int torque)
	{
	return (rpm*torque)/5252;
	}
}
