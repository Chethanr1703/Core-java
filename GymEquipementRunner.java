class GymEquipementRunner{
	
	public static void main(String []gym){
		String name[] ={"dumble","bench","plates"};
			GymEquipement	gymEquipement1=new GymEquipement(101, "Dumbbell", 5);
			System.out.println("the id is "+gymEquipement1.gymEquipementId);
			System.out.println("the type is "+gymEquipement1.gymEquipementType);
			System.out.println("the weight is "+gymEquipement1.gymEquipementWeight);
			
			
			
			GymEquipement	gymEquipement2=new GymEquipement("Metal");
			System.out.println("the material is "+gymEquipement2.gymEquipementMaterial);
			
			
			
			GymEquipement	gymEquipement3=new GymEquipement(true,name);
			System.out.println("the grip is "+gymEquipement3.isGripAvaiable);
			System.out.println("the names is ");
			for(String na:name){
							System.out.println(na);

			}
			
			
}}