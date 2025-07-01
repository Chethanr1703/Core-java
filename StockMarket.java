class StockMarket{
			
			
	
/*	static String stock1="P & G Hygiene";
	static String stock2="Colgate-Palmoliv";
	static String stock3="TCS";
	static String stock4="Nestle India";
	static String stock5="Castrol Indi";
	static String stock6="Hyundai Motor I";
	static String stock7="Life Insurance";
	static String stock8="TATA";
	static String stock9="Coal India";
	static String stock10="BSE";
8*/	
		public static void main (String[]Stockes){
		
		
	 String stock1="P & G Hygiene";
	 String stock2="Colgate-Palmoliv";
	 String stock3="TCS";
	 String stock4="Nestle India";
	 String stock5="Castrol Indi";
	 String stock6="Hyundai Motor I";
	 String stock7="Life Insurance";
	 String stock8="TATA";
	 String stock9="Coal India";
	 String stock10="BSE";
		
		
		
		String	stockNames[]={stock1,stock2,stock3,stock4,stock5,stock6,stock7,stock8,stock9,stock10};
		

			System.out.println("the number of stock Names are "+stockNames.length);
			//System.out.println(stockNames[0]+"  "+stockNames[1]+"  "+stockNames[2]+"  "+stockNames[3]+"  "+stockNames[4]+"  "+stockNames[5]+"  "+stockNames[6]+"  "+stockNames[7]+"  "+stockNames[8]+"  "+stockNames[9]);
			
			
			
			
				
			for(String	Stock:	stockNames){
				System.out.println(Stock);
			}



}}