class GoldRunner{
	public static void main(String [] gold){
		
		String isCarat= Gold.givenCarat();
		System.out.println("the Carat ofthe gold :"+isCarat);
		
		int isPrice = Gold.givenPrice();
		System.out.println("the price of the gold for 1g:"+isPrice+"Rupees");
		
		String	isColor=Gold.givenColor();
		System.out.println("the color of the gold :"+isColor);
		
		double	isMeltingPoint=Gold.givenMeltingPoint();
		System.out.println("the Melting Point of the gold :"+isMeltingPoint);
		
		String	isDensity=Gold.givenDensity();
		System.out.println("the Density of the gold :"+isDensity);
		
		
	}
}