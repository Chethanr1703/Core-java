class Swiggy{
	public static double getFoodPrice(String food){
	double	getFoodPrice =0.0;
		
		if(food=="Dal Makhani"){
			getFoodPrice =180 ;
			return getFoodPrice;
		} 
		else if (food=="Dal Fry"){
			getFoodPrice = 120;
			return getFoodPrice;
		}  
		else if (food=="PannerMasala"){
			 getFoodPrice =220 ;
			return getFoodPrice;
		} 
		else if (food=="Palak Panner"){
			getFoodPrice =200 ;
			return getFoodPrice;
		}  
		else if (food=="Mutter Panner"){
			 getFoodPrice = 200;
			 return getFoodPrice;
		} 
		else if (food=="Allo gobi") {
			 getFoodPrice = 150;
			 return getFoodPrice;
		}
		else if (food=="Chana Masala"){
			getFoodPrice =180 ;
			return getFoodPrice;
		}  
		else if (food=="MalaiKofta") {
			getFoodPrice = 180;
			return getFoodPrice;
		} 
		else if (food=="Veg Briyani"){
			  getFoodPrice =180 ;
			 return getFoodPrice; 
		} 
		else if (food=="Noodles"){
			 getFoodPrice = 180;
			 return getFoodPrice;
		} 
		else if (food=="kadhaiPanner"){
			 getFoodPrice = 200;
			 return getFoodPrice;
		}  
		else if (food=="Paneer Paratha"){
			 getFoodPrice = 200;
			 return getFoodPrice;
		} 
		else if (food=="Gobi Paratha"){
			 getFoodPrice =220 ;
			 return getFoodPrice;
		} 
		else if (food=="Aloo Pyaz Paratha"){
			getFoodPrice = 200;
			return getFoodPrice;
		}  
		else if (food=="Naan"){
			getFoodPrice = 50;
			return getFoodPrice;
		}  
		else if (food=="Butter Naan") {
			getFoodPrice =60 ;
			return getFoodPrice;
		}  
		else if (food=="Roti") {
			getFoodPrice = 40;
			return getFoodPrice;
		} 
		else if (food=="Jeera Rice"){
			getFoodPrice = 150;
			return getFoodPrice;
		}  
		else if (food=="Ghee Rice"){
			getFoodPrice = 120;
			return getFoodPrice;
		}  
		else if (food=="Laccha Paratha"){
			getFoodPrice = 50;
			return getFoodPrice;
		}  
		else if (food=="Steamed Rice") {
			 getFoodPrice = 80;
			 return getFoodPrice;
		}
		else if (food=="pongal") {
			getFoodPrice =80 ;
			return getFoodPrice;
		} 
		else if (food=="Soya palak") {
			getFoodPrice =100 ;
			return getFoodPrice;
		} 
		else if (food=="Panner tika"){
			getFoodPrice = 120;
			return getFoodPrice;
		}  
		else if (food=="green Salad"){
			 getFoodPrice = 25;
			 return getFoodPrice;
		} 
		else if (food=="fry papad"){
			 getFoodPrice = 20;
			 return getFoodPrice;
		} 
		else if (food=="roast papad"){
			 getFoodPrice = 15;
			 return getFoodPrice;
		} 
		else if (food=="Masala papad"){
			 getFoodPrice = 30;
			 return getFoodPrice;
		} 
		else if (food=="tomato rice"){
			 getFoodPrice =50 ;
			 return getFoodPrice;
		} 
		else if (food=="lemon rice"){
			getFoodPrice = 50;
			return getFoodPrice;
		}  
		else if (food=="masala rice"){
			getFoodPrice =50 ;
			return getFoodPrice;
		}  
		else if (food=="veg handi") {
			getFoodPrice = 90;
			return getFoodPrice;
		} 
		else System.out.println("the food is not found ");
		
		return getFoodPrice;
		
		
	}
	
	public static double getFoodPrice(String food,int quantity){
	double	getFoodPrice =0.0;
		
		if(food=="Dal Makhani"){
			getFoodPrice =180*quantity ;
			return getFoodPrice;
		} 
		else if (food=="Dal Fry"){
			getFoodPrice = 120*quantity;
			return getFoodPrice;
		}  
		else if (food=="PannerMasala"){
			 getFoodPrice =220 *quantity;
			return getFoodPrice;
		} 
		else if (food=="Palak Panner"){
			getFoodPrice =200*quantity ;
			return getFoodPrice;
		}  
		else if (food=="Mutter Panner"){
			 getFoodPrice = 200*quantity;
			 return getFoodPrice;
		} 
		else if (food=="Allo gobi") {
			 getFoodPrice = 150*quantity;
			 return getFoodPrice;
		}
		else if (food=="Chana Masala"){
			getFoodPrice =180 *quantity;
			return getFoodPrice;
		}  
		else if (food=="MalaiKofta") {
			getFoodPrice = 180*quantity;
			return getFoodPrice;
		} 
		else if (food=="Veg Briyani"){
			  getFoodPrice =180*quantity ;
			 return getFoodPrice; 
		} 
		else if (food=="Noodles"){
			 getFoodPrice = 180*quantity;
			 return getFoodPrice;
		} 
		else if (food=="kadhaiPanner"){
			 getFoodPrice = 200*quantity;
			 return getFoodPrice;
		}  
		else if (food=="Paneer Paratha"){
			 getFoodPrice = 200*quantity;
			 return getFoodPrice;
		} 
		else if (food=="Gobi Paratha"){
			 getFoodPrice =220 *quantity;
			 return getFoodPrice;
		} 
		else if (food=="Aloo Pyaz Paratha"){
			getFoodPrice = 200*quantity;
			return getFoodPrice;
		}  
		else if (food=="Naan"){
			getFoodPrice = 50*quantity;
			return getFoodPrice;
		}  
		else if (food=="Butter Naan") {
			getFoodPrice =60 *quantity;
			return getFoodPrice;
		}  
		else if (food=="Roti") {
			getFoodPrice = 40*quantity;
			return getFoodPrice;
		} 
		else if (food=="Jeera Rice"){
			getFoodPrice = 150*quantity;
			return getFoodPrice;
		}  
		else if (food=="Ghee Rice"){
			getFoodPrice = 120*quantity;
			return getFoodPrice;
		}  
		else if (food=="Laccha Paratha"){
			getFoodPrice = 50*quantity;
			return getFoodPrice;
		}  
		else if (food=="Steamed Rice") {
			 getFoodPrice = 80*quantity;
			 return getFoodPrice;
		}
		else if (food=="pongal") {
			getFoodPrice =80*quantity ;
			return getFoodPrice;
		} 
		else if (food=="Soya palak") {
			getFoodPrice =100*quantity ;
			return getFoodPrice;
		} 
		else if (food=="Panner tika"){
			getFoodPrice = 120*quantity;
			return getFoodPrice;
		}  
		else if (food=="green Salad"){
			 getFoodPrice = 25*quantity;
			 return getFoodPrice;
		} 
		else if (food=="fry papad"){
			 getFoodPrice = 20*quantity;
			 return getFoodPrice;
		} 
		else if (food=="roast papad"){
			 getFoodPrice = 15*quantity;
			 return getFoodPrice;
		} 
		else if (food=="Masala papad"){
			 getFoodPrice = 30*quantity;
			 return getFoodPrice;
		} 
		else if (food=="tomato rice"){
			 getFoodPrice =50 *quantity;
			 return getFoodPrice;
		} 
		else if (food=="lemon rice"){
			getFoodPrice = 50*quantity;
			return getFoodPrice;
		}  
		else if (food=="masala rice"){
			getFoodPrice =50*quantity ;
			return getFoodPrice;
		}  
		else if (food=="veg handi") {
			getFoodPrice = 90*quantity;
			return getFoodPrice;
		} 
		else System.out.println("the food is not found ");
		
		return getFoodPrice;
		
		
	}
}