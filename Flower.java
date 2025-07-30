class Flower{
	int flowerId;
	String flowerName[];
	String flowerColor;
	int price;
	boolean isUsedForFood;
	
	
		Flower(){
		System.out.println("the  Constructor invoked" );
	}
	Flower(int flowerId,String  flowerName[]){
		System.out.println("the Parameter Constructor invoked" );
		this.flowerId=flowerId;
		this.flowerName=flowerName;
		
	}
	
	Flower(String flowerColor,int price){
	this.flowerColor=flowerColor;
		this.price=price;
		
	
	}
	
	Flower( boolean isUsedForFood){
	
		this.isUsedForFood=isUsedForFood;
	
	}
	
	
	
	public void getFlowerinfo(){
		
		System.out.println("the id of flower1 is "+flowerId);
		System.out.println("the flowerName of flower1 is "+flowerName);
		System.out.println("the flowerColor of flower1 is "+flowerColor);
		System.out.println("the price of flower1 is "+price);
		System.out.println("the isUsedForFood of flower1 is "+isUsedForFood);
		
	}
}