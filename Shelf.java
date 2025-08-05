class Shelf {
	int id;
	int noOfShelf;
	Book book ;
	
	
	public void getShelfDetails(){
		System.out.println("the id of the shelf"+id);
		System.out.println("the noOfShelf of the shelf"+noOfShelf);
		
		this.book.getBookInfo();
		
	}

}