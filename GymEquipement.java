class GymEquipement{
	GymEquipement(){
		System.out.println("the  Constructor invoked" );
	}
	GymEquipement(int gymEquipementId,String gymEquipementType,int gymEquipementWeight,String gymEquipementMaterial,boolean isGripAvaiable
	){
					System.out.println("the Parameter Constructor invoked" );
	this.gymEquipementId=gymEquipementId;
	this.gymEquipementType=gymEquipementType;
	this.gymEquipementWeight=gymEquipementWeight;
	this.gymEquipementMaterial=gymEquipementMaterial
	this.isGripAvaiable=isGripAvaiable;

	}
	
	int gymEquipementId;
	String gymEquipementType;
	int gymEquipementWeight;
	String gymEquipementMaterial;
	boolean isGripAvaiable;
	
	public void getGymInfo(){
		
		
		System.out.println("the gymEquipementId of gymEquipement1 is :"+gymEquipementId);
		System.out.println("the gymEquipementType of gymEquipement1 is :"+gymEquipementType);
		System.out.println("the gymEquipementWeight of gymEquipement1 is :"+gymEquipementWeight);
		System.out.println("the gymEquipementMaterial of gymEquipement1 is :"+gymEquipementMaterial);
		System.out.println("the isGripAvaiable of gymEquipement1 is :"+isGripAvaiable);
	}
	
	
}