class Catagory{
	int catagoryId;
	String cName;
	int noOfproduct;
	Product product;
	
		Catagory(int catagoryId,String name,int noOfproduct,Product product){
		this.catagoryId=catagoryId;
		this.cName=cName;
		this.noOfproduct=noOfproduct;
		this.product=product;
		
	}
	public void getCatagoryInfo(){
				System.out.println("fetching Catagory info ----");
		System.out.println("the id of the Catagory is :"+catagoryId);
		System.out.println("the name of the Catagory : "+cName);
		System.out.println("the noOfproduct in the Catagory :"+noOfproduct);
		this.product.getProductInfo();
}
	
}