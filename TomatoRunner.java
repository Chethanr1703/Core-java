class TomatoRunner{
	public static void main(String []toma){
		Tomato tomato1=new Tomato();
		tomato1.display();
		
		Tomato tomato2=new Tomato(2002);
		tomato2.display();
		
		Tomato tomato3=new Tomato("natural",200.0);
		tomato3.display();
		
		Tomato tomato4=new Tomato("medium");
		tomato4.display();
		
		Tomato tomato5=new Tomato("good",true);
		tomato5.display();
		Tomato tomato6=new Tomato(102,"natural",20.0,"good",true,"medium");
		tomato6.display();
	}
}