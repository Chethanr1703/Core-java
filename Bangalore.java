class Bangalore{
	public static void getAreas(){
		System.out.println("the number of Area names are "+BangaloreRunner.areaNames.length);
			//System.out.println(areaNames[0]+"  "+areaNames[1]+"  "+areaNames[2]+"  "+areaNames[3]+"  "+areaNames[4]+"  "+areaNames[5]+"  "+areaNames[6]+"  "+areaNames[7]);
			for(String area:BangaloreRunner.areaNames){
			System.out.println(area);
		}
	}
}