class Bar{
	public static void getbrands(){
		System.out.println("the number of alcohol Names are "+BarRunner.alcoholNames.length);
			//System.out.println(alcoholNames[0]+"  "+alcoholNames[1]+"  "+alcoholNames[2]+"  "+alcoholNames[3]+"  "+alcoholNames[4]+"  "+alcoholNames[5]+"  "+alcoholNames[6]+"  "+alcoholNames[7]+"  "+alcoholNames[8]+"  "+alcoholNames[9]+"  "+alcoholNames[10]+"  "+alcoholNames[11]);
			for(String alcohol :BarRunner.alcoholNames){
				System.out.println(alcohol);
			}
	}
}