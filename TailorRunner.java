class TailorRunner{
	public static void main(String []tailor){
		String	isCommunication	=Tailor.communication();
		System.out.println("the Tailor Should know to communication :"+isCommunication);
		
		String	issewing	=Tailor.sewing();
		System.out.println("the Tailor Should know to sewing :"+issewing);
	
		boolean	isfabricKnowledge	=Tailor.fabricKnowledge();
		System.out.println("the Tailor Should know to fabricKnowledge :"+isfabricKnowledge);
	
		boolean	istimeManagement=Tailor.timeManagement();
		System.out.println("the Tailor Should know to timeManagement :"+istimeManagement);
	
		boolean	iscreativity	=Tailor.creativity();
		System.out.println("the Tailor Should know to creativity :"+iscreativity);
	
	}
}