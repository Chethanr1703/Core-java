class BlazerRunner{
	public static void main(String []blazer){
	String	blazerColor[]={"black","blue","red","white"};
		
		Blazer	blazer1	= new Blazer(101, "Fabric",  "England");
		
		System.out.println("the id of blazer  "+blazer1.blazerId);
		System.out.println("the material of blazer  "+blazer1.blazerMaterailType);
		System.out.println("the country of blazer  "+blazer1.manufactorCompanyName);
		
		
		
		Blazer blazer2=new Blazer(false, "Peter England");
		
		System.out.println("the ispiping available in blazer  "+blazer2.isPipingAvaible);
		System.out.println("the campany name of blazer  "+blazer2.blazerBrand);
		
		Blazer blazer3=new Blazer(blazerColor);
		System.out.println("the color of blazer  ");
		
		for (String color : blazerColor){
			System.out.println(color);
		}
}}