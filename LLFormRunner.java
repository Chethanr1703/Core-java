class LLFormRunner{
	public static void main(String[]llrunnner){
		boolean isFormValid =LLForm.registrationForm("Nandan" ,"10-07-2023",9538864871l,"laggere",23);
		System.out.println("the validation of the Registration "+isFormValid);
		
		if(isFormValid==true)LLForm.getDetails();
	}
}