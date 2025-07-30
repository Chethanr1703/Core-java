class InvitationCardRunner {
	public static void main(String[]cr){
		
	String 	invitationType[]={"marriage","house open","naming cermeony"};
        InvitationCard invitationCard1 = new InvitationCard(101);
		System.out.println("the invitationId is "+invitationCard1.invitationId);
		
		
		
        InvitationCard invitationCard2 = new InvitationCard(invitationType);
		System.out.println("the invitationType is ");
		for(String type :invitationType){
			System.out.println(type);
		}
		
		
        InvitationCard invitationCard3 = new InvitationCard("Paper", 25, 20);
		System.out.println("the invitationMaterial is "+invitationCard3.invitationMaterial);
		System.out.println("the invitationLength is "+invitationCard3.invitationLength);
		System.out.println("the invitationWidht is "+invitationCard3.invitationWidht);
		
		
}}