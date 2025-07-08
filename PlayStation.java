class PlayStation{
public static void getGames(){
System.out.println("the number of games are "+PlayStationRunner.games.length);
			//System.out.println(games[0]+"  "+games[1]+"  "+games[2]+"  "+games[3]+"  "+games[4]+"  "+games[5]+"  "+games[6]+"  "+games[7]+"  "+games[8]+"  "+games[9]);
			for(String game:PlayStationRunner.games){
				System.out.println(game);
			}}}