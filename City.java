class City{
	public static void getPincodes(){
		
		System.out.println("the number of Spices are "+CityRunner.pinCodes.length);
			//System.out.println(pinCodes[0]+"  "+pinCodes[1]+"  "+pinCodes[2]+"  "+pinCodes[3]+"  "+pinCodes[4]+"  "+pinCodes[5]+"  "+pinCodes[6]+"  "+pinCodes[7]+"  "+pinCodes[8]+"  "+pinCodes[9]+"  "+pinCodes[10]+"  "+pinCodes[11]+"  "+pinCodes[12]+"  "+pinCodes[13]);
			for( int code :CityRunner.pinCodes){
				System.out.println(code);
			}
	}
}