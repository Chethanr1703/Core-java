class Ecommerce{
	int ecommerceId;
	String eName;
	int noOfCatagaries;
	Catagory catagory;
	
	Ecommerce(int ecommerceId,String name,int noOfCatagaries,Catagory catagory){
		this.ecommerceId=ecommerceId;
		this.eName=eName;
		this.noOfCatagaries=noOfCatagaries;
		this.catagory=catagory;
		
	}
	
	public void getEcommereceInfo(){
				System.out.println("fetching Ecommerece info ----");
		System.out.println("the id of the Ecommerece is :"+ecommerceId);
		System.out.println("the name of the Ecommerece : "+eName);
		System.out.println("the noOfCatagaries in the Ecommerece :"+noOfCatagaries);
		this.catagory.getCatagoryInfo();
}
}