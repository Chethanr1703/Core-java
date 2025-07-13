class River{
	
	static String salinity;
	static String alkalinity;
	static String hardness;
	static String acidity;
	static boolean corrosive;
	
	public static String salinity(){
		salinity	= "the total amount of dissolved salts";
		return salinity;
	}
	public static String alkalinity(){
		alkalinity="alkalinity measures the water's ability to neutralize acids  ";
		return alkalinity;
	}
	public static String hardness(){
		hardness=" hardness measures the concentration of calcium and magnesium  ";
		return hardness;
	}
	public static String acidity(){
		acidity="acidity is a measure of the concentration of hydrogen ions ";
		return acidity;
	}
	public static boolean corrosive(){
		corrosive=true;
		return corrosive;
	}

	
}