class Roti{
	int rotiId;
	String rotiShape[];
	String rotiType;
	int rotiPrice;
	boolean isbuttered;
	
		Roti(){
		System.out.println("the  Constructor invoked" );
	}
	Roti(int rotiId,String  rotiShape[] ){
		System.out.println("the Parameter Constructor invoked" );
		this.rotiId=rotiId;
		this.rotiShape=rotiShape;
		
	}
	Roti(String rotiType,int rotiPrice){
		this.rotiType=rotiType;
		this.rotiPrice=rotiPrice;
		
	}
	Roti(boolean isbuttered){
		this.isbuttered=isbuttered;
		
	}
	
	
	public void getRotiInfo(){
		System.out.println("the id of the roti1 "+rotiId);
	System.out.println("the Shape of the roti1 :"+rotiShape);
	System.out.println("the type of the roti1 "+rotiType);
	System.out.println("the price of the roti1  "+rotiPrice);
	System.out.println("isbuttered "+isbuttered);
	
	}
	
}