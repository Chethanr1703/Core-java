class Earth{
		public static void main (String [] parts){
			String	continents[]={"1. Asia","2. Africa","3. America","4. South America","5. Antarctica","6. Europe","7. Australia"};
			
			System.out.println("the number of Continents are "+continents.length);
			//System.out.println(continents[0]+"  "+continents[1]+"  "+continents[2]+"  "+continents[3]+"  "+continents[4]+"  "+continents[5]+"  "+continents[6]);
			for( String continent :continents){
				System.out.println(continent);
			}
}}