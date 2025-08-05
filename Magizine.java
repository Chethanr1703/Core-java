class Magizine{
	int id;
	String magizineName;
	int noOfcatagaries;
	Page page;
	
	Magizine(int id ,String magizineName,int noOfcatagaries,Page page){
		this.id=id;
		this.magizineName=magizineName;
		this.noOfcatagaries=noOfcatagaries;
		this.page=page;
	}
	public void getMagizieInfo(){
		System.out.println(" fetching magizine info+++++++++");
		System.out.println("the id of the magizine is :"+id);
		System.out.println("the Name of the magizine is :"+magizineName);
		System.out.println("the noOfcatagaries of the magizine is :"+noOfcatagaries);
		
this.page.getPageinfo();
	}

}