class ParkRunner{
	public static void main (String[]pr){
		
	boolean isgrassyAreas	=Park.grassyAreas();
	System.out.println("the park has grassyAreas "+isgrassyAreas);
	
	boolean isplayGrounds	=Park.playGrounds();
	System.out.println("the park has playGrounds "+isplayGrounds);
	
	boolean istrees	=Park.trees();
	System.out.println("the park has trees  "+istrees);
	
	
	boolean iswalkingPaths	=Park.walkingPaths();
	System.out.println("the park has walkingPaths  "+iswalkingPaths);
	
	
	
	boolean issportsFields	=Park.sportsFields();
	System.out.println("the park has sportsFields "+issportsFields);
	
		
	}
}