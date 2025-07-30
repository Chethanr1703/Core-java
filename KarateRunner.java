class KarateRunner{
	public static void main(String[] kr){
				String levelOfBelt[]={"yellow","black","brown","blue"};
	Karate	karate1	=	new Karate(5001);
	System.out.println("the id is "+karate1.karateId);
	
	
	
	Karate	karate2	=	new Karate(levelOfBelt, 15);
	
	System.out.println("the levelOfBelt is ");
		for(String belt :levelOfBelt){
			System.out.println(belt);
		}
	System.out.println("the noOfMoves is "+karate2.noOfMoves);
		
	
	
	Karate	karate3	=	new Karate("Shudo Kan", true);
	System.out.println("the karateStyle is "+karate3.karateStyle);
	System.out.println("the isOlampicSport is "+karate3.isOlampicSport);
	
	
}}