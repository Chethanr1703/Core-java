class Zomato{
	public static double getFoodPrice(String food){
	double	getFoodPrice = 0.0;
		
		if(food=="Chicken Briyani") {
			getFoodPrice=180;
			
		}
		else if(food=="Mutton Briyani"){
		getFoodPrice= 280;
		
		}
		else if(food=="egg Briyani"){
			getFoodPrice=150 ;
			
		} 
		else if(food=="Briyani Rice") {
			getFoodPrice= 100 ;
			
		}
		else if(food=="egg Rice") {
			getFoodPrice= 90;
			
		}
		else if(food=="Chilli Chicken") {
			getFoodPrice= 150;
			
		}
		else if(food=="pepper Chicken"){
			 getFoodPrice= 150;
			 
		}
		else if(food=="guntur Chicken"){
			getFoodPrice= 150;
			
		} 
		else if(food=="Chicken 65") {
			getFoodPrice= 180 ;
			
		}
		else if(food=="Chicken kabab"){
			 getFoodPrice= 150;
			 
		}
		else if(food=="pepper dry"){
			getFoodPrice= 150;
			
		} 
		else if(food=="Chicken fry"){
			 getFoodPrice=200 ;
			 
		}
		else if(food=="Chicken cury"){
			getFoodPrice=200 ;
			
		} 
		else if(food=="Mutton pepper"){
			getFoodPrice=240 ;
			
		} 
		else if(food=="Mutton cury "){
			 getFoodPrice= 250;
			 
		}
		else if(food=="Mutton Fry"){
			 getFoodPrice= 250;
			 
		}
		else if(food=="Leg Soup") {
			getFoodPrice=80 ;
			
		}
		else if(food=="Dosa With Cury"){
			getFoodPrice= 100 ;
			
		} 
		else if(food=="Egg cury") {
			getFoodPrice= 120;
			
		}
		else if(food=="Egg kabab") {
			getFoodPrice= 100;
			
		}
		else if(food=="egg Fry") {
			getFoodPrice=120 ;
			
		}
		else if(food=="Boiled Egg"){
			getFoodPrice= 10;
			
		} 
		else if(food=="vangi bath"){
			getFoodPrice=50 ;
			
		} 
		else if(food=="Curd Rice"){
			getFoodPrice= 50 ;
			
		} 
		else if(food=="plainDosa"){
			 getFoodPrice= 25;
			 
		}
		else if(food=="edli"){
			 getFoodPrice= 35;
			 
		}
		else if(food=="puri"){
			getFoodPrice= 35;
			
		} 
		else if(food=="Vada"){
			getFoodPrice=25 ;
			
		} 
		else if(food=="Masala Dosa"){
			getFoodPrice= 70;
			
			} 
		else if(food=="butter Dosa"){
			getFoodPrice= 80;
			
		} 
		else if(food=="Rice and Sambhar") {
			getFoodPrice= 50;
			
		}
		else System.out.println("the Food item is not found ");
		
		
		
		
		return getFoodPrice;
	}
	
	public static double getFoodPrice(String food,int quantity){
		
	double	getFoodPrice = 0.0;
		
		if(food=="Chicken Briyani") {
			getFoodPrice=180*quantity;
			return getFoodPrice;
		}
		else if(food=="Mutton Briyani"){
		getFoodPrice= 280*quantity;
		return getFoodPrice;
		}
		else if(food=="egg Briyani"){
			getFoodPrice=150*quantity ;
			return getFoodPrice;
		} 
		else if(food=="Briyani Rice") {
			getFoodPrice= 100 *quantity;
			return getFoodPrice;
		}
		else if(food=="egg Rice") {
			getFoodPrice= 90*quantity;
			return getFoodPrice;
		}
		else if(food=="Chilli Chicken") {
			getFoodPrice= 150*quantity;
			return getFoodPrice;
		}
		else if(food=="pepper Chicken"){
			 getFoodPrice= 150*quantity;
			 return getFoodPrice;
		}
		else if(food=="guntur Chicken"){
			getFoodPrice= 150*quantity;
			return getFoodPrice;
		} 
		else if(food=="Chicken 65") {
			getFoodPrice= 180*quantity ;
			return getFoodPrice;
		}
		else if(food=="Chicken kabab"){
			 getFoodPrice= 150*quantity;
			 return getFoodPrice;
		}
		else if(food=="pepper dry"){
			getFoodPrice= 150*quantity;
			return getFoodPrice;
		} 
		else if(food=="Chicken fry"){
			 getFoodPrice=200 *quantity;
			 return getFoodPrice;
		}
		else if(food=="Chicken cury"){
			getFoodPrice=200 *quantity;
			return getFoodPrice;
		} 
		else if(food=="Mutton pepper"){
			getFoodPrice=240 *quantity;
			return getFoodPrice;
		} 
		else if(food=="Mutton cury "){
			 getFoodPrice= 250*quantity;
			return getFoodPrice; 
		}
		else if(food=="Mutton Fry"){
			 getFoodPrice= 250*quantity;
			 return getFoodPrice;
		}
		else if(food=="Leg Soup") {
			getFoodPrice=80*quantity ;
			return getFoodPrice;
		}
		else if(food=="Dosa With Cury"){
			getFoodPrice= 100*quantity ;
			return getFoodPrice;
		} 
		else if(food=="Egg cury") {
			getFoodPrice= 120*quantity;
			return getFoodPrice;
		}
		else if(food=="Egg kabab") {
			getFoodPrice= 100*quantity;
			return getFoodPrice;
		}
		else if(food=="egg Fry") {
			getFoodPrice=120 *quantity;
			return getFoodPrice; 
		}
		else if(food=="Boiled Egg"){
			getFoodPrice= 10*quantity;
			return getFoodPrice;
		} 
		else if(food=="vangi bath"){
			getFoodPrice=50 *quantity;
			return getFoodPrice;
		} 
		else if(food=="Curd Rice"){
			getFoodPrice= 50 *quantity;
			return getFoodPrice;
		} 
		else if(food=="plainDosa"){
			 getFoodPrice= 25*quantity;
			 return getFoodPrice;
		}
		else if(food=="edli"){
			 getFoodPrice= 35*quantity;
			return getFoodPrice; 
		}
		else if(food=="puri"){
			getFoodPrice= 35*quantity;
			return getFoodPrice;
		} 
		else if(food=="Vada"){
			getFoodPrice=25*quantity ;
			return getFoodPrice;
		} 
		else if(food=="Masala Dosa"){
			getFoodPrice= 70*quantity;
			return getFoodPrice;
			} 
		else if(food=="butter Dosa"){
			getFoodPrice= 80*quantity;
			return getFoodPrice;
		} 
		else if(food=="Rice and Sambhar") {
			getFoodPrice= 50*quantity;
			return getFoodPrice;
		}
		else System.out.println("the Food item is not found ");
		
		
		
		
		return getFoodPrice;
	}

}