class GamingPcRunner{
	
	public static void main(String[]pc){
		
	String ispowerfulProcessor	=GamingPc.powerfulProcessor();
	System.out.println("the GamingPc has powerfulProcessor "+ispowerfulProcessor);
	
	String isfastStorage	=GamingPc.fastStorage();
	System.out.println("the GamingPc has fastStorage "+isfastStorage);
	
	String isampleRAM	=GamingPc.ampleRAM();
	System.out.println("the GamingPc has ampleRAM "+isampleRAM);
	
	String isdedicatedGraphicsCard	=GamingPc.dedicatedGraphicsCard();
	System.out.println("the GamingPc has dedicatedGraphicsCard "+isdedicatedGraphicsCard);
	
	boolean isadvancedCooling	=GamingPc.advancedCooling();
	System.out.println("the GamingPc is advancedCooling "+isadvancedCooling);
	
	

}
}