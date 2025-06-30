class Ipl{
			
		static	String	iplTeamNames[]={"1. CSK ","2. RCB","3. MI","4. KKR","5. SRH","6. GT","7. PBKS","8. RR","9. GT","10. LSG"};

			public static void main(String teams[]){
			
			System.out.println("the total number of teams are "+iplTeamNames.length);
			
			//System.out.println(iplTeamNames[0]+"  "+iplTeamNames[1]+"  "+iplTeamNames[2]+"  "+iplTeamNames[3]+"  "+iplTeamNames[4]+"  "+iplTeamNames[5]+"  "+iplTeamNames[6]+"  "+iplTeamNames[7]+"  "+iplTeamNames[8]+"  "+iplTeamNames[9]);
			for(String Name:iplTeamNames){
			System.out.println(Name);
		}
			}  


}