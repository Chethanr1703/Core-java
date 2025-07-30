class CrackersRunner{
	public static void main(String[]cr){
		
	String	crackerType[]={"Sparcle","rocket","flower pot","bomb"};
	
		 Crackers cracker1 = new Crackers(1, crackerType);
		 System.out.println("the id is  "+cracker1.crackerId);
		 System.out.println("the type of cracker is  ");
		 for (String type:crackerType){
			 		 System.out.println(type);

		 }
		 
		 
		 
		 Crackers cracker2 = new Crackers("25-06-2025", 150);
		 System.out.println("the manufactorDate is  "+cracker2.manufactorDate);
		 System.out.println("the price is  "+cracker2.crackerPrice);
		 
		 
		 Crackers cracker3 = new Crackers(true);
		 System.out.println("the  is green cracker  "+cracker1.isGreenCracker);
		 
		 
		 
}}