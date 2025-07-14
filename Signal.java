class Signal{
	static String red;
	static String green;
	static String yellow;
	static int duration;
	static String purpose;
	
	public static String redColor(){
		red ="STOP the Vehicle";
		return red;
	}
	public static String greenColor(){
		green = "MOVE the vehicle";
		return green;
	}
	public static String yellowColor(){
		yellow = "READY to MOVE";
		return yellow;
	}
	public static int givenDuration(){
		duration = 10;
		return duration;
	}
	public static String mainPurpose(){
		purpose="To avoid the accidents";
		return purpose;
	}
}