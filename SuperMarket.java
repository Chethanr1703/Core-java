class SuperMarket{
	
	
		static String vanilla="Vanilla";
	static String strawberry="Strawberry";
	static String kulfi="Kulfi";
	static String frozenYogurt="FrozenYogurt";
	static String blueBell="BlueBell";
	static String cones="Cones";
	static String butterscotch="Butterscotch";
	static String mintChocolateChip= "MintChocolateChip";
	static String cookiesCream= "CookiesCream";
	static String pistachio= "Pistachio";
			
		
		static	String	iceCreams[]={vanilla,strawberry,kulfi,frozenYogurt,blueBell,cones,butterscotch,mintChocolateChip,cookiesCream,pistachio};
	
		
		static String titan="Titan";
	static String gucci="Gucci";
	static String davidoff="Davidoff";
	static String fougere="Fougere";
	static String parkAvenue="ParkAvenue";
	static String renee="Renee";
	static String wildStone="WildStone";
	static String ajmal= "Ajmal";
	static String theManCampany = "The Man Campany ";
	static String calvinKlein= "Calvin Klein";
			
		static	 String  perfumes[]={titan,gucci,davidoff,fougere,parkAvenue,renee,wildStone,ajmal,theManCampany ,calvinKlein};
	 
		
		static String rice="Rice";
	static String egg="Egg";
	static String milk="Milk";
	static String bread="Bread";
	static String onion="Onion";
	static String tomatoes="Tomatoes";
	static String freshfruits="Freshfruits";
	static String maggi= "maggi";
	static String pasta= "pasta";
	static String leafygreens= "Leafygreens";
	
		static	String  groceries[]= {rice,egg,milk,bread,onion,tomatoes,freshfruits,maggi,pasta,leafygreens};
		 
	
		static String cetaphil="Cetaphil";
	static String ponds="Ponds";
	static String lakm="Lakmé";
	static String biotique="Biotique";
	static String minimalist="Minimalist";
	static String earthen="Earthen";
	static String theFaceShop="The Face Shop";
	static String reequil= "Re'equil";
	static String innisfree= "Innisfree";
	static String elle18= "Elle18";
			
		static	 String  cosmetics[]={cetaphil,ponds,lakm,biotique,minimalist,earthen,theFaceShop,reequil,innisfree,elle18};
		 

		public static void main(String[]product){
			
			
	 // String vanilla="Vanilla";
	 // String strawberry="Strawberry";
	 // String kulfi="Kulfi";
	 // String frozenYogurt="FrozenYogurt";
	 // String blueBell="BlueBell";
	 // String cones="Cones";
	 // String butterscotch="Butterscotch";
	 // String mintChocolateChip= "MintChocolateChip";
	 // String cookiesCream= "CookiesCream";
	 // String pistachio= "Pistachio";
		
		getIceCreams();
			
			
	 // String titan="Titan";
	 // String gucci="Gucci";
	 // String davidoff="Davidoff";
	 // String fougere="Fougere";
	 // String parkAvenue="ParkAvenue";
	 // String renee="Renee";
	 // String wildStone="WildStone";
	 // String ajmal= "Ajmal";
	 // String theManCampany = "The Man Campany ";
	 // String calvinKlein= "Calvin Klein";
	
			getperfumes();
	 // String rice="Rice";
	 // String egg="Egg";
	 // String milk="Milk";
	 // String bread="Bread";
	 // String onion="Onion";
	 // String tomatoes="Tomatoes";
	 // String freshfruits="Freshfruits";
	 // String maggi= "maggi";
	 // String pasta= "pasta";
	 // String leafygreens= "Leafygreens";
			
			
		getgroceries();	
   	 // String cetaphil="Cetaphil";
	 // String ponds="Ponds";
	 // String lakme="Lakmé";
	 // String biotique="Biotique";
	 // String minimalist="Minimalist";
	 // String earthen="Earthen";
	 // String theFaceShop="The Face Shop";
	 // String reequil= "Re'equil";
	 // String innisfree= "Innisfree";
	 // String elle18= "Elle18";
			
			
		getcosmetics();	
				
			
			}
			// outside main methods
			public static void getIceCreams(){
				System.out.println("the number of iceCreams product are "+iceCreams.length);
			//System.out.println(iceCreams[0] + "   "+iceCreams[1] +"   "+iceCreams[2] +"   "+iceCreams[3] +"   "+iceCreams[4] +"   "+iceCreams[5] +"   "+iceCreams[6] +"   "+iceCreams[7] +"   "+iceCreams[8] +"   "+iceCreams[9]);
			
			
			for(String	iceCream	: iceCreams){
					System.out.println(iceCream);
					}
					
			}
			public static void getperfumes(){
				System.out.println("the number of perfumes product are "+perfumes.length);
		//	System.out.println(perfumes[0] +"  "+perfumes[1] +"  "+perfumes[2] +"  "+perfumes[3] +"  "+perfumes[4] +"  "+perfumes[5] +"  "+perfumes[6] +"  "+perfumes[7] +"  "+perfumes[8] +"  "+perfumes[9]);
			
			
			
			for(String perfume:perfumes){
					System.out.println(perfume);
				}
			}
			public static void getgroceries(){
				System.out.println("the number of groceries product are "+groceries.length);
			//System.out.println(groceries[0]+"  "+groceries[1]+"  "+groceries[2]+"  "+groceries[3]+"  "+groceries[4]+"  "+groceries[5]+"  "+groceries[6]+"  "+groceries[7]+"  "+groceries[8]+"  "+groceries[9]);
			
			for(String Grocerie: groceries){
					System.out.println(Grocerie);
				}
				
			}
			public static void getcosmetics(){
				 System.out.println("the number of cosmetics product are "+cosmetics.length);
			//System.out.println(cosmetics[0]+"  "+cosmetics[1]+"  "+cosmetics[2]+"  "+cosmetics[3]+"  "+cosmetics[4]+"  "+cosmetics[5]+"  "+cosmetics[6]+"  "+cosmetics[7]+"  "+cosmetics[8]+"  "+cosmetics[9]);
			
					
			for(String cosmetic:cosmetics){
					System.out.println(cosmetic);
				}
			}
}