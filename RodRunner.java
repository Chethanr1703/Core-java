class RodRunner{
	public static void main(String[]rod){
		String rodBrand[]={"tmt","RRc","CCC"};
 Rod rod1 = new Rod(101, 700);
 System.out.println("the id is "+rod1.rodId);
	System.out.println("the pipeDaimeter is "+rod1.rodLength);
	
 
 Rod rod2 = new Rod(2, "Iron");
 
 System.out.println("the rodDaimeter is "+rod2.rodDaimeter);
	System.out.println("the rodType is "+rod2.rodType);
	
 
 Rod rod3 = new Rod(rodBrand);
 System.out.println("the rodBrand is ");
		for(String brand :rodBrand){
			System.out.println(brand);
		}
 
 
}}
