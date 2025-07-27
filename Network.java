class Network{
	
	
	
			Network(){
		System.out.println("the  Constructor invoked" );
	}
	Network(int networkId,int  noOfClient,int noOfServer,boolean isConnectionAvailable, String networkType){
		System.out.println("the Parameter Constructor invoked" );
		this.networkId=networkId;
		this.noOfClient=noOfClient;
		this.noOfServer=noOfServer;
		this.isConnectionAvailable=isConnectionAvailable;
		this.networkType=networkType;
		
	}
	
	
	int networkId;
	int noOfClient;
	int noOfServer;
	boolean isConnectionAvailable;
	String networkType;
	
	public void getnetworkinfo(){
		System.out.println("the id of the network20 is " +networkId);
	System.out.println("the noOfClient of the network20 is " + noOfClient);
	System.out.println("the noOfServer of the network20 is " + noOfServer);
	System.out.println("isConnectionAvailable in network20 is " + isConnectionAvailable);
	System.out.println("the type of the network20 is " + networkType);
	}
}