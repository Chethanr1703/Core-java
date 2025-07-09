class PropertyDetails{
public static void details(String propertyLocation,String propertyDimension){
	System.out.println("PropertyDetails Started ");
		
		System.out.println("the  propertyLocation is   "+RegistrationRunner.propertyLocation);
		System.out.println("the  propertyDimension is   "+RegistrationRunner.propertyDimension);


			FieldCheck.checkingfield( RegistrationRunner.nearBySchool, RegistrationRunner.nearByHospital);
		System.out.println("PropertyDetails ended ");
}}