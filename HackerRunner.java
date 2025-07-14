class HackerRunner{
public static void main(String[]hacker){
		
	boolean isstrongProgrammingKnowledge	=Hacker.strongProgrammingKnowledge();
	System.out.println("the Hacker has strongProgrammingKnowledge "+isstrongProgrammingKnowledge+"kg");
	
	boolean isnetworkingExpertise	=Hacker.networkingExpertise();
	System.out.println("the Hacker has networkingExpertise "+isnetworkingExpertise);
	
	boolean isoperatingSystemProficiency	=Hacker.operatingSystemProficiency();
	System.out.println("the Hacker has operatingSystemProficiency "+isoperatingSystemProficiency);
	
	boolean iscryptographySkills	=Hacker.cryptographySkills();
	System.out.println("the Hacker has cryptographySkills "+iscryptographySkills);
	
	boolean isproblemSolvingAbilities	=Hacker.problemSolvingAbilities();
	System.out.println("the Hacker is problemSolvingAbilities "+isproblemSolvingAbilities);
}
}