class Country{
	int id;
	String countryname;
	int noOfCountry;
	State state;
	
	Country(int id, String countryname,int noOfCountry,State state){
		this.id=id;
		this.countryname=countryname;
		this.noOfCountry=noOfCountry;
		this.state=state;
		
	}
	public void getCountryInfo(){
				System.out.println("fetching country info ----");
		System.out.println("the id of the country is :"+id);
		System.out.println("the name of the country : "+countryname);
		System.out.println("the noOfCountry in the world :"+noOfCountry);
this.state.getStateinfo();
	}
}