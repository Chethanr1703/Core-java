class HoliRunner{
	public static void main(String [] holi){
		
		Holi h1=new Holi(1,"25-07-2025",true,true,7,"yellow");
		h1.display();
		
		Holi h2 = new Holi();
		h2.display();
		
		Holi h3 = new Holi(101,"25/3/2023",4,"pink");
		h3.display();
		
		Holi h4 = new Holi(1001);
		h4.display();
		
		Holi h5 = new Holi("25-09-2012",true);
		h5.display();
		
		Holi h6 = new Holi(true ,7,"REd");
		h6.display();
		
	
		
		
	}
}