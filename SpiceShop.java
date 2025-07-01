class SpiceShop{
	
	/*static String turmeric="Turmeric";
	static String jeera="Jeera";
	static String coriander="Coriander";
	static String mustard="Mustard Seeds";
	static String fenu="Fenugreek Seeds";
	static String fennal="Fennal Seeds";
	static String black="Black Pepper";
	static String cloves="Cloves";
	static String cardamom="Cardamom";
	static String red="RED chilli";
	static String cinnamom="Cinnamom";
	static String hing="Hing";
	static String bay="Bay Leaf";
	static String amchur="Amchur";
	*/
	
	
		
	public static void main (String[]spi){
		
		
		
		
		
		
			String turmeric="Turmeric";
	 String jeera="Jeera";
	 String coriander="Coriander";
	 String mustard="Mustard Seeds";
	 String fenu="Fenugreek Seeds";
	 String fennal="Fennal Seeds";
	 String black="Black Pepper";
	 String cloves="Cloves";
	 String cardamom="Cardamom";
	 String red="RED chilli";
	 String cinnamom="Cinnamom";
	 String hing="Hing";
	 String bay="Bay Leaf";
	 String amchur="Amchur";

		String	spices[]={turmeric,jeera,coriander,mustard,fenu,fennal,black,cloves,cardamom,red,cinnamom,hing,bay,amchur};
			
			System.out.println("the number of Spices are "+spices.length);
		//	System.out.println(spices[0]+"  "+spices[1]+"  "+spices[2]+"  "+spices[3]+"  "+spices[4]+"  "+spices[5]+"  "+spices[6]+"  "+spices[7]+"  "+spices[8]+"  "+spices[9]+"  "+spices[10]+"  "+spices[11]+"  "+spices[12]+"  "+spices[13]);
			for(String	spice :	spices){
				System.out.println(spice);
			}
}}