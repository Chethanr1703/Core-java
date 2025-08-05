class MagiziniRunner{
	public static void main(String []maz){
		
		
		Article article1=new Article(1708,"chethan",6);
		
		Page page1=new Page(101,50,80, article1);
		
		
		Magizine magizin1 =new Magizine(230,"Daily Hunt",50, page1);
		
		magizin1.getMagizieInfo();
	}
}