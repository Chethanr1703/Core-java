class HillStation{
public static void gethillstation(){
System.out.println("the number of resorts are "+HillStationRunner.resorts.length);
			//System.out.println(resorts[0]+"  "+resorts[1]+"  "+resorts[2]+"  "+resorts[3]+"  "+resorts[4]+"  "+resorts[5]+"  "+resorts[6]);
			for(String resort:HillStationRunner.resorts){
				System.out.println(resort);
			}
}}