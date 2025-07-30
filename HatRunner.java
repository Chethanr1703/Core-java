class HatRunner{
	public static void main(String[]cr){
		
	String	hatType[]={"causual","police hat","Sports","horse"};
        Hat hat1 = new Hat(1, "Cloth");
		System.out.println("the id  is  "+hat1.hatId);
		System.out.println("the marterial type  is  "+hat1.hatMaterialType);
		
		
        Hat hat2 = new Hat(hatType);
		System.out.println("the hatType is ");
		for(String hat :hatType){
			System.out.println(hat);
		}
		
		
        Hat hat3 = new Hat( "Blue", true);
		System.out.println("the color  is  "+hat1.hatColor);
		System.out.println("the isAdjustable  is  "+hat1.isAdjustable);
		
		
}}
		