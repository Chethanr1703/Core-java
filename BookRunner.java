class BookRunner{
	
	public static void main(String []lib){
		
	Book book1 =new Book();
		
		
	Shelf shelf1= new Shelf();
		
	Library lib1= new Library();
	
	
	lib1.libraryId=101;
	lib1.libraryName="Sam";
	lib1.location="laggere";
	
	// System.out.println(lib1.shelf.book);
	lib1.shelf=shelf1;
	System.out.println(lib1.shelf);
	
	shelf1.id=12023;
	shelf1.noOfShelf=1000;
	
	
	book1.bookId=503;
	book1.bookName="Rich dad Poor dad";
	book1.authorName="nanadanna";
	book1.price=200.05;
	shelf1.book =book1;
	lib1.getinfo();
	}
}