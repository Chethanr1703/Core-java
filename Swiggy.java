class Swiggy{
	public static double getFoodPrice(String food){
	double	getFoodPrice =0.0;
		
		if(food=="Dal Makhani") getFoodPrice =180 ;
		else if (food=="Dal Fry") getFoodPrice = 120;
		else if (food=="PannerMasala") getFoodPrice =220 ;
		else if (food=="Palak Panner") getFoodPrice =200 ;
		else if (food=="Mutter Panner") getFoodPrice = 200;
		else if (food=="Allo gobi") getFoodPrice = 150;
		else if (food=="Chana Masala") getFoodPrice =180 ;
		else if (food=="MalaiKofta") getFoodPrice = 180;
		else if (food=="Veg Briyani") getFoodPrice =180 ;
		else if (food=="Noodles") getFoodPrice = 180;
		else if (food=="kadhaiPanner") getFoodPrice = 200;
		else if (food=="Paneer Paratha") getFoodPrice = 200;
		else if (food=="Gobi Paratha") getFoodPrice =220 ;
		else if (food=="Aloo Pyaz Paratha") getFoodPrice = 200;
		else if (food=="Naan") getFoodPrice = 50;
		else if (food=="Butter Naan") getFoodPrice =60 ;
		else if (food=="Roti") getFoodPrice = 40;
		else if (food=="Jeera Rice") getFoodPrice = 150;
		else if (food=="Ghee Rice") getFoodPrice = 120;
		else if (food=="Laccha Paratha") getFoodPrice = 50;
		else if (food=="Steamed Rice") getFoodPrice = 80;
		else if (food=="pongal") getFoodPrice =80 ;
		else if (food=="Soya palak") getFoodPrice =100 ;
		else if (food=="Panner tika") getFoodPrice = 120;
		else if (food=="green Salad") getFoodPrice = 25;
		else if (food=="fry papad") getFoodPrice = 20;
		else if (food=="roast papad") getFoodPrice = 15;
		else if (food=="Masala papad") getFoodPrice = 30;
		else if (food=="tomato rice") getFoodPrice =50 ;
		else if (food=="lemon rice") getFoodPrice = 50;
		else if (food=="masala rice") getFoodPrice =50 ;
		else if (food=="veg handi") getFoodPrice = 90;
		else System.out.println("the food is not found ");
		
		return getFoodPrice;
		
		
	}
}