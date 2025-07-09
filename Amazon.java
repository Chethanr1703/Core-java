class Amazon{
public static void productDetails(String productName){
	System.out.println("productDetails Started ");
		
			System.out.println("the name of the product is "+BookProductRunner.productName);

			customer.checkProduct(BookProductRunner.productName,BookProductRunner.price,BookProductRunner.Overall);
				Delivery.deliveryDetails(BookProductRunner.orderNo);
		System.out.println("productDetails ended ");
}}