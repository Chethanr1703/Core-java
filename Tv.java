class Tv{
	static boolean onOrOff ;
	static int currentVolume = 4;
	static int maxVolume = 10;
	static int minVolume;

public static void onOrOff(){
	if (onOrOff == false){
		onOrOff=true;
		System.out.println("the TV is "+onOrOff);
	}else{
		onOrOff=false;
		System.out.println("the TV is "+onOrOff);
	}
}
public static void decearseVolume(){
	if(onOrOff==true){
		if(currentVolume>minVolume){
			currentVolume=currentVolume-2;
			System.out.println("the currentVolume of the TV is "+currentVolume);
			
		}else{
			System.out.println("the voluem of the tV is reached minVolume");
		}
	}else{
		System.out.println("please trun the TV ");
	}
}

public static void increaseVolume(){
	if (onOrOff==true){
		if(currentVolume<maxVolume){
			currentVolume=currentVolume+2;
			System.out.println("the Volume of the TV is "+currentVolume);
			
		}else{
			System.out.println("the Volume has Been reached MAX");
		}
	}
		else{
		System.out.println("please trun the TV ");
	}
	}
}