class CountryRunner{
	public static void main(String []coun){
		
		City c1 = new City(1 ,"benguluru",  58);
		
		
		State state1=new State(2,"karnatatka" ,29,c1);
		
		
		Country country1= new Country(11, "india",196, state1);
		country1.getCountryInfo();
	}
}