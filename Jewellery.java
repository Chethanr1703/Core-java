class Jewellery{
	
	Jewellery(){
		System.out.println("the  Constructor invoked" );
	}
	Jewellery(int jewelleryId,String jewelleryType,String jewelleryDesign,int noOfGrams,boolean isWasteagePresent
	){
						System.out.println("the Parameter Constructor invoked" );
	this.jewelleryId=jewelleryId;
	this.jewelleryType=jewelleryType;
	this.jewelleryDesign=jewelleryDesign;
	this.noOfGrams=noOfGrams;
	this.isWasteagePresent=isWasteagePresent;
	
	}
	
	int jewelleryId;
	String jewelleryType;
	String jewelleryDesign;
	int noOfGrams;
	boolean isWasteagePresent;
	
	
	public void getjewellleryinfo(){
			System.out.println("the id of the jewellery20 is " +jewelleryId);
	System.out.println("the type of the jewellery20 is :" + jewelleryType);
	System.out.println("the design of the jewellery20 is " +jewelleryDesign);
	System.out.println("the noOfGrams of the jewellery20 is " + noOfGrams);
	System.out.println("isWasteagePresent in jewellery20 is " + isWasteagePresent);
	}
}