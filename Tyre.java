class Tyre{
	
	static int loadCapacity;
	static String durability;
	static String mounting;
	static String shockAbsorption;
	static boolean wearResistance;
	
	public static int loadCapacity(){
		loadCapacity	= 1000;
		return loadCapacity;
	}
	public static String durability(){
		durability="They should be strong enough to resist damage from impacts and collisions.  ";
		return durability;
	}
	public static String mounting(){
		mounting=" Safe and easy mounting and dismounting are important for maintenance.   ";
		return mounting;
	}
	public static String shockAbsorption(){
		shockAbsorption="The ability of a tire to maintain traction on wet surfaces is essential for safe braking and handling. ";
		return shockAbsorption;
	}
	public static boolean wearResistance(){
		wearResistance=true;
		return wearResistance;
	}

	
}