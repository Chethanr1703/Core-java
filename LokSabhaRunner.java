class LokSabhaRunner{
	public static void main(String []lr){
		
		Politician politician1= new Politician(1253,"ManiRatna",250000);
		
		Seat seat1 =new Seat(1001,"mla",politician1);
		
		LokSabha lok1 =new LokSabha(101,"delhi",253,seat1);
		
		lok1.getLokSabhaInfo();
	}
}