class BladeRunner{
	public static void main(String []blade){
		String bladeType[]={"Pipe Cutting","Shaving blade","Glass Cuting Blade"};
		
		Blade	blade1 =new Blade(1,"Max",true);
		
		System.out.println("the Id of the Blade "+blade1.bladeId);
		System.out.println("the company Name of the blade  "+blade1.companyName);
		System.out.println("is both side shapered"+blade1.isBothSideSharped);
		
		Blade blade2= new Blade(5,3);
		
				System.out.println("the length "+blade2.lengthOfBlade);
				System.out.println("the width  is "+blade2.widhtOfBlade);


		Blade blade3 =new Blade("24-06-2025",bladeType);
		
				System.out.println("the manufactor date "+blade3.manufactorDate);
				System.out.println("the type of the blade are");
						
						for(String type :bladeType)
									System.out.println(type);


			
			
	}
}