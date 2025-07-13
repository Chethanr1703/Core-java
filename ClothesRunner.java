class ClothesRunner{
	public static void main(String []cloth){
		String isMaterial= Clothes.givenMaterial();
		System.out.println("the material of the Cloth is "+isMaterial);
		
		String isTexture= Clothes.giventexture();
		System.out.println("the texture of the Cloth is "+isTexture);
	
		boolean isWaterResistance= Clothes.givenWaterResistance();
		System.out.println("the Water Resistance of the Cloth is "+isWaterResistance);
		
		boolean isShrinkage= Clothes.givenShrinkage();
		System.out.println("the Shrinkage of the Cloth is "+isShrinkage);
		
		boolean isColorRetention= Clothes.givenColorRetention();
		System.out.println("the Color Retention of the Cloth is "+isColorRetention);
	
	}
}