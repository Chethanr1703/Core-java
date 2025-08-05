class TechPark{
	int techParkId;
	String name;
	String location;
	Block block;
	
	TechPark(int techParkId,String name,String location,Block block){
		this.techParkId=techParkId;
		this.name=name;
		this.location=location;
		this.block=block;
	}
	
	public void getTechParkInfo(){
				System.out.println("fetching TechPark info ----");
		System.out.println("the id of the TechPark is :"+techParkId);
		System.out.println("the name of the TechPark : "+name);
		System.out.println("the location in the TechPark :"+location);
		this.block.getBlockInfo();
}}