class Gun{
	int id;
	String type;
	int weight;
	int noOfBullets;
	boolean islienced;
	boolean ismanually;
	
	 void Gun(){
		this(501);
		System.out.println("Constructor with zero parameter is invoked");
		
		
	}
	Gun(int id){
		this("ak47",2);
	this.id=id;
		System.out.println("Constructor with one parameter is invoked");
	
		
	}
	Gun(String type, int weight){
		this(47,true,true);
	this.type=type;
	this.weight=weight;
		System.out.println("Constructor with two parameter is invoked");
	
		
	}
	Gun(int noOfBullets,boolean islienced,boolean ismanually){
		this(true);
	this.noOfBullets=noOfBullets;
	this.islienced=islienced;
	this.ismanually=ismanually;
		System.out.println("Constructor with three parameter is invoked");
	
	}	
		

	Gun(boolean ismanually){
		this(501,"ak",4,47,true,true);
	this.ismanually=ismanually;
		System.out.println("Constructor with one parameter is invoked");
	
		
	}
	
	Gun(int id ,String type, int weight,int noOfBullets,boolean islienced,boolean ismanually){
	this.id=id;
	this.type=type;
	this.weight=weight;
	this.noOfBullets=noOfBullets;
	this.islienced=islienced;
	this.ismanually=ismanually;
	
		System.out.println("Constructor with all parameter is invoked");
	
	}
	public void display(){
		System.out.println("the id of the gun is :"+this.id);
		System.out.println("the type of the gun is :"+this.type);
		System.out.println("the weight of the gun is :"+this.weight);
		System.out.println("the noOfBullets of the gun is :"+this.noOfBullets);
		System.out.println("the islienced of the gun is :"+this.islienced);
		
		System.out.println("the ismanually of the gun is :"+this.ismanually);
		
		System.out.println("************************************************");
		
		
		
	}
	
}