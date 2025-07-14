class MakeUpKitRunner{

public static void main(String[]mr){
	String isversatility	=MakeUpKit.versatility();
	System.out.println("the MakeUpKit has versatility "+isversatility);
	
	String isquality	=MakeUpKit.quality();
	System.out.println("the MakeUpKit has quality "+isquality);
	
	String isskinCompatibility	=MakeUpKit.skinCompatibility();
	System.out.println("the MakeUpKit has skinCompatibility "+isskinCompatibility);
	
	String isenhancesFeatures	=MakeUpKit.enhancesFeatures();
	System.out.println("the MakeUpKit has enhancesFeatures "+isenhancesFeatures);
	
	boolean istravelFriendly	=MakeUpKit.travelFriendly();
	System.out.println("the MakeUpKit is travelFriendly "+istravelFriendly);
	
	

}
}