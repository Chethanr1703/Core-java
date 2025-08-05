class Block{
	int id;
	String blockName;
	int noOfBlock;
	Company company;
	
	
	Block(int id,String blockName,int noOfBlock,Company company){
		this.id=id;
		this.blockName=blockName;
		this.noOfBlock=noOfBlock;
		this.company=company;
	}
	
	public void getBlockInfo(){
				System.out.println("fetching Block info ----");
		System.out.println("the id of the Block is :"+id);
		System.out.println("the name of the Block : "+blockName);
		System.out.println("the noOfBlock in the Block :"+noOfBlock);
		company.getCompanyInfo();
}}