class Karate{
	int karateId;
	String levelOfBelt[];
	int noOfMoves;
	String karateStyle;
	boolean isOlampicSport;
	
		Karate(){
		System.out.println("the  Constructor invoked" );
	}
	Karate(int karateId){
		System.out.println("the Parameter Constructor invoked" );
		this.karateId=karateId;
		
	}
	Karate(String  levelOfBelt[],int noOfMoves){
		this.levelOfBelt=levelOfBelt;
		this.noOfMoves=noOfMoves;
		
		
		}
	Karate(String karateStyle, boolean isOlampicSport){
		this.karateStyle=karateStyle;
		this.isOlampicSport=isOlampicSport;
		
		
		}
	
	
	public void getKararteInfo(){
		
		System.out.println("the id of the karate1 :"+karateId);
		System.out.println("the id of the karate1 :"+levelOfBelt);
		System.out.println("the id of the karate1 :"+noOfMoves);
		System.out.println("the id of the karate1 :"+karateStyle);
		System.out.println("the id of the karate1 :"+isOlampicSport);
		
		
	}
	
}