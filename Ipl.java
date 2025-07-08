class Ipl{
	public static void getTeams(){
		System.out.println("the total number of teams are "+IplRunner.iplTeamNames.length);
			
			//System.out.println(iplTeamNames[0]+"  "+iplTeamNames[1]+"  "+iplTeamNames[2]+"  "+iplTeamNames[3]+"  "+iplTeamNames[4]+"  "+iplTeamNames[5]+"  "+iplTeamNames[6]+"  "+iplTeamNames[7]+"  "+iplTeamNames[8]+"  "+iplTeamNames[9]);
			for(String Name:IplRunner.iplTeamNames){
			System.out.println(Name);
		}
	}
}