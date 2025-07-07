class Mixer{
	static boolean onOrOff;
	static int currentSpeed =1;
	static int minSpeed;
	static int maxSpeed= 3;
	
public static void onOrOff(){
	if(onOrOff==false){
		onOrOff=true;
		System.out.println("the Mixer is on "+onOrOff);
		
	}else{
		onOrOff=false;
		System.out.println("the Mixer is off "+onOrOff);
	}
}
public static void increaseSpeed(){
	if(onOrOff==true){
		if(currentSpeed<maxSpeed){
			currentSpeed=currentSpeed+1;
			System.out.println("the currentSpeed of mixer is "+currentSpeed);
		}else{
			System.out.println("the Speed of the mixer has reached maxSpeed"+currentSpeed);
		}
		
	}else{
		System.out.println("plaese turn on the mixer ");
	}
}
public static void decearseSpeed(){
	// onOrOff=false;
	if(onOrOff==true){
		if(currentSpeed>minSpeed){
			currentSpeed=currentSpeed-1;
			System.out.println("the currentSpeed of mixer is "+currentSpeed);
			
		}else{
			System.out.println("the Speed of the mixer has reached minSpeed"+currentSpeed);
		}
	}else{
		System.out.println("plaese turn on the mixer ");
	}
}
}