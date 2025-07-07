class WashingMachine{
	static boolean onOrOff;
	static int currentSpeed=2;
	static int minSpeed;
	static int maxSpeed=5;

public static void onOrOff(){
	if(onOrOff==false){
		onOrOff=true;
		System.out.println("the WashingMachine is on "+onOrOff);
	}else{
		onOrOff=false;
		System.out.println("the WashingMachine is off"+onOrOff);
		
	}
}
public static void increaseSpeed(){
	if(onOrOff=true){
		if(currentSpeed<maxSpeed){
			currentSpeed=currentSpeed+1;
			System.out.println("the current Speed Washing Machine is on "+currentSpeed);
			
		}else{
			System.out.println("the WashingMachine reached max speed "+currentSpeed);
		}
	}else{
		System.out.println("please turn the Washing Machine");
	}
}
public static void decreaseSpeed(){
	if(onOrOff=true){
		if (currentSpeed>minSpeed){
			currentSpeed=currentSpeed-1;
			System.out.println("the Speed Washing Machine is  "+currentSpeed);
		}else{
			System.out.println("the WashingMachine has is reached min Speed "+currentSpeed);
			
		}
	}else{
		System.out.println("please turn the Washing Machine");
	}
}
}