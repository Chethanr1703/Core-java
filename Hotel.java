class Hotel{
public static void getMenus(){
System.out.println(" the number of items in the menu is "+HotelRunner.menu.length)   ;
		//System.out.println(menu[0]+"  "+menu[1]+" "+menu[2]+"  "+menu[3]+"  "+menu[4]+"  "+menu[5]+" "+menu[6]+" "+menu[7]+"  "+menu[8]+" "+menu[9]+"  "+menu[10]+" "+menu[11]+" "+menu[12]+"  "+menu[13]+" "+menu[14]+" "+menu[15]+"  "+menu[16]+" "+menu[17]+" "+menu[18]+"  "+menu[19]+"  "+menu[20]+"  "+menu[21]+"  "+menu[22]+"  "+menu[23]+"  "+menu[24]);
			for(String Mainmenu:HotelRunner.menu){
				System.out.println(Mainmenu);
			}}}