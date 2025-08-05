class Egg{
	int id;
	String type;
	String expDate;
	double price;
	boolean isNaturalEgg;
	String quality;
	
	Egg(){
		this(101);
		System.out.println("Constructor with zero parameter is invoked");
		
	}
	Egg(int id){
		this("nati","30-07-2025");
		this.id=id;
		System.out.println("Constructor with one parameter is invoked");
		
		
	}
	Egg(String type,String expDate){
		this(101,"bolier","31-07-2025",7.50,true,"good");
		this.type=type;
		this.expDate=expDate;
		System.out.println("Constructor with two parameter is invoked");
		
		
	}
	Egg(double price,boolean isNaturalEgg,String quality){
		this(101,"bolier","31-07-2025",7.50,true,"good");
		
		this.price=price;
		this.isNaturalEgg=isNaturalEgg;
		this.quality=quality;
		System.out.println("Constructor with three parameter is invoked");
		
	}
	Egg(int id , String type,String expDate,double price ,boolean isNaturalEgg,String quality){
		this.id=id;
		this.type=type;
		this.expDate=expDate;
		this.price=price;
		this.isNaturalEgg=isNaturalEgg;
		this.quality=quality;
		System.out.println("Constructor with all parameter is invoked");
		
	}
	
	public void display(){
		System.out.println("the id of the Egg is :"+this.id);
		System.out.println("the type of the Egg is :"+this.type);
		System.out.println("the expDate of the Egg is :"+this.expDate);
		System.out.println("the price of the Egg is :"+this.price);
		System.out.println("the isNaturalEgg of the Egg is :"+this.isNaturalEgg);
		System.out.println("the quality of the Egg is :"+this.quality);
		System.out.println("************************************************");
		
		
		
	}
}