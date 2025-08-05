class TechParkRunner{
	public static void main(String []tp){
		
		Company company2= new Company(5,"IBM",10);
		
		
		Block block1=new Block(2,"fire",5,company2);
		
		
		TechPark techpark1 =new TechPark(1,"manyatha","heballa",block1);
		
		techpark1.getTechParkInfo();
	}
}