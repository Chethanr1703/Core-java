class Hospital{
	public static void getDoctor(){
		System.out.println("the number of names are "+HospitalRunner.doctorNames.length);
			//System.out.println(doctorNames[0]+"  "+doctorNames[1]+"  "+doctorNames[2]+"  "+doctorNames[3]+"  "+doctorNames[4]+"  "+doctorNames[5]+"  "+doctorNames[6]+"  "+doctorNames[7]+"  "+doctorNames[8]+"  "+doctorNames[9]);
			for(String name:HospitalRunner.doctorNames){
				System.out.println(name);
			}

	}
}