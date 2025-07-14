class SignalRunner{
	public static void main(String []SR)
	{
	String	isRed=Signal.redColor();
	System.out.println("isRed indicate : "+isRed);
	
	String	isGreen=Signal.greenColor();
	System.out.println("green indicate : "+isGreen);
	
	String	isYellow=Signal.yellowColor();
	System.out.println("yellow indicate : "+isYellow);
	
	
	int	isDuration=Signal.givenDuration();
	System.out.println("Duration of the signal  : "+isDuration+"seconds");
	
	
	String	isPurpose=Signal.mainPurpose();
	System.out.println("the Main Purpose of the Signal : "+isPurpose);
	
		
		
	}
}