class Product{
	int productId;
	String name;
	double price;
	
	Product(int productId,String name,double price){
		this.productId=productId;
		this.name=name;
		this.price=price;
		
		
	}
	public void getProductInfo(){
				System.out.println("fetching Product info ----");
		System.out.println("the id of the Product is :"+productId);
		System.out.println("the name of the Product : "+name);
		System.out.println("the price in the Product :"+price);
		
}
	
	
}