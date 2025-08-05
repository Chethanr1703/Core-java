class Color{
	int id;
	String type;
	int noOfcolor;
	double price;
	boolean isChemicalFree;
	boolean isHealthly;
	
	Color(){
		this(1000002);
		System.out.println("Constructor with zero parameter is invoked");
		
	}
	Color(int id){
		this(10001,"chemical");
		this.id=id;
		System.out.println("Constructor with one parameter is invoked");
		
	}
	Color(int id ,String type){
		this(6,60.0,true);
		this.id=id;
	this.type=type;
		System.out.println("Constructor with two parameter is invoked");
	
	}
	Color(int noOfcolor,double price,boolean isChemicalFree){
		this(1,"natural",7,50.0,true,true);
		this.noOfcolor=noOfcolor;
	this.price=price;
	this.isChemicalFree=isChemicalFree;
		System.out.println("Constructor with three parameter is invoked");
	
		
	}
	Color(boolean isHealthly){
		this(1,"natural",7,50.0,true,true);
	this.isHealthly=isHealthly;
		System.out.println("Constructor with one***//// parameter is invoked");
		
	}
	Color(int id,String type,int noOfcolor,double price, boolean isChemicalFree, boolean isHealthly){
	this.id=id;
	this.type=type;
	this.noOfcolor=noOfcolor;
	this.price=price;
	this.isChemicalFree=isChemicalFree;
	this.isHealthly=isHealthly;
		System.out.println("Constructor with all parameter is invoked");
	
	}
	
	public void display(){
		System.out.println("the id of the color is :"+this.id);
		System.out.println("the type of the color is :"+this.type);
		System.out.println("the noOfcolor of the color is :"+this.noOfcolor);
		System.out.println("the price of the color is :"+this.price);
		System.out.println("the isChemicalFree of the color is :"+this.isChemicalFree);
		System.out.println("the isHealthly of the color is :"+this.isHealthly);
		System.out.println("************************************************");
		
		
		
	}
}