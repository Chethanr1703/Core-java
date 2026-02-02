class Tourism{

	static String touristPlaces[]={"Mysore Palace","Hampi","Badami Cave","Keshava Temple","Pattadakal","Aihole","Beluru","Bidar Fort","Gol Gumbaz","Sringeri","Coorg","Chikmagalur","Nandi Hills","Dandeli","Sakleshpura"};

		public static void main (String[]places){
		
		System.out.println("the number of tourist Places are "+touristPlaces.length);
		//System.out.println(touristPlaces[0]+"  "+touristPlaces[1]+"  "+touristPlaces[2]+"  "+touristPlaces[3]+"  "+touristPlaces[4]+"  "+touristPlaces[5]+"  "+touristPlaces[6]+"  "+touristPlaces[7]+"  "+touristPlaces[8]+"  "+touristPlaces[9]+"  "+touristPlaces[10]+"  "+touristPlaces[11]+"  "+touristPlaces[12]+"  "+touristPlaces[13]+"  "+touristPlaces[14]);
				  for(String	Place : touristPlaces){
					  System.out.println(Place);
				  }
		}

}


