class RiverRunner{
	
	public static void main(String[]river){
		
	String issalinity	=River.salinity();
	System.out.println("the River has salinity "+issalinity);
	
	String isalkalinity	=River.alkalinity();
	System.out.println("the River has alkalinity "+isalkalinity);
	
	String ishardness	=River.hardness();
	System.out.println("the River has hardness "+ishardness);
	
	String isacidity	=River.acidity();
	System.out.println("the River has acidity "+isacidity);
	
	boolean iscorrosive	=River.corrosive();
	System.out.println("the River is corrosive "+iscorrosive);
	
	

}
}