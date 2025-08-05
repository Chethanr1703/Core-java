class Baloon{
	int baloonId;
	String shape;
	String brandName;
	double price;
	String companyName;
	String color;
	
	
	Baloon(){		
		this(101,"oval");
		System.out.println("Constructor with zero parameter is invoked");
		
	}
	
	Baloon(int id,String shape){
		this("Pragathi",120.00);
		this.baloonId=id;
		this.shape=shape;
		System.out.println("Constructor with Two[2] parameter is invoked");
		
	}
	Baloon(String brand ,double rupees){
		this("Blue");
		this.brandName=brand;
		this.price=rupees;
		System.out.println("Constructor with Two---2 parameter is invoked");
		
		
	}
	Baloon(String color){
		// this();
		this(121,"Cylinder","Puma",250.00);
		
		this.color=color;
		System.out.println("Constructor with one parameter is invoked");
		
		
	}
	Baloon(int id,String shape,String brand ,double rupees){
		this(10.500,"abhi","Yellow");
		this.baloonId=id;
		this.shape=shape;
		this.brandName=brand;
		this.price=rupees;
		System.out.println("Constructor with four parameter is invoked");
		
		
	}
	Baloon(double rupees,String cName,String color){
		this(101,"circle","namm",125.00,"Zaaraa","White");
		this.price=rupees;
		this.companyName=cName;
		this.color=color;
		System.out.println("Constructor with three parameter is invoked");
		
	
	}
	Baloon(int id,String shape,String brand ,double rupees,String cName,String color){
		this.baloonId=id;
		this.shape=shape;
		this.brandName=brand;
		this.price=rupees;
		this.companyName=cName;
		this.color=color;
		System.out.println("Constructor with all parameter is invoked");
		
	}
	
	// public void getInfo(){
		// System.out.println("the id of the ballon is :"+this.baloonId);
		// System.out.println("the Shape of the ballon is :"+this.shape);
		// System.out.println("the brand name of the ballon is :"+this.brandName);
		// System.out.println("the price of the ballon is :"+this.price);
		// System.out.println("the companyName of the ballon is :"+this.companyName);
		// System.out.println("the color of the ballon is :"+this.color);
		
	// }
	
}