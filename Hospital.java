class Hospital{

public static void main(String[]doctor){
			String	doctorNames[]={"1. Cardiologist","2. Dermatologist","3. Endocrinologist","4. Gastroenterologist","5. Neurologist","6. Allergist","7. Anesthesiologist","8. Orthopedic","9. Ophthalmologist","10. Hematologist"};

			System.out.println("the number of names are "+doctorNames.length);
			System.out.println(doctorNames[0]+"  "+doctorNames[1]+"  "+doctorNames[2]+"  "+doctorNames[3]+"  "+doctorNames[4]+"  "+doctorNames[5]+"  "+doctorNames[6]+"  "+doctorNames[7]+"  "+doctorNames[8]+"  "+doctorNames[9]);
			for(String name:doctorNames){
				System.out.println(name);
			}

}}