class Bar{
	/*
	static String kingfisher="Kingfisher";
	static String old="Old Monk";
	static String royalChallenge="Royal Challenge";
	static String mcDowell="McDowell's No. 1";
	static String imperialBlue="Imperial Blue";
	static String bagpiper="Bagpiper ";
	static String gianChand="GianChand";
	static String black= "Black";
	static String pm= "8PM";
	static String redlabel= "RED label";
	static String blackandwhite= "Black and White";
	static String white= "White";
	
	*/


		public static void main (String[]bar){
			
			 String kingfisher="Kingfisher";
	 String old="Old Monk";
	 String royalChallenge="Royal Challenge";
	 String mcDowell="McDowell's No. 1";
	 String imperialBlue="Imperial Blue";
	 String bagpiper="Bagpiper ";
	 String gianChand="GianChand";
	 String black= "Black";
	 String pm= "8PM";
	 String redlabel= "RED label";
	 String blackandwhite= "Black and White";
	 String white= "White";
			
			
			
	String	alcoholNames[]={kingfisher,old,royalChallenge,mcDowell,imperialBlue,bagpiper,pm,gianChand,black, redlabel,blackandwhite,white};

		System.out.println("the number of alcohol Names are "+alcoholNames.length);
			//System.out.println(alcoholNames[0]+"  "+alcoholNames[1]+"  "+alcoholNames[2]+"  "+alcoholNames[3]+"  "+alcoholNames[4]+"  "+alcoholNames[5]+"  "+alcoholNames[6]+"  "+alcoholNames[7]+"  "+alcoholNames[8]+"  "+alcoholNames[9]+"  "+alcoholNames[10]+"  "+alcoholNames[11]);
			for(String alcohol :alcoholNames){
				System.out.println(alcohol);
			}
}}