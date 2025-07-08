class JuiceShop{
public static void getJuices(){
System.out.println("the number of Juices are "+JuiceShopRunner.juice.length);
			//System.out.println(juice[0]+"  "+juice[1]+"  "+juice[2]+"  "+juice[3]+"  "+juice[4]+"  "+juice[5]+"  "+juice[6]+"  "+juice[7]+"  "+juice[8]+"  "+juice[9]+"  "+juice[10]+"  "+juice[11]+"  "+juice[12]+"  "+juice[13]+"  "+juice[14]);
			for(String juiceName:JuiceShopRunner.juice){
			System.out.println(juiceName);
		}}}