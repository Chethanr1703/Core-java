class Weapon{
	
	
			Weapon(){
		System.out.println("the  Constructor invoked" );
	}
	Weapon(int weaponId,String weaponType,int weaponWeight,int noOfBullets, boolean isManual){
		System.out.println("the Parameter Constructor invoked" );
		this.weaponId=weaponId;
		this.weaponType=weaponType;
		this.weaponWeight=weaponWeight;
		this.noOfBullets=noOfBullets;
		this.isManual=isManual;
		
	}
	
	int weaponId;
	String weaponType;
	int weaponWeight;
	int noOfBullets;
	boolean isManual;
	
	public void getweaponInfo(){
		System.out.println("the id of the weapon is "+weaponId);
	System.out.println("the weaponType of the weapon1 is"+weaponType);
	System.out.println("thw weaponWeight of the weapon1 is"+weaponWeight);
	System.out.println("the noOfBullets of weapon1 is "+noOfBullets);
	System.out.println("weapon1 isManual "+isManual);
	
	}
}