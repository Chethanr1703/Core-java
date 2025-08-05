class HospitalRunner{
	
	public static void main(String []hos){
	
	Hospital hospital1=new Hospital();
	hospital1.hospitalId=1;
	hospital1.name="Sanjay Gandhi";
	hospital1.location="bengaluru";
	
	Department dept1=new Department();
	dept1.deparmentId=901;
	dept1.departmentName="ortho pedic";
	dept1.noOfDepartment=10;
	
	Doctor doc1 =new Doctor();
	doc1.doctorId=852;
	doc1.doctorName="Bharath";
	doc1.noOfExperience=5;
	
	
	
	// initailing the user defined class 
	dept1.doctor=doc1;
	
	hospital1.diffDepartment=dept1;
	
		hospital1.getHospitalInfo();
	}
}