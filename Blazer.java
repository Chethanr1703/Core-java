class Blazer{
	Blazer(){System.out.println("the  Constructor invoked" );
		
	}
	
	Blazer(int blazerId,String blazerMaterailType,boolean isPipingAvaible,String blazerBrand,String manufactorCompanyName,String blazerColor){
				System.out.println("the Parameter Constructor invoked" );
		this.blazerId=blazerId;
		this.blazerMaterailType=blazerMaterailType;
		this.isPipingAvaible=isPipingAvaible;
		this.blazerBrand=blazerBrand;
		this.manufactorCompanyName=manufactorCompanyName;
		this.blazerColor=blazerColor;
	}
	
	int blazerId ;
	String blazerMaterailType;
	boolean isPipingAvaible;
	String blazerBrand;
	String manufactorCompanyName;
	String blazerColor;
	
	public void getBlazerInfo(){
		System.out.println("the id of the blazer1 is :"+blazerId);
		System.out.println("the blazer1 Materail Type is : "+blazerMaterailType);
		System.out.println("is Piping Avaible for the blazer1 :"+isPipingAvaible);
		System.out.println("the brand name of the blazer1 is : "+blazerBrand);
		System.out.println("the manufactorCompanyName of the blazer1 is: "+manufactorCompanyName);
		System.out.println("the blazer1  color is : "+blazerColor);
		
	}
}