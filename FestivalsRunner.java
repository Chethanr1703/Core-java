class FestivalsRunner{
	public static void main (String []fs){
	
	String festivalName[]={"ugadi","Sankranti","diwali","holi","ganesha"};
	
		Festivals festival1 = new Festivals(1,festivalName);
		System.out.println("the id is  "+festival1.festivalId);
		System.out.println("the name of festival  is  ");
		for(String name:festivalName){
		System.out.println(name);
			
		}
		
		
		
		Festivals festival2 = new Festivals("5 days", "Hindu");
		System.out.println("the no of days is  "+festival2.duration);
		System.out.println("the religion is  "+festival2.religion);
		
		
		
		Festivals festival3 = new Festivals("Religious");
		System.out.println("the id is  "+festival3.festivalreligion);
		
}}