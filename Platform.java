class Platform{
	int id;
	String platformName;
	int noOfofficer;
	Bus bus;
	
	public void getPlatforminfo(){
		System.out.println("fetching platform info  ");
		System.out.println("the id of the platform is :"+id);
		System.out.println("the name of the platform is :"+platformName);
		System.out.println("the noOfofficer in platform is :"+noOfofficer);
		bus.getBusInfo();
	}
}