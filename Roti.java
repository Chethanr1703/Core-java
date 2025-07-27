class Roti{
	
	
		Roti(){
		
	}
	Roti(int rotiId,String  rotiShape,String rotiType,int rotiPrice, boolean isbuttered){
		this.rotiId=rotiId;
		this.rotiShape=rotiShape;
		this.rotiType=rotiType;
		this.rotiPrice=rotiPrice;
		this.isbuttered=isbuttered;
		
	}
	int rotiId;
	String rotiShape;
	String rotiType;
	int rotiPrice;
	boolean isbuttered;
	
	public void getRotiInfo(){
		System.out.println("the id of the roti1 "+rotiId);
	System.out.println("the Shape of the roti1 :"+rotiShape);
	System.out.println("the type of the roti1 "+rotiType);
	System.out.println("the price of the roti1  "+rotiPrice);
	System.out.println("isbuttered "+isbuttered);
	
	}
	
}