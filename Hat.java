class Hat{
	int hatId ;
	String hatMaterialType;
	String hatType[];
	String hatColor;
	boolean isAdjustable;
	
		Hat(){
		System.out.println("the  Constructor invoked" );
	}
	Hat(int hatId,String hatMaterialType){
		System.out.println("the Parameter Constructor invoked" );
		this.hatId=hatId;
		this.hatMaterialType=hatMaterialType;
		
	}
	Hat(String hatType[]){
		this.hatType=hatType;
		
	}
	Hat(String hatColor, boolean isAdjustable){
		this.hatColor=hatColor;
		this.isAdjustable=isAdjustable;
		
	}
	
	
	
	public void getHatInfo(){
			System.out.println("the hatId of the hat12 is :" + hatId);
	System.out.println("the hatMaterialType of the hat12 is " + hatMaterialType);
	System.out.println("the hatType of the hat12 is " + hatType);
	System.out.println("the color of the hat12 is " + hatColor);
	System.out.println("isAdjustable :" +isAdjustable);
	}
}