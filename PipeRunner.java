class PipeRunner{
	public static void main(String[]cr){
	String pipeBrand[]={"tmt","apl","jindal"};
	
	Pipe pipe1 = new Pipe(101);
	System.out.println("the pipeId is "+pipe1.pipeId);
	
	
	Pipe pipe2 = new Pipe(700, 2);
	System.out.println("the pipeLength is "+pipe2.pipeLength);
	System.out.println("the pipeDaimeter is "+pipe2.pipeDaimeter);
	
	
	
	Pipe pipe3 = new Pipe( "Iron", pipeBrand);
	
	System.out.println("the pipeType is "+pipe3.pipeType);
	
	
	System.out.println("the pipeBrand is ");
		for(String brand :pipeBrand){
			System.out.println(brand);
		}
		
}}
