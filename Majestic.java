class Majestic{
	int busStopId;
	String name;
	int noOfPlatform;
	Platform platform;
	
	public void getMajesticInfo(){
		System.out.println("fetching Majestic info-------");
		System.out.println("the id of the majestic :"+busStopId);
		System.out.println("the name of the busStop :"+name);
		System.out.println("the noOfPlatform :"+noOfPlatform);
		platform.getPlatforminfo();
	}
	
}