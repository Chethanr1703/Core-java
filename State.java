class State{
	int stateId;
	String stateName;
	int noOfstate;
	City city;
	
	State(int stateId,String stateName, int noOfstate,City city){
		this.stateId=stateId;
		this.stateName=stateName;
		this.noOfstate=noOfstate;
		this.city=city;
		
	}
	public void getStateinfo(){
		System.out.println("fetching state info-------");
		System.out.println("the id of the state :"+stateId);
		System.out.println("the name of the state is : "+stateName);
		System.out.println("the noOfstate in country is :"+noOfstate);
this.city.city();
	}
}