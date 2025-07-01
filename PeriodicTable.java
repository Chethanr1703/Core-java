class PeriodicTable{
	
	
					/*	
		static String h="Hydrogyen";
		static String he="Helium";
	static String li="Lithium";
	static String b="Boron";
	static String c="Carbon ";
	static String n="Nitrogyen";
	static String o="Oxgyen";
	static String ar= "Argon";
	static String na="Sodium";
	static String mg="Magnisum";
	static String ag="Silver";
	static String au="Gold";
*/
	
	
	

		public static void main (String[]table){
			
					 String h="Hydrogyen";
		 String he="Helium";
	 String li="Lithium";
	 String b="Boron";
	 String c="Carbon ";
	 String n="Nitrogyen";
	 String o="Oxgyen";
	 String ar= "Argon";
	 String na="Sodium";
	 String mg="Magnisum";
	 String ag="Silver";
	 String au="Gold";
			
			
			
			
			
			
			String	elements[]={h,he,li,b,c,n,o,ar,na,mg,ag,au};

			System.out.println("the number of elements are "+elements.length);
			//System.out.println(elements[0]+"  "+elements[1]+"  "+elements[2]+"  "+elements[3]+"  "+elements[4]+"  "+elements[5]+"  "+elements[6]+"  "+elements[7]+"  "+elements[8]+"  "+elements[9]+"  "+elements[10]+"  "+elements[11]);
			for(String element:elements){
				System.out.println(element);
			}
}}