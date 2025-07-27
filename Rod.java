class Rod{
	Rod(){
		System.out.println("the  Constructor invoked" );
	}
	Rod(int rodId,int rodLength,int rodDaimeter,String rodType,String rodBrand){
		System.out.println("the  Constructor invoked" );
		this.rodId=rodId;
		this.rodLength=rodLength;
		this.rodDaimeter=rodDaimeter;
		this.rodType=rodType;
		this.rodBrand=rodBrand;
		
	}
	
	int rodId;
	int rodLength;
	int rodDaimeter;
	String rodType;
	String rodBrand;
	
	
	public void getroddInfo(){
		 System.out.println("the id of Rod20 is " +rodId);
	 System.out.println("the rodLength of the rod20 is " + rodLength);
	 System.out.println("the rodDaimeter of the rod20 is " +rodDaimeter);
	 System.out.println("the rodType of the rod20 is " + rodType);
	 System.out.println("the rodBrand of the rod20 is " + rodBrand);
	}
}