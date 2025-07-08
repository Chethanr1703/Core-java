class Projector{
	static boolean onOrOff;
	static int currentVolume=3;
	static int maxVolume=5;
	static int minVolume;

public static void onOrOff(){
	if(onOrOff==false){
		onOrOff=true;
		System.out.println("the Projector is "+onOrOff);
	}else{
		onOrOff=false;
		System.out.println("the projector is "+onOrOff);
	}
}
public static void increaseVolume(){
	if(onOrOff==true){
		if(currentVolume<maxVolume){
			currentVolume=currentVolume+1;
		System.out.println("the current Volume is projector  "+currentVolume);
		
	}else{
		System.out.println("the currentVolume has reached is maxVolume "+currentVolume);
	}
	}else{
		System.out.println("please turn on projector is ");
	}
}
public static void decreaseSpeed(){
	if(onOrOff==true){
		if (currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("the currentVolume of the projector "+currentVolume);
		}else{
			System.out.println("the volume of the projector has reached min  "+currentVolume);
		}
	}else{
		System.out.println("please turn on projector is ");
	}
}
}