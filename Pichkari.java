class Pichkari{
	int id;
	String brand;
	String materialType;
	String mgfDate;
	boolean isworking;
	String quality;
	
	
	Pichkari(){
		this(101);
		System.out.println("Constructor with zero parameter is invoked");
		
	}
	Pichkari(int id){
		this("plastic","24-05-2025",true);
		this.id=id;
		System.out.println("Constructor with one parameter is invoked");
		
		
	}
	Pichkari(String material,String date,boolean working){
		this(true,"good");
		this.materialType=materialType;
		this.mgfDate=date;
		this.isworking=isworking;
		System.out.println("Constructor with three parameter is invoked");
		
	}
	Pichkari(boolean isworking , String quality){
		this(101,"amazon","plastic","04-05-2005",isworking,quality);
			this.isworking=isworking;
		this.quality=quality;
		System.out.println("Constructor with two   *** parameter is invoked");
	
		
	}
	Pichkari(int id ,String brand,String materialType,String date, boolean isworking, String quality){
		this.id=id;
		this.brand=brand;
		this.materialType=materialType;
		this.mgfDate=date;
		this.isworking=isworking;
		this.quality=quality;
		System.out.println("Constructor with all parameter is invoked");
		
	}
	public void display(){
		System.out.println("the id of the pichkari is :"+this.id);
		System.out.println("the brand of the pichkari is :"+this.brand);
		System.out.println("the material of the pichkari is :"+this.materialType);
		System.out.println("the date of the pichkari is :"+this.mgfDate);
		System.out.println("the isworking of the pichkari is :"+this.isworking);
		System.out.println("the quality of the pichkari is :"+this.quality);
		
	}


}