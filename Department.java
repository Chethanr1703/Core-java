class Department{
	int deparmentId;
	int noOfDepartment;
	String departmentName;
	Doctor doctor;
	
	public void getDepartmentInfo(){
		
	System.out.println("fetching deparment info******   ");
	System.out.println("the id of the deparment is :"+deparmentId);
	System.out.println("the noOfDepartment of the deparment is :"+noOfDepartment);
	System.out.println("the departmentName of the deparment is :"+departmentName);

	
	this.doctor.getDoctorinfo();
	
	}
	
}