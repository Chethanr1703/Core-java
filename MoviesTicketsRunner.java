class MoviesTicketsRunner{
	static String multiplexName ="pvr";
	static String language ="kannada";
	static int price =150;
	static String movieName="KGF";
	static int seatNo = 12;
	static String block ="g";
	public static void main(String[]ticket){
		System.out.println("--------------Main Started-------------");
		
		BookMyShow.ticketBooking(multiplexName);
		
		
		
		Payment.paymentProcessing();
		
		
		System.out.println("--------------Main Ended----------");
		
	}
}