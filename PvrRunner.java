class PvrRunner{
	public static void main(String [] pvr){
		Movie mov1=new Movie(161,"Su from So",35,"2.4 hours");
		
		Screen screen1 =new Screen(2002,2500,2500,5,mov1);
		
		Pvr pvr1 =new Pvr(1001,"Orien", screen1);
		
		pvr1.getPvrInfo();
		
	}
}