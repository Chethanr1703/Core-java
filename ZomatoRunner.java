class ZomatoRunner{
	public static void main(String []Zr){
		String foodName ="Chicken Briyani";
		double price =Zomato.getFoodPrice(foodName);
		System.out.println("the price of the "+foodName+ " is  "+price);
		
		int quantityOfFood = 3;
		double priceWithQuanity =Zomato.getFoodPrice(foodName,quantityOfFood);
		System.out.println("the price is "+foodName+" with the Quantity "+quantityOfFood+" is"+priceWithQuanity);
	}
}