class GunRunner{
	public static void main(String []gu){
		Gun g1=new Gun();
		g1.display();
		
		Gun g2=new Gun(501);
		g2.display();
		
		Gun g3=new Gun("ak",2);
		g3.display();
		
		Gun g4=new Gun(47,true,true);
		g4.display();
		
		Gun g5=new Gun(true);
		g5.display();
		
		Gun g6=new Gun(501,"ak",4,47,true,true);
		g6.display();
	}
}