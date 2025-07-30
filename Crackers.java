class Crackers{
	int crackerId;
	String crackerType[];
	String manufactorDate;
	int crackerPrice;
	boolean isGreenCracker;
	
	
	Crackers(){
		System.out.println("the  Constructor invoked" );
	}
	Crackers(int crackerId,String  crackerType[] ){
		
		System.out.println("the Parameter Constructor invoked" );
		this.crackerId=crackerId;
		this.crackerType=crackerType;
		
	}
	Crackers(String manufactorDate,int crackerPrice){
		this.manufactorDate=manufactorDate;
		this.crackerPrice=crackerPrice;
		
	}
	Crackers(boolean isGreenCracker){
		this.isGreenCracker=isGreenCracker;
		
	}
	
	
	
	
	// public void getCrackInfo(){
		
	// System.out.println("the id of cracker2 is " +crackerId);
	// System.out.println("the type of cracker2 is " + crackerType);
	// System.out.println("the manufactorDate of cracker2 " + manufactorDate);
	// System.out.println("the crackerPrice of the cracker2 " + crackerPrice);
	// System.out.println("isGreenCracker are " + isGreenCracker);
	
	// }
	
}