class Screen{
	int screenId;
	int screenlenght;
	int screenWidth;
	int noOfScreen;
	Movie movie;
	
	
	Screen(int screenId,int screenlenght,int screenWidth,int noOfScreen,Movie movie){
		this.screenId=screenId;
		this.screenlenght=screenlenght;
		this.screenWidth=screenWidth;
		this.noOfScreen=noOfScreen;
		this.movie=movie;
		
		
	}
	public void getScreenInfo(){
		System.out.println("fetching screen info-----");
		System.out.println("the id of the screen is :"+screenId);
		System.out.println("the length of the screen is :"+screenlenght+"cms");
		System.out.println("the widht of the screen is :"+screenWidth+"cms");
		System.out.println("the noOfScreen of the pvr is :"+noOfScreen);
						
						
					
		this.movie.getMovieInfo();


	}
}