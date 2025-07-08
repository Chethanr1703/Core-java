class Earth{
	public static void getcontinents(){
		System.out.println("the numEarthRunner.ber of Continents are "+EarthRunner.continents.length);
			//System.out.println(continents[0]+"  "+continents[1]+"  "+continents[2]+"  "+continents[3]+"  "+continents[4]+"  "+continents[5]+"  "+continents[6]);
			for( String continent :EarthRunner.continents){
				System.out.println(continent);
			}
	}
}