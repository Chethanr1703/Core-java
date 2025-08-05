class BaloonRunner{
	public static void main(String []bollon){
		
		Baloon ballon1=new Baloon();
		// ballon1.getInfo();
		System.out.println("the id of the ballon is :"+ballon1.baloonId);
		System.out.println("the Shape of the ballon is :"+ballon1.shape);
		System.out.println("the brand name of the ballon is :"+ballon1.brandName);
		System.out.println("the price of the ballon is :"+ballon1.price);
		System.out.println("the companyName of the ballon is :"+ballon1.companyName);
		System.out.println("the color of the ballon is :"+ballon1.color);
		
		
		Baloon ballon2=new Baloon(1,"Cylinder","das",150.50);
		// ballon2.getInfo();
		System.out.println("the id of the ballon is :"+ballon2.baloonId);
		System.out.println("the Shape of the ballon is :"+ballon2.shape);
		System.out.println("the brand name of the ballon is :"+ballon2.brandName);
		System.out.println("the price of the ballon is :"+ballon2.price);
		
	}
}