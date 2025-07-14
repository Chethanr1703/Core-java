class GamingPc{
	
	static String powerfulProcessor;
	static String fastStorage;
	static String ampleRAM;
	static String dedicatedGraphicsCard;
	static boolean advancedCooling;
	
	public static String powerfulProcessor(){
		powerfulProcessor	= "Intel Core i7 or i9 and AMD Ryzen 7 or 9 series. ";
		return powerfulProcessor;
	}
	public static String fastStorage(){
		fastStorage="Solid-state drives ";
		return fastStorage;
	}
	public static String ampleRAM(){
		ampleRAM="RAM is used to store game data and assets that the CPU and GPU access frequently.  ";
		return ampleRAM;
	}
	public static String dedicatedGraphicsCard(){
		dedicatedGraphicsCard="NVIDIA GeForce RTX or AMD Radeon RX";
		return dedicatedGraphicsCard;
	}
	public static boolean advancedCooling(){
		advancedCooling=true;
		return advancedCooling;
	}

	
}