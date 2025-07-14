class MarketRunner{
	public static void main(String[]MR){
		String isArea = Market.givenAddress();
		System.out.println("the Address of the Market :"+isArea);
		
		int isPinCode = Market.givenPinCode();
		System.out.println("the given PinCode of the Market :"+isPinCode);
		
		String isType = Market.givenType();
		System.out.println("the given Type of the Market :"+isType);
		
		boolean isMediator = Market.givenMediator();
		System.out.println("the Mediator  :"+isMediator);
		
		boolean isCostless = Market.givenCostless();
		System.out.println("the Market is Costless : "+isCostless);
	}
}