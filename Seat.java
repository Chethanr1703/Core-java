class Seat{
	int seatId;
	String seatname;
	Politician politician;
	
	Seat(int seatId,String seatname,Politician politician){
		this.seatId=seatId;
		this.seatname=seatname;
		this.politician=politician;
	}
	public void getSeatInfo(){
				System.out.println("fetching Seat info ----");
		System.out.println("the id of the Seat is :"+seatId);
		System.out.println("the name of the Seat : "+seatname);
		this.politician.getPoliticianInfo();
}
}