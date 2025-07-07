class AC{
	static boolean isOnorOFF ;
	static int currentTemp = 14;
	static int minTemp = 10;
	static int maxTemp = 20;

public static void onOrOff(){
	if (isOnorOFF == false){
		isOnorOFF= true;
		System.out.println("the AC is turned On " +isOnorOFF);
		}
	else{
	System.out.println("the AC is already On " );
	
	}
}
public static void increaseTemp(){
	if (isOnorOFF == true){
		if(currentTemp<maxTemp){
			currentTemp=currentTemp+2;
			System.out.println("the temperature of the AC is  "+currentTemp);
			}else{
			System.out.println("the Temperatue of the Ac is reached MAX");
			}
		}else{
			System.out.println("Please Turn on the AC ");
			}
	
	}
	public static void decreaseTemp(){
	if (isOnorOFF== true){
		if (currentTemp>minTemp){
			currentTemp=currentTemp-2;
			System.out.println("the temperature of the AC is  "+currentTemp);
			}
			else{
			System.out.println("the temperature of the AC reached minTemp  ");
			}
			}
	else{
			System.out.println("Please Turn on the AC ");
			}
	}
	
}
	
	
	
	