class PlayStore{
				
				
				/*	
		static String whatsup="Whatapp";
		static String facebook="Facebook";
	static String youtube="Youtube";
	static String insta="Instagram";
	static String pe="Phonepe ";
	static String swigg="Swiggy";
	static String jio="Jio Hotstar";
	static String snap= "SnapChat";
	static String mesho="Mesho";
	static String net="Netflix";
*/





		public static void main(String[]media){
			
					 String whatsup="Whatapp";
		 String facebook="Facebook";
	 String youtube="Youtube";
	 String insta="Instagram";
	 String pe="Phonepe ";
	 String swigg="Swiggy";
	 String jio="Jio Hotstar";
	 String snap= "SnapChat";
	 String mesho="Mesho";
	 String net="Netflix";
			
			
			String	apps[]={whatsup,youtube,insta,pe,facebook,mesho,snap,net,jio,swigg};
			System.out.println("the number of Apps are "+apps.length);
			//System.out.println(apps[0]+"  "+apps[1]+"  "+apps[2]+"  "+apps[3]+"  "+apps[4]+"  "+apps[5]+"  "+apps[6]+"  "+apps[7]+"  "+apps[8]+"  "+apps[9]);
			for(String app:apps){
				System.out.println(app);
			}
}}			