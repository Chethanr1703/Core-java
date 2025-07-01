class Hospital{
	/*	
		static String cardiologist="Cardiologist";
	static String dermatologist="Dermatologist";
	static String endocrinologist="Endocrinologist";
	static String gastroenterologist="Gastroenterologist";
	static String neurologist="Neurologist";
	static String allergist="Allergist";
	static String anesthesiologist="Anesthesiologist";
	static String orthopedic= "Orthopedic";
	static String ophthalmologist= "Ophthalmologist";
	static String hematologist= "Hematologist";
			
	*/		
		

public static void main(String[]doctor){
	
		 String cardiologist="Cardiologist";
	 String dermatologist="Dermatologist";
	 String endocrinologist="Endocrinologist";
	 String gastroenterologist="Gastroenterologist";
	 String neurologist="Neurologist";
	 String allergist="Allergist";
	 String anesthesiologist="Anesthesiologist";
	 String orthopedic= "Orthopedic";
	 String ophthalmologist= "Ophthalmologist";
	 String hematologist= "Hematologist";
	
	
			String	doctorNames[]={cardiologist,dermatologist,endocrinologist,gastroenterologist,neurologist,allergist,anesthesiologist,orthopedic,ophthalmologist,hematologist};

			System.out.println("the number of names are "+doctorNames.length);
			//System.out.println(doctorNames[0]+"  "+doctorNames[1]+"  "+doctorNames[2]+"  "+doctorNames[3]+"  "+doctorNames[4]+"  "+doctorNames[5]+"  "+doctorNames[6]+"  "+doctorNames[7]+"  "+doctorNames[8]+"  "+doctorNames[9]);
			for(String name:doctorNames){
				System.out.println(name);
			}

}}