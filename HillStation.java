class HillStation{

		public static void main (String[]hill){
			String	resorts[]={"1. The Windflower Prakruthi Resort & Spa ","2. Guhantara Resort","3. Wonderla Resort Bangalore","4. Palm Meadows Resort","5. MangoMist Resort","6. Our Native Village","7. Ezine Lagoon Resort"};

			System.out.println("the number of resorts are "+resorts.length);
			//System.out.println(resorts[0]+"  "+resorts[1]+"  "+resorts[2]+"  "+resorts[3]+"  "+resorts[4]+"  "+resorts[5]+"  "+resorts[6]);
			for(String resort:resorts){
				System.out.println(resort);
			}
}}