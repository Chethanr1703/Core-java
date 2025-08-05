class Politician{
	int politicianId;
	String name;
	int noOfvotes;
	
	Politician(int politicianId,String name,int noOfvotes){
		this.politicianId=politicianId;
		this.name=name;
		this.noOfvotes=noOfvotes;
		
	}
	public void getPoliticianInfo(){
				System.out.println("fetching Politician info ----");
		System.out.println("the id of the Politician is :"+politicianId);
		System.out.println("the name of the Politician : "+name);
		System.out.println("the noOfvotes in the Politician :"+noOfvotes);
}
}