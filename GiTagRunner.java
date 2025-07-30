class GiTagRunner{
	public static void main(String[]gitag){
	String	giType[]={"flower","food","animal","toys","Saree"};
		
		GiTag giTag1 = new GiTag(1, "Alphonso Mango", "2007");
		System.out.println("the id of gi  is "+giTag1.giTagId);
		System.out.println("the place of gi  is "+giTag1.place);

		System.out.println("the  year of  gi  is "+giTag1.year);
		
		
		GiTag giTag2 = new GiTag("Agricultural", "Maharashtra");
		System.out.println("the type of gi  is "+giTag2.type);
		System.out.println("the state of gi  is "+giTag2.state);
		
		
		
		GiTag giTag3 = new GiTag(giType);
		System.out.println("the type of gi  is ");
		for(String type:giType){
			System.out.println(type);
		}
		
		
		
}}