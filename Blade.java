class Blade{
	
	int bladeId;
	String companyName;
	double lengthOfBlade;
	double widhtOfBlade;
	boolean isBothSideSharped;
	String manufactorDate;
	String bladeType[];
	
	Blade(){
		System.out.println("the  Constructor invoked" );
		
	}
	Blade(int bladeId,	String companyName,boolean isBothSideSharped){
				System.out.println("the Parameter Constructor invoked" );
				this.bladeId=bladeId;
				this.companyName=companyName;
				
				this.isBothSideSharped=isBothSideSharped;
				
				

		
	}
	Blade(	double lengthOfBlade,	double widhtOfBlade){
		this.lengthOfBlade=lengthOfBlade;
		this.widhtOfBlade=widhtOfBlade;
	}
	Blade(String manufactorDate, String bladeType[] ){
		this.manufactorDate=manufactorDate;
		this.bladeType=bladeType;
	}
	
	
	
	// public void getBladeInfo(){
		// System.out.println("the id of the blade20 is :" + bladeId);
			// System.out.println("the companyName of the blade20 is :" + companyName);
			// System.out.println("the length Of blade20 is :" + lengthOfBlade + " cms ");
			// System.out.println("the widht Of blade20 is :" + widhtOfBlade + " cms ");
			// System.out.println("is the blade20 is Both Side Sharped :" + isBothSideSharped);
			// System.out.println("the manufactor Date of the blade20 is :" + manufactorDate);			
			
	// }
}