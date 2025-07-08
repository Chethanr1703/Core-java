class Library{
public static void getBooks(){
System.out.println("the number of book Names are "+LibraryRunner.bookNames.length);
			//System.out.println(bookNames[0]+"  "+bookNames[1]+"  "+bookNames[2]+"  "+bookNames[3]+"  "+bookNames[4]+"  "+bookNames[5]+"  "+bookNames[6]+"  "+bookNames[7]);
			
			for(String Name:LibraryRunner.bookNames){
			System.out.println(Name);
		}
		}}