class InvitationCard{
	
	InvitationCard(){
		System.out.println("the  Constructor invoked" );
	}
	InvitationCard(int invitationId,String invitationType,String invitationMaterial,int invitationLength, int invitationWidht){
		System.out.println("the Parameter Constructor invoked" );
		this.invitationId=invitationId;
		this.invitationType=invitationType;
		this.invitationMaterial=invitationMaterial;
		this.invitationLength=invitationLength;
		this.invitationWidht=invitationWidht;
		
	}
	
	
	int invitationId;
	String invitationType;
	String invitationMaterial;
	int invitationLength;
	int invitationWidht;
	
	public void getICinfo(){
		System.out.println("The id of invitationCard20 is " + invitationId);
	System.out.println("The invitationType of invitationCard20 is " + invitationType);
	System.out.println("The invitationMaterial of invitationCard20 is " + invitationMaterial);
	System.out.println("The invitationLength of invitationCard20 is " +invitationLength);
	System.out.println("The invitationWidht of invitationCard20 is " + invitationWidht);
	
	}
}