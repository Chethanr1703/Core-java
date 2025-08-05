class Movie{
	int movieId;
	String movieName;
	double budget;
	String time;
	
	Movie(int movieId,String movieName,double budget,String time){
		this.movieId=movieId;
		this.movieName=movieName;
		this.budget=budget;
		this.time=time;
		
	}
	public void getMovieInfo(){
		System.out.println("fetching movie info++++++++");
		System.out.println("the id of the movie is: "+movieId);
		System.out.println("the name of the movie  :"+movieName);
		System.out.println("the budget of the movie is :"+budget+"crs");
		System.out.println("the timing of the movie is: "+time);

	


	}
}