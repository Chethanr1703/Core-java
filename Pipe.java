class Pipe{
	
		int pipeId;
	int pipeLength;
	int pipeDaimeter;
	String pipeType;
	String pipeBrand[];
	
		Pipe(){
		System.out.println("the  Constructor invoked" );
	}
	Pipe(int pipeId){
		System.out.println("the Parameter Constructor invoked" );
		this.pipeId=pipeId;
		
	}
	
	Pipe(int pipeLength,int pipeDaimeter){
		this.pipeLength=pipeLength;
		this.pipeDaimeter=pipeDaimeter;
		
	}
	
	
	Pipe(String pipeType,String pipeBrand[]){
		this.pipeType=pipeType;
		this.pipeBrand=pipeBrand;
		
	}

	
	public void getpipeInfo(){
		
		
	System.out.println("the id of the pipe20 is " + pipeId);
	System.out.println("the pipeLength of the pipe20 is " + pipeLength);
	System.out.println("the pipeDaimeter of the pipe20 is " + pipeDaimeter);
	System.out.println("the pipeType of the pipe20 is " + pipeType);
	System.out.println("the brand of the pipe20 is " + pipeBrand);
	}
}