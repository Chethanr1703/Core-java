class  Holi{
	int holiId;
	String date;
	boolean isGovnHoliday;
	boolean grandlyCelebrated;
	int noOfColorAvailable;
	String colorName;
	
	
	Holi(){
		this(1);
		System.out.println("Constructor with zero parameter is invoked");
		
		
	}
	Holi(int id){
		this("24-05-2025",true);
		this.holiId=id;
		System.out.println("Constructor with one parameter is invoked");
		
		
	}
	Holi(String date,boolean holiday){
		this(1,date,holiday,true,7,"green");
		
		this.date=date;
		this.isGovnHoliday=holiday;
		System.out.println("Constructor with Two[2] parameter is invoked");
		
	}
	Holi(boolean celebration,int color,String name){
		this(1,"25-06-2024",color,name);
		this.grandlyCelebrated=celebration;
		noOfColorAvailable=color;
		colorName=name;
		System.out.println("Constructor with three parameter is invoked");
		
	}
	Holi(int id ,String date ,int noOfColorAvailable,String name){
		this.holiId=id;
		this.date=date;
		this.noOfColorAvailable=noOfColorAvailable;
		this.colorName=colorName;
		
	}
	Holi(int id,String date,boolean holiday,boolean celebration,int noOfColorAvailable,String colorName){

		this.holiId=id;
		this.date=date;
		this.isGovnHoliday=holiday;
		this.grandlyCelebrated=celebration;
		this.noOfColorAvailable=noOfColorAvailable;
		this.colorName=colorName;
		System.out.println("Constructor with all parameter is invoked");
		
		
	}
	public void display(){
		System.out.println("the id of the holi is :"+this.holiId);
		System.out.println("the date of the holi is :"+this.date);
		System.out.println("the isGovnHoliday of the holi is :"+this.isGovnHoliday);
		System.out.println("the grandlyCelebrated of the holi is :"+this.grandlyCelebrated);
		System.out.println("the noOfColorAvailable of the holi is :"+this.noOfColorAvailable);
		System.out.println("the color of the holi is :"+this.colorName);
		
	}
	
}