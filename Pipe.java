class Pipe{
	
	
	
		Pipe(){
		System.out.println("the  Constructor invoked" );
	}
	Pipe(int pipeId,int pipeLength,int pipeDaimeter,String pipeType,String pipeBrand){
		System.out.println("the Parameter Constructor invoked" );
		this.pipeId=pipeId;
		this.pipeLength=pipeLength;
		this.pipeDaimeter=pipeDaimeter;
		this.pipeType=pipeType;
		this.pipeBrand=pipeBrand;
		
	}
	
	int pipeId;
	int pipeLength;
	int pipeDaimeter;
	String pipeType;
	String pipeBrand;
	
	public void getpipeInfo(){
		
		
	System.out.println("the id of the pipe20 is " + pipeId);
	System.out.println("the pipeLength of the pipe20 is " + pipeLength);
	System.out.println("the pipeDaimeter of the pipe20 is " + pipeDaimeter);
	System.out.println("the pipeType of the pipe20 is " + pipeType);
	System.out.println("the brand of the pipe20 is " + pipeBrand);
	}
}