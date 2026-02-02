class StockMarket{

		public static void main (String[]Stockes){
			String	stockNames[]={"P & G Hygiene","Colgate-Palmoliv","TCS","Nestle India","Castrol India","Hyundai Motor I","Life Insurance","TATA","Coal India","BSE"};

			System.out.println("the number of stock Names are "+stockNames.length);
			//System.out.println(stockNames[0]+"  "+stockNames[1]+"  "+stockNames[2]+"  "+stockNames[3]+"  "+stockNames[4]+"  "+stockNames[5]+"  "+stockNames[6]+"  "+stockNames[7]+"  "+stockNames[8]+"  "+stockNames[9]);
			
			for(String	Stock:	stockNames){
				System.out.println(Stock);
			}



}}