class ClothsRunner{
	public static void main(String []cloth){
		String isMaterial= Cloths.givenMaterial();
		System.out.println("the material of the Cloth is "+isMaterial);
		
		String isTexture= Cloths.giventexture();
		System.out.println("the material of the Cloth is "+isTexture);
	
		String isWaterResistance= Cloths.givenWaterResistance();
		System.out.println("the material of the Cloth is "+isWaterResistance);
		
		String isShrinkage= Cloths.givenShrinkage();
		System.out.println("the material of the Cloth is "+isShrinkage);
		
		String isColorRetention= Cloths.givenColorRetention();
		System.out.println("the material of the Cloth is "+isColorRetention);
	
	}
}