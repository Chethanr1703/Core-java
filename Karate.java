class Karate{
	
		Karate(){
		System.out.println("the  Constructor invoked" );
	}
	Karate(int karateId,String  levelOfBelt,int noOfMoves,String karateStyle, boolean isOlampicSport){
		System.out.println("the Parameter Constructor invoked" );
		this.karateId=karateId;
		this.levelOfBelt=levelOfBelt;
		this.noOfMoves=noOfMoves;
		this.karateStyle=karateStyle;
		this.isOlampicSport=isOlampicSport;
		
	}
	
	int karateId;
	String levelOfBelt;
	int noOfMoves;
	String karateStyle;
	boolean isOlampicSport;
	
	public void getKararteInfo(){
		
		System.out.println("the id of the karate1 :"+karateId);
		System.out.println("the id of the karate1 :"+levelOfBelt);
		System.out.println("the id of the karate1 :"+noOfMoves);
		System.out.println("the id of the karate1 :"+karateStyle);
		System.out.println("the id of the karate1 :"+isOlampicSport);
		
		
	}
	
}