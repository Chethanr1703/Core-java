class SpiceShop{
	public static void main (String[]spi){

		String	spices[]={"Turmeric"," Jeera"," Coriander"," Mustard Seeds"," Fenugreek Seeds","Fennal Seeds"," Black Pepper","Cloves"," Cardamom"," RED chilli"," Cinnamom"," hing"," Bay Leaf"," Amchur"};
			
			System.out.println("the number of Spices are "+spices.length);
		//	System.out.println(spices[0]+"  "+spices[1]+"  "+spices[2]+"  "+spices[3]+"  "+spices[4]+"  "+spices[5]+"  "+spices[6]+"  "+spices[7]+"  "+spices[8]+"  "+spices[9]+"  "+spices[10]+"  "+spices[11]+"  "+spices[12]+"  "+spices[13]);
			for(String	spice :	spices){
				System.out.println(spice);
			}
}}