class production{
public static void productionDetials(String productionName,String ProductionOwner){
		System.out.println("production Started ");
		
		System.out.println("production name is   "+MakingMovieRunner.productionName);
		System.out.println("production  owner is  "+MakingMovieRunner.productionOwner);
		DetailsoFMovies.details(MakingMovieRunner.directorName,  MakingMovieRunner.writerName);
			
	Remenuration.detailsOfRemenuration(MakingMovieRunner.heroPrice,MakingMovieRunner.villianPrice);

		System.out.println("production ended ");
	
}
}