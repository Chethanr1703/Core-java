class EggRunner{
	public static void main(String[]egg){
		Egg e1=new Egg();
		e1.display();
		
		Egg e2=new Egg(102);
		e2.display();
		
		Egg e3=new Egg("nati","30-07-2025");
		e3.display();
		
		Egg e4=new Egg("nati","30-07-2025");
		e4.display();
		
		Egg e5=new Egg(101,"bolier","31-07-2025",7.50,true,"good");
		e5.display();
	}
}