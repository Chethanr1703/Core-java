class CustomerReportRunner{
	static int	item1Shop1=88;
	static int item2Shop1=98;
	static int item1Shop2=93;
	static int item2Shop2=103;
	static int item1Shop3=90;
	static int item2Shop3 =100;
	static boolean istrue;
	
	public static void main(String [] CRR){
		
		System.out.println("main Started ");
	System.out.println("ReportRunner Started ");
		
		ShopNo1.shopno1Prices( item1Shop1 , item2Shop1);
		ShopNo2.shopno2Prices( item1Shop2 , item2Shop2);
		ShopNo3.shopno3Prices( item1Shop3 , item2Shop3);
		
		
		

			

		System.out.println("ReportRunner ended ");
		System.out.println("main ended ");
		
	}
}