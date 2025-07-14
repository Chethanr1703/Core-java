class DoorDash{
	
	public static double getPrice(String shakes){
		double price = 0.0;
		
		if(shakes=="Milk") price = 110;
		else if(shakes=="Chocolate") price =100 ;
		else if(shakes=="Vanilla") price =80 ;
		else if(shakes=="Kaju") price = 70;
		else if(shakes=="Butterscotch") price = 60;
		else if(shakes=="Badam") price =70 ;
		else if(shakes=="Kesar") price =80 ;
		else if(shakes=="Smoodh") price = 70;
		else if(shakes=="Toffee") price = 60;
		else if(shakes=="Strawberry") price =50 ;
		else if(shakes=="Cold Coffee") price =50 ;
		else if(shakes=="Double Chocolate") price = 80;
		else if(shakes=="kulfi Caramel:") price =90 ;
		else if(shakes=="Almond") price = 70;
		else if(shakes=="Peanut") price = 70;
		else if(shakes=="Cocoa Powder ") price = 50;
		else if(shakes=="mangoes") price = 50;
		else if(shakes=="papayas") price = 50;
		else if(shakes=="kiwi") price = 60;
		else if(shakes=="Spinach") price = 80;
		else if(shakes=="Oreo") price = 80;
		else if(shakes=="kitkat") price =70 ;
		else if(shakes=="protien") price =70 ;
		else if(shakes=="mix fruit") price = 50;
		else if(shakes=="coco") price = 50;
		
		else System.out.println("the Shake is not found");
		return price;
		}
		}