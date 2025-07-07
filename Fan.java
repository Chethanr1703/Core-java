class Fan{
	static	boolean	isOn;
	static int maxSpeed =4 ;
	static int currentSpeed = 1;
	static int minSpeed;
 public static void onOrOff(){
		if(isOn ==false){
			isOn = true;
		System.out.println("the Fan is On " + isOn);
		}
		else{
			isOn=false;
			System.out.println(" the Fan is off");
		}
 }
 public static void increaseSpeed(){
	 if (isOn==true){
		 if(currentSpeed<maxSpeed){
			 currentSpeed=currentSpeed + 1;
			 System.out.println("the speed of the fan is "+currentSpeed);
		 }else{
			 System.out.println("the fan Speed has been reached max " +currentSpeed);
		 }
		 
	 }
	 else{
		 System.out.println("please turn on the Fan");
	 }
 }
 
 public static void decreaseSpeed(){
	 if (isOn== true){
		 if (currentSpeed>minSpeed){
			 currentSpeed=currentSpeed-1;
			 System.out.println("the Current Speed of the Fan is "+currentSpeed);
			 
		 }
		 else{
			 System.out.println("the Speed of the fan is " +currentSpeed);
			 
		 }
	 }
	  else{
		 System.out.println("please turn on the Fan");
	 }
 }
 
 }