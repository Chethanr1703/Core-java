class BannerRunner{
	public static void main(String [] ban){
		int	islenght=	Banner.length();
		System.out.println("the lenght of the banner is :"+islenght);
		
		int  iswidht = Banner.widht();
		System.out.println("the widht of the banner is :"+iswidht);
		
		String isMaterial = Banner.material();
		System.out.println("the material of the banner is :"+isMaterial);
		
		String isShape = Banner.shape();
		System.out.println("the Shape of the banner is :"+isShape);
		
		String isPrinting =Banner.printing();
		System.out.println("the printing of the banner is :"+isPrinting);
		
	}
}