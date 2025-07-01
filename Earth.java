class Earth{
	
	/*static String asia ="Asia";
	static String africa ="Africa";
	static String america ="America";
	static String southAmerica="South America";
	static String antarctica="Antarctica";
	static String europe="Europe";
	static String australia="Australia";
	*/
		public static void main (String [] parts){
			
			
	 String asia ="Asia";
	 String africa ="Africa";
	 String america ="America";
	 String southAmerica="South America";
	 String antarctica="Antarctica";
	 String europe="Europe";
	 String australia="Australia";
			String	continents[]={asia,africa,america,southAmerica,antarctica,europe,australia};
			
			System.out.println("the number of Continents are "+continents.length);
			//System.out.println(continents[0]+"  "+continents[1]+"  "+continents[2]+"  "+continents[3]+"  "+continents[4]+"  "+continents[5]+"  "+continents[6]);
			for( String continent :continents){
				System.out.println(continent);
			}
}}