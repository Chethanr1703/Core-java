class WeaponRunner{
	public static void main(String[]cr){
	String weaponType[]={"gun","bomb","bullets"};
Weapon weapon1 = new Weapon(1001, weaponType);
System.out.println("the weaponId is "+weapon1.weaponId);

System.out.println("the weaponType is ");
		for(String type :weaponType){
			System.out.println(type);
		}

Weapon weapon2 = new Weapon(1000, 12);	
System.out.println("the weaponWeight is "+weapon2.weaponWeight);
System.out.println("the noOfBullets is "+weapon2.noOfBullets);




Weapon weapon3 = new Weapon( true);	
System.out.println("the isManual is "+weapon3.isManual);

	

}}