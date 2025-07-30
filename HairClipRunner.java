class HairClipRunner{
	
	public static void main(String []clip){
		
		
	String	hairClipMaterial[]={"wooden","iron","plastic","steel"};
		
		HairClip hairClip1 = new HairClip(1001, "black");
		System.out.println("the id is "+hairClip1.hairClipId);
		System.out.println("the id is "+hairClip1.hairClipColor);
		
		
		
		HairClip hairClip2 = new HairClip(hairClipMaterial);
		System.out.println("the hairClipMaterial is ");
		for(String clipr :hairClipMaterial){
			System.out.println(clipr);
		}
		
		
		
		HairClip hairClip3 = new HairClip( 10, 15);
		System.out.println("the id is "+hairClip3.noOfTeeth);
		System.out.println("the id is "+hairClip3.hairClipPrice);
		
		
		
		

}}