class HillStation{
	
		/*static String theWindflower="The Windflower Prakruthi Resort";
	static String guhantara ="Guhantara Resort";
	static String wonderla="Wonderla Resort Bangalore";
	static String palmMeadows ="Palm Meadows Resort";
	static String  mangoMist ="MangoMist Resort";
	static String ourNativeVillage="Our Native Village";
	static String ezineLagoon ="Ezine Lagoon Resort";
	*/

		public static void main (String[]hill){
			
			 String theWindflower="The Windflower Prakruthi Resort";
	 String guhantara ="Guhantara Resort";
	 String wonderla="Wonderla Resort Bangalore";
	 String palmMeadows ="Palm Meadows Resort";
	 String  mangoMist ="MangoMist Resort";
	 String ourNativeVillage="Our Native Village";
	 String ezineLagoon ="Ezine Lagoon Resort";
	
			String	resorts[]={theWindflower,guhantara,wonderla,palmMeadows ,mangoMist,ourNativeVillage, ezineLagoon };

			System.out.println("the number of resorts are "+resorts.length);
			//System.out.println(resorts[0]+"  "+resorts[1]+"  "+resorts[2]+"  "+resorts[3]+"  "+resorts[4]+"  "+resorts[5]+"  "+resorts[6]);
			for(String resort:resorts){
				System.out.println(resort);
			}
}}