class DisneyLandRunner{
	
	
	public static void main(String[]tr){
		
	String isthemedLands	=DisneyLand.themedLands();
	System.out.println("the DisneyLand has themedLands "+isthemedLands+"kg");
	
	String isattractionsandEntertainment	=DisneyLand.attractionsandEntertainment();
	System.out.println("the DisneyLand has attractionsandEntertainment "+isattractionsandEntertainment);
	
	String ishotels	=DisneyLand.hotels();
	System.out.println("the DisneyLand has hotels "+ishotels);
	
	String isshopping	=DisneyLand.shopping();
	System.out.println("the DisneyLand has shopping "+isshopping);
	
	String isdining	=DisneyLand.dining();
	System.out.println("the DisneyLand is dining "+isdining);
	
	


}
}