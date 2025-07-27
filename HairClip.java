class HairClip{
	
	HairClip(){
		System.out.println("the  Constructor invoked" );
	}
	HairClip(int hairClipId,String hairClipColor,	String hairClipMaterial,int noOfTeeth,int hairClipPrice){
				System.out.println("the Parameter Constructor invoked" );
		
		
		this.hairClipId=hairClipId;
		this.hairClipColor=hairClipColor;
		this.hairClipMaterial=hairClipMaterial;
		this.noOfTeeth=noOfTeeth;
		this.hairClipPrice=hairClipPrice;
		

	}
	int hairClipId;
	String hairClipColor;
	String hairClipMaterial;
	int noOfTeeth;
	int hairClipPrice;
	
	public void gethairInfo(){
		System.out.println("the id of the hairClip9 is :" + hairClipId);
        System.out.println("the hairClipColor of hairClip9 is : " + hairClipColor);
        System.out.println("the hair Clip Material of hairClip9 is :" + hairClipMaterial);
        System.out.println("the number of teeth in hairClip9 : " +noOfTeeth);
        System.out.println("the hairClipPrice of the hairClip9 is: " +hairClipPrice);
		
	}
}