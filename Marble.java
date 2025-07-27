class Marble{
	
		
		Marble(){
		System.out.println("the Constructor invoked" );
	}
	Marble(int marbleId,String  marbleType,String colors,String shape, String Quality){
		System.out.println("the Parameter Constructor invoked" );
		this.marbleId=marbleId;
		this.marbleType=marbleType;
		this.colors=colors;
		this.shape=shape;
		this.Quality=Quality;
		
	}
	
	
	int marbleId;
	String marbleType;
	String colors;
	String shape;
	String Quality;
	
	public void getMarbleinfo(){
		
		System.out.println("the id of the marble1 "+marbleId);
	System.out.println("the marbleType of the marble1 "+marbleType);
	System.out.println("the colors of the marble1 "+colors);
	System.out.println("the shape of the marble1 "+shape);
	System.out.println("the Quality of the marble1 "+Quality);
	
	}
}