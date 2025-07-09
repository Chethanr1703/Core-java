class GoogleFormRunner{
	public static void main(String[] GFR){
		boolean isCorrectValidation = GoogleForm.register("abhi","S","Abhi@gmail.com",9036666267l,"Male",21);
		System.out.println("the Form Validation is   "+isCorrectValidation);
		
		GoogleForm.getDetails();
	}
}