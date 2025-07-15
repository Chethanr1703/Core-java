class DoorDashRunner{
public static void main(String []ddr){
	String shakeName ="Chocolate Almond";
	
	double price = DoorDash.getPrice(shakeName);
	System.out.println("the price of "+shakeName+" is :"+price);
	
	int quantity = 5;
	double priceWithQuantity = DoorDash.getPrice(shakeName,quantity);
	System.out.println("the price of "+shakeName+"with Quantity"+quantity+" is :"+priceWithQuantity);

}}