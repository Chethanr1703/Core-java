class Bangalore{
	
	/*	static String rajajinagar="Rajajinagar";
	static String vijaynagar="Vijaynagar";
	static String jayanagar="Jayanagar";
	static String laggere="Laggere";
	static String peenya="Peenya";
	static String kormangala="Kormangala ";
	static String majestic="Majestic";
	static String mspalya= "MS palya";
*/

		public static void main (String[]namesarea){
			
			
			 String rajajinagar="Rajajinagar";
	 String vijaynagar="Vijaynagar";
	 String jayanagar="Jayanagar";
	 String laggere="Laggere";
	 String peenya="Peenya";
	 String kormangala="Kormangala ";
	 String majestic="Majestic";
	 String mspalya= "MS palya";
			
			
			
			String	areaNames[]={rajajinagar,vijaynagar,jayanagar,laggere,peenya,mspalya,kormangala,majestic};

			System.out.println("the number of Area names are "+areaNames.length);
			//System.out.println(areaNames[0]+"  "+areaNames[1]+"  "+areaNames[2]+"  "+areaNames[3]+"  "+areaNames[4]+"  "+areaNames[5]+"  "+areaNames[6]+"  "+areaNames[7]);
			for(String area:areaNames){
			System.out.println(area);
		}
}}