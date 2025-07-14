class WalkiTalkiRunner{
	public static void main(String []wtr){
		
	String isportability =	WalkiTalki.portability();
	System.out.println("the given WalkiTalki is "+isportability);
	
	boolean iseaseofUse =	WalkiTalki.easeofUse();
	System.out.println("the given WalkiTalki is easeofUse "+iseaseofUse);
	
	boolean iscostEffective =	WalkiTalki.costEffective();
	System.out.println("the given WalkiTalki is costEffective "+iscostEffective);
	
	int isrange =	WalkiTalki.range();
	System.out.println("the given WalkiTalki has range "+isrange);
	
	boolean isantenna =	WalkiTalki.antenna();
	System.out.println("the given WalkiTalki has antenna "+isantenna);
	
	}
}