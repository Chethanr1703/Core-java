class customer{
public static void checkProduct(String productName,int price,String Overall){
	System.out.println("checkProduct Started ");
	
	
		System.out.println("checkProduct productName " +BookProductRunner.productName);
		System.out.println("checkProduct price "+BookProductRunner.price);
		System.out.println("checkProduct Overall "+BookProductRunner.Overall);
			


			ProductReviews.reviewDetails(BookProductRunner.noOFFiveRating,BookProductRunner.noOFFourRating);
		System.out.println("checkProduct ended ");
}}