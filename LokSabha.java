class LokSabha{
	int id;
	String location;
	int noOfSeats;
	Seat seat;
	
	LokSabha(int id,String location,int noOfSeats,Seat seat){
		this.id=id;
		this.location=location;
		this.noOfSeats=noOfSeats;
		this.seat=seat;
		
	}
	
	
	public void getLokSabhaInfo(){
				System.out.println("fetching LokSabha info ----");
		System.out.println("the id of the LokSabha is :"+id);
		System.out.println("the location of the LokSabha : "+location);
		System.out.println("the noOfSeats in the LokSabha :"+noOfSeats);
		this.seat.getSeatInfo();
}
	
}