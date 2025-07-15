class UberEatesRunner{
	
		public static void main(String []veg){
		
		String jiuceName ="PineApple";
	double price = UberEates.getPrice(jiuceName);
	
	System.out.println("the price  of juice is :"+price);
	
	
	int quantity= 3;
		double withquantity = UberEates.getPrice(jiuceName,quantity);
		
		System.out.println("the price  of "+jiuceName+" with quantity "+quantity+ " is :"+withquantity);
	
}


}