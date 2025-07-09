class Ticket{
	public static void ticketDetails(int price,String movieName){
		System.out.println("ticket Details Started");
		
		
		System.out.println("the price of the ticket "+price);
		System.out.println("movie Name is "+movieName);
		
		
		SeatNo.SeatDetials(MoviesTicketsRunner.seatNo,MoviesTicketsRunner.block);
		
		
		
		
		
		System.out.println("ticket Details ended");
	}
}