class SuperMarket{

		public static void main(String[]product){
		
			String	iceCreams[]={"Vanilla","Strawberry","Kulfi","Frozen Yogurt","Blue Bell","Cones","Butterscotch","Mint Chocolate Chip","Cookies and Cream","Pistachio"};
			
			String  perfumes[]={"Titan","Gucci","Davidoff","Fougere","Park Avenue","Renee","Wild Stone","Ajmal ","The Man Campany ","Calvin Klein"};
			
			String  groceries[]= {"Rice","Egg","Milk","Bread","Onion","Tomatoes","Fresh fruits.","maggi","pasta","Leafy greens "};
			
			String  cosmetics[]={"Cetaphil","Ponds","Lakmé","Biotique","Minimalist","Earthen","The Face Shop","Re'equil","Innisfree","Elle18"};
			
			System.out.println("the number of iceCreams product are "+iceCreams.length);
			//System.out.println(iceCreams[0] + "   "+iceCreams[1] +"   "+iceCreams[2] +"   "+iceCreams[3] +"   "+iceCreams[4] +"   "+iceCreams[5] +"   "+iceCreams[6] +"   "+iceCreams[7] +"   "+iceCreams[8] +"   "+iceCreams[9]);
			
			
			for(String	iceCream	: iceCreams){
					System.out.println(iceCream);
					}
					
					
			System.out.println("the number of perfumes product are "+perfumes.length);
			//System.out.println(perfumes[0] +"  "+perfumes[1] +"  "+perfumes[2] +"  "+perfumes[3] +"  "+perfumes[4] +"  "+perfumes[5] +"  "+perfumes[6] +"  "+perfumes[7] +"  "+perfumes[8] +"  "+perfumes[9]);
			
			
			
			for(String perfume:perfumes){
					System.out.println(perfume);
				}
			System.out.println("the number of groceries product are "+groceries.length);
			//System.out.println(groceries[0]+"  "+groceries[1]+"  "+groceries[2]+"  "+groceries[3]+"  "+groceries[4]+"  "+groceries[5]+"  "+groceries[6]+"  "+groceries[7]+"  "+groceries[8]+"  "+groceries[9]);
			
			for(String Grocerie: groceries){
					System.out.println(Grocerie);
				}
			
			System.out.println("the number of cosmetics product are "+cosmetics.length);
			//System.out.println(cosmetics[0]+"  "+cosmetics[1]+"  "+cosmetics[2]+"  "+cosmetics[3]+"  "+cosmetics[4]+"  "+cosmetics[5]+"  "+cosmetics[6]+"  "+cosmetics[7]+"  "+cosmetics[8]+"  "+cosmetics[9]);
			
					
			for(String cosmetic:cosmetics){
					System.out.println(cosmetic);
				}
			
			
			}
}