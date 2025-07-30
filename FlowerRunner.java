class FlowerRunner{
	public static void main(String[]pot){
		
	String	flowerName[]={"Mari gold","malige","rose","hibiscus"};
		
Flower	flower1=new Flower(10001, flowerName);
		System.out.println("the id is  "+flower1.flowerId);
		System.out.println("the name of the flower");
		for (String name:flowerName){
			System.out.println(name);
		}


Flower	flower2=new Flower("yellow", 20);
		System.out.println("the color is  "+flower2.flowerColor);
		System.out.println("the price is  "+flower2.price);



Flower	flower3=new Flower( true);
		System.out.println("the id is  "+flower3.isUsedForFood);


}}