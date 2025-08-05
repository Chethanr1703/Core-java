class ColorRunner{
	
	public static void main(String []col){
		Color color1 =new Color();
		color1.display();
		
		Color color2 =new Color(1000002);
		color2.display();
		
		Color color3 =new Color(10001,"chemical");
		color3.display();
		
		
		Color color4 =new Color(6,60.0,true);
		color4.display();
		
		Color color5 =new Color(1,"natural",7,50.0,true,true);
		color5.display();
		
		
	}
}