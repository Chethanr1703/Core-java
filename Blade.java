class Blade{
	
	Blade(){
		System.out.println("the  Constructor invoked" );
		
	};
	Blade(int bladeId,	String companyName,	double lengthOfBlade,	double widhtOfBlade,boolean isBothSideSharped,String manufactorDate){
				System.out.println("the Parameter Constructor invoked" );
				this.bladeId=bladeId;
				this.companyName=companyName;
				this.lengthOfBlade=lengthOfBlade;
				this.widhtOfBlade=widhtOfBlade;
				this.isBothSideSharped=isBothSideSharped;
				this.manufactorDate=manufactorDate;
				

		
	}
	
	
	int bladeId;
	String companyName;
	double lengthOfBlade;
	double widhtOfBlade;
	boolean isBothSideSharped;
	String manufactorDate;
	
	public void getBladeInfo(){
		System.out.println("the id of the blade20 is :" + bladeId);
			System.out.println("the companyName of the blade20 is :" + companyName);
			System.out.println("the length Of blade20 is :" + lengthOfBlade + " cms ");
			System.out.println("the widht Of blade20 is :" + widhtOfBlade + " cms ");
			System.out.println("is the blade20 is Both Side Sharped :" + isBothSideSharped);
			System.out.println("the manufactor Date of the blade20 is :" + manufactorDate);			
			
	}
}