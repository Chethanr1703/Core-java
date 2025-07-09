class DetailsoFMovies{
public static void details(String directorName, String writerName){
	
		System.out.println("details Started ");
		
		System.out.println("director name is   "+MakingMovieRunner.directorName);
		System.out.println("writer   owner is  "+MakingMovieRunner.writerName);
		
		OtherDirector.otherDirector( MakingMovieRunner.musicDirector,MakingMovieRunner.danceMaster);	

		Casting.castingDetails(MakingMovieRunner.heroName,MakingMovieRunner.villainName);
		

		System.out.println("details ended ");
	
	
}
}