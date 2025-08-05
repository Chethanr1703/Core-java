class Library{
	int libraryId;
	String libraryName;
	String location;
	Shelf shelf;
	
	public void getinfo(){
		System.out.println("fetching library info");
		System.out.println("the id of the library is "+libraryId);
		System.out.println("the Name of the library is "+libraryName);
		System.out.println("the location of the library is "+location);
		
		this.shelf.getShelfDetails();
		
		
		
	}
}