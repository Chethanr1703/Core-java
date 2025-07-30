class MarbleRunner{
	public static void main(String []mr){
		String colors[]={"black","blue","brown"};
	Marble	marble1=new Marble(100001,colors);
	
	System.out.println("the id  is "+marble1.marbleId);
	
	System.out.println("the colors is ");
		for(String color :colors){
			System.out.println(color);
		}

	
	
	Marble	marble2=new Marble( "Black", "rectangle", "Good");
	
	
		System.out.println("the marbleType is "+marble2.marbleType);
	System.out.println("the shape is "+marble2.shape);
	System.out.println("the Quality is "+marble2.Quality);

	




		
}}
