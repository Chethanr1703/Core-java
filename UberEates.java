class UberEates{
	
	public static double getPrice(String juiceName){
		double price = 0.0;
		
		if(juiceName == "PineApple" ) price = 120.0;
		
		else if(juiceName == "Coconut")  price = 67.0;
		else if(juiceName == "grape")  price = 40.0;
		else if(juiceName == "SugarCane")  price = 60.0;
		else if(juiceName == "Beet")  price = 99.0;
		else if(juiceName == "Bluebeery")  price = 87.0;
		else if(juiceName == "Cherry")  price = 48.0;
		else if(juiceName == "lemon")  price = 91.9;
		else if(juiceName == "Strawberry")  price = 40;
		else if(juiceName == "wheetGrass")  price = 70;
		else if(juiceName == "Cantaloupe")  price = 180 ; 
		else if(juiceName == "mosambi")  price = 40;
		else if(juiceName == "Apple")price = 120;
		else if(juiceName == "Pineapple")price = 110.0;
		else if(juiceName == "CranBerry")price = 92.0;
		else if(juiceName == "GrapeFruit")price = 150.0;
		else if(juiceName == "Pomegrante")price = 120.0;
		else if(juiceName == "watermelon")price = 54.0;
		else if(juiceName == "jal jeera")  price = 35;
		else if(juiceName == "AamPanna")  price = 89.0;
		else if(juiceName == "Avocado")  price = 100;
		else if(juiceName == "Calamansi")  price = 150;
		else if(juiceName == "Gooseberry")  price = 79.0;
		
		else if(juiceName == "carrot")  price = 60;
		else if(juiceName == "celery")  price = 40;
		else if(juiceName == "vegetable")  price = 40;
		else if(juiceName == "kiwi")  price = 80;
		
		else if(juiceName == "Guava")  price = 55.0;
		else if(juiceName == "papya")price = 45.0;
		else if(juiceName == "Raspberry") price = 70.0;
		
		
		else System.out.println("the juice is not there");
			return price;
	}
}
