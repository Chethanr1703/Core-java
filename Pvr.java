class Pvr{
	int pvrId;
	String pvrName;
	Screen screen;
	
	
	Pvr(int pvrId,String pvrName, Screen screen){
		this.pvrId=pvrId;
		this.pvrName=pvrName;
		this. screen=screen;
		
	}
	
	public void getPvrInfo(){
		System.out.println("fetching the deatils of pvr -----");
		
		System.out.println("the id of the pvr is ;"+pvrId);
		System.out.println("the name of the pvr is :"+pvrName);
		
		
		this.screen.getScreenInfo();
	}
}