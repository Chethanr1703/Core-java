class SwiggyRunner{
	public static void main(String []sr){
		
		String foodName ="Mutter Panner";
		double isfood	=Swiggy.getFoodPrice(foodName);
		System.out.println("the price of the "+foodName+" is "+isfood);
		
		int quantity= 4;
		double isfoodWithquantity	=Swiggy.getFoodPrice(foodName,quantity);
		System.out.println("the price of the "+foodName+"with Quantity of "+quantity+" is "+isfoodWithquantity);
		
	}
}