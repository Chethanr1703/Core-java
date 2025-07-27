class Hat{
	
	
		Hat(){
		
	}
	Hat(int hatId,String hatMaterialType,String hatType,String hatColor, boolean isAdjustable){
		this.hatId=hatId;
		this.hatMaterialType=hatMaterialType;
		this.hatType=hatType;
		this.hatColor=hatColor;
		this.isAdjustable=isAdjustable;
		
	}
	
	int hatId ;
	String hatMaterialType;
	String hatType;
	String hatColor;
	boolean isAdjustable;
	
	public void getHatInfo(){
			System.out.println("the hatId of the hat12 is :" + hatId);
	System.out.println("the hatMaterialType of the hat12 is " + hatMaterialType);
	System.out.println("the hatType of the hat12 is " + hatType);
	System.out.println("the color of the hat12 is " + hatColor);
	System.out.println("isAdjustable :" +isAdjustable);
	}
}