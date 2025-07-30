class KingRunner{
	public static void main(String []prince){
	String	kingName[]={"Krishna RAJA","Bhahadur ","Krishna Rajendra"};
	King king1 = new King(1);
	
	System.out.println("the id  is "+king1.kingId);
	
	
	King king2 = new King(kingName,"Raja Raja");
	
	
	System.out.println("the names is ");
		for(String name :kingName){
			System.out.println(name);
		}
	System.out.println("the family name is "+king2.familyName);
		
	
	King king3 = new King(100, 2);
	
	System.out.println("the king Wealth is "+king3.kingWealth);
	System.out.println("the noOfWifes is "+king3.noOfWifes);
	
	
}}