class Tomato{
	int id;
	String type;
	double price;
	String quality;
	boolean ischemicalFree;
	String size;
	
	
	Tomato(){
		this(704);
		System.out.println("Constructor with zero parameter is invoked");
		
	}
	Tomato(int id){
		this("natural",200.0);
		this.id=id;
		System.out.println("Constructor with one parameter is invoked");
		
	}
	Tomato(String type,double price){
		this("good",true);
		this.type=type;
		this.price=price;
		System.out.println("Constructor with two//*** parameter is invoked");
		
	}
	Tomato(String quality,boolean ischemicalFree){
		this(102,"natural",20.0,"good",true,"medium");
		
		this.quality=quality;
		this.ischemicalFree=ischemicalFree;
		System.out.println("Constructor with two parameter is invoked");
		
	}
	Tomato(String size){
		this(102,"natural",20.0,"good",true,"medium");
		this.size=size;
		System.out.println("Constructor with one parameter is invoked");
		
	}
	Tomato(int id,String type,double price, String quality, boolean ischemicalFree,String size){
		this.id=id;
		this.type=type;
		this.price=price;
		this.quality=quality;
		this.ischemicalFree=ischemicalFree;
		this.size=size;
		System.out.println("Constructor with all parameter is invoked");
		
	}
	public void display(){
		System.out.println("the id of the tomato is :"+this.id);
		System.out.println("the type of the tomato is :"+this.type);
		System.out.println("the price of the tomato is :"+this.price);
		System.out.println("the quality of the tomato is :"+this.quality);
		System.out.println("the ischemicalFree of the tomato is :"+this.ischemicalFree);
		
		System.out.println("the size of the tomato is :"+this.size);
		
		System.out.println("************************************************");
		
		
		
	}
}