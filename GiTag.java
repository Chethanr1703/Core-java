class GiTag{
	
	int giTagId;
	String place;
	String year;
	String type;
	String state;
	String giType[];
	
	GiTag(){
		System.out.println("the  Constructor invoked" );
	
	
	}
	GiTag(int giTagId,String  place,String year){
		System.out.println("the Parameter Constructor invoked" );
		this.giTagId=giTagId;
		this.place=place;
		this.year=year;
		
	}
	GiTag(String type, String state){
	this.type=type;
		this.state=state;
		
	
	}GiTag(String giType[]){
	this.giType=giType;
	
	}
	
	
	
	
	// public void getGitagInfo(){
		// System.out.println("the gi tag Id is : "+giTagId);
		// System.out.println("the gi tag of a place  is : "+place);
		// System.out.println("the gi tag year is : "+year);
		// System.out.println("the gi tag type is : "+type);
		// System.out.println("the gi tag Id state  is : "+state);
		
	// }
}