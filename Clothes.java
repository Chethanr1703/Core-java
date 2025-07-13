class Clothes{
	static String material;
	static String texture;
	static boolean waterResistance;
	static boolean shrinkage;
	static boolean colorRetention;
	
	public static String givenMaterial(){
		material= "Cotton";
		return material;
	} 
	public static String giventexture(){
		texture="roughness";
		return texture;
	}
	public static boolean givenWaterResistance(){
		waterResistance =true;
		return waterResistance;
	}
	public static boolean givenShrinkage(){
		shrinkage =false;
		return shrinkage;
	}
	public static boolean givenColorRetention(){
		colorRetention =true;
		return colorRetention;
	}
	
}