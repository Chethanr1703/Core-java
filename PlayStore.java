class PlayStore{
public static void getApps(){
					System.out.println("the number of Apps are "+PlayStoreRunner.apps.length);
			//System.out.println(apps[0]+"  "+apps[1]+"  "+apps[2]+"  "+apps[3]+"  "+apps[4]+"  "+apps[5]+"  "+apps[6]+"  "+apps[7]+"  "+apps[8]+"  "+apps[9]);
			for(String app:PlayStoreRunner.apps){
				System.out.println(app);
			}
}}