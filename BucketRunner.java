class BucketRunner{
	public static void main(String[]buck){
			Bucket bucket1=new Bucket();
			bucket1.display();
			
			Bucket bucket2=new Bucket(2002);
			bucket2.display();
			
			Bucket bucket3=new Bucket("white","plastic");
			bucket3.display();
			
			Bucket bucket4=new Bucket(200.0,"good");
			bucket4.display();
			
			Bucket bucket5=new Bucket("large");
			bucket5.display();
			
			Bucket bucket6=new Bucket(1,"black","plastic",600.0,"good","large");
			bucket6.display();
	}
}