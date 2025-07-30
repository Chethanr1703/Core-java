class RotiRunner{
	
	public static void main (String []rr){
		String rotiShape[]={"oval","rectanle","triangle"};
	Roti	roti1	= new Roti(101,rotiShape);
	System.out.println("the id is "+roti1.rotiId);
	
	System.out.println("the rotiShape is ");
		for(String shape :rotiShape){
			System.out.println(shape);
		}
	
	Roti	roti2	= new Roti("romali", 25);
	System.out.println("the rotiType is "+roti2.rotiType);
	System.out.println("the rotiPrice is "+roti2.rotiPrice);
	
	
	Roti	roti3	= new Roti( true);
	System.out.println("the isbuttered is "+roti3.isbuttered);
	
	
}}