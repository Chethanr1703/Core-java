class JewelleryRunner {
	public static void main(String[]cr){
	String name[]={"ring","chain","blazlite"};
	Jewellery jewellery1 = new Jewellery(10001, "gold");
	System.out.println("the jewelleryId is "+jewellery1.jewelleryId);
	System.out.println("the jewelleryType is "+jewellery1.jewelleryType);

	
	Jewellery jewellery2 = new Jewellery( "fashion", 10);
	System.out.println("the jewelleryDesign is "+jewellery2.jewelleryDesign);
	System.out.println("the noOfGrams is "+jewellery2.noOfGrams);
	
	
	
	Jewellery jewellery3 = new Jewellery( true,name);
	System.out.println("the isWasteagePresent is "+jewellery3.isWasteagePresent);
	
	System.out.println("the name is ");
		for(String type :name){
			System.out.println(type);
		}
}}
