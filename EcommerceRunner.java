class EcommerceRunner{
	public static void main(String []er){
		
		
		Product product1 =new Product(152,"pen",15);
		
		Catagory catagory1 =new Catagory(101,"Stationary",15,product1);
		
		Ecommerce ecommerce1 =new Ecommerce(1012,"flipcart",20,catagory1);
		ecommerce1.getEcommereceInfo();
		
	}
}