class City{
	int id;
	String cityName;
	int pincode;
	
	City(int id ,String cityName, int pincode){
		this.id =id;
		this.cityName=cityName;
		this.pincode=pincode;
		
	}
	public void city(){
		
				System.out.println("the id of the city is :"+id);
				System.out.println("the name of the city " +cityName);
				System.out.println("the pincode of the city is "+pincode);



	}
}