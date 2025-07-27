class Festivals{
	
	Festivals(){
		System.out.println("Festivals is invovked");
	}
	Festivals(int festivalId,String  festivalName,String duration,String religion, String festivalreligion){
		System.out.println("the Parameter Constructor invoked" );
		this.festivalId=festivalId;
		this.festivalName=festivalName;
		this.duration=duration;
		this.religion=religion;
		this.festivalreligion=festivalreligion;
		
	}
	
	int festivalId;
	String festivalName;
	String duration;
	String religion;
	String festivalreligion;
	
	
	
	public void getFestialInfo(){
		
				System.out.println("the festivalId of festival1 " +festivalId);
		System.out.println("the festivalName of festival1 " + festivalName);
		System.out.println("the duration of festival1 " + duration);
		System.out.println("the religion of festival1 " + religion);
		System.out.println("the festivalreligion of festival1 " + festivalreligion);
		
	}

}