class Hospital{
	int hospitalId;
	String name;
	String location;
	Department diffDepartment;
	
	
	public void getHospitalInfo(){
	System.out.println("fetching hospital info******   ");
		
	System.out.println("the id of the hospital is :"+hospitalId);
	System.out.println("the name of the hospital is :"+name);
	System.out.println("the location of the hospital is :"+location);
	
	
	this.diffDepartment.getDepartmentInfo();
}}