class TyreRunner{
	
	public static void main(String[]tr){
		
	int isloadCapacity	=Tyre.loadCapacity();
	System.out.println("the Tyre has loadCapacity "+isloadCapacity+"kg");
	
	String isdurability	=Tyre.durability();
	System.out.println("the Tyre has durability "+isdurability);
	
	String ismounting	=Tyre.mounting();
	System.out.println("the Tyre has mounting "+ismounting);
	
	String isshockAbsorption	=Tyre.shockAbsorption();
	System.out.println("the Tyre has shockAbsorption "+isshockAbsorption);
	
	boolean iswearResistance	=Tyre.wearResistance();
	System.out.println("the Tyre is wearResistance "+iswearResistance);
	
	

}
}