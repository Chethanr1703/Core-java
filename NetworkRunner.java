class NetworkRunner{
	public static void main(String[]cr){
	String networkType[]={"LAN","WAN","MAN"};
	
	 Network network1 = new Network(1, 10);
	 System.out.println("the id  is "+network1.networkId);
	 System.out.println("the noOfClient is "+network1.noOfClient);
	 
	 
	 
	 Network network2 = new Network( 15, true );
	 
	 System.out.println("the noOfServer is "+network2.noOfServer);
	 System.out.println("the isConnectionAvailable is "+network2.isConnectionAvailable);
	 
	 
	 
	 Network network3 = new Network(networkType);
	 
	 System.out.println("the networkType is ");
		for(String network :networkType){
			System.out.println(network);
		}

	 
}}