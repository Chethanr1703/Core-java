class ForestSafariRunner{

		public static void main(String[]fsr){
		String	animalName[]={"tiger","lion","deer","peacock","wolf"};
			
			ForestSafari forestSafari1 =  new ForestSafari(1, "Bandipur Forest Safari");
			
			System.out.println("the id is  "+forestSafari1.forestSafariId);
			System.out.println("the fsName is  "+forestSafari1.fsName);
			
			
			ForestSafari forestSafari2 =  new ForestSafari( "Karnataka");
			System.out.println("the location is  "+forestSafari2.location);
			
			
			ForestSafari forestSafari3 =  new ForestSafari( "Tiger",animalName);
			System.out.println("the animalType  is  "+forestSafari3.animalType);
			System.out.println("the animalname is  ");
			for(String name :animalName){
			System.out.println(name);

			}
			
			
}}