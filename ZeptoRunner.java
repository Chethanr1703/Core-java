class ZeptoRunner{
	public static void main(String []zr){
	String	productName="Nutraj Cashew";
	double	isItem =Zepto.getPriceOfitem(productName);
	System.out.println("the price of the item is  "+isItem);
	
	int quantity = 7;
	double	isItemWithQuantity =Zepto.getPriceOfitem(productName,quantity);
	System.out.println("the price of the "+isItem+ " quantity of  "+quantity+" is  "+isItemWithQuantity);
	}
}