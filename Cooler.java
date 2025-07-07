class Cooler{
	static boolean onOrOff;
	static int currentTemperature =16;
	static int minTemperature = 12;
	static int maxtemperature = 18;
	
public static void onOrOff(){
	if (onOrOff==false){
		onOrOff=true;
		System.out.println("the cooler is on "+onOrOff);
	}else{
		onOrOff=false;
		System.out.println("the Cooler is OFF" +onOrOff);
	}
}
public static void increaseTemp(){
	if (onOrOff==true){
		if(currentTemperature<maxtemperature){
			currentTemperature=currentTemperature+2;
			System.out.println("the current Temperature of the cooler is "+currentTemperature);
		}else{
			System.out.println("the Cooler ha reached maxtemperature"+currentTemperature);
		}
	}else{
		System.out.println("plaese turn on the cooler");
		
	}
}
public static void decearseTemp(){
	if(onOrOff==true){
		if(currentTemperature>minTemperature){
			currentTemperature=currentTemperature-2;
			System.out.println("the Current Temperature of the cooler is "+currentTemperature);
			
		}else{
			System.out.println("the cooler has reached min temperature");
		}
	}else{
		System.out.println("plaese turn on the cooler");
		
	}
}
}