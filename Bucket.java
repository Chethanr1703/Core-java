class Bucket{
	int id;
	String color;
	String materialtype;
	double price;
	String quality;
	String size;
	
	
	Bucket(){
		this(2002);
		System.out.println("Constructor with zero parameter is invoked");
		
	}
	Bucket(int id){
		this("white","plastic");
		this.id=id;
		System.out.println("Constructor with one parameter is invoked");
		
		
	}
	Bucket(String color,String materialtype){
		this(200.0,"good");
		this.color=color;
		this.materialtype=materialtype;
		System.out.println("Constructor with two parameter is invoked");
		
	}
	Bucket(double price,String quality){
		this(1,"black","plastic",600.0,"good","large");
		
		this.price=price;
		this.materialtype=materialtype;
		System.out.println("Constructor with two parameter is invoked");
		
	}
	Bucket(String size){
		this(1,"black","plastic",600.0,"good","large");
		this.size=size;
		System.out.println("Constructor with one*----- parameter is invoked");
		
	}
	Bucket(int id,String color,String materialtype,double price, String quality,String size){
		this.id=id;
		this.color=color;
		this.materialtype=materialtype;
		this.price=price;
		this.quality=quality;
		this.size=size;
		System.out.println("Constructor with all parameter is invoked");
		
	}
		
	public void display(){
		System.out.println("the id of the bucket is :"+this.id);
		System.out.println("the color of the bucket is :"+this.color);
		System.out.println("the materialtype of the bucket is :"+this.materialtype);
		System.out.println("the price of the bucket is :"+this.price);
		System.out.println("the quality of the bucket is :"+this.quality);
		System.out.println("the size of the bucket is :"+this.size);
		
		System.out.println("************************************************");
		
		
		
	}
	
}