class BillRunner{
	public static void main(String [] bill){
		System.out.println("Main Started");
	
		Bill firstBill	= new Bill();
		
		firstBill.billId=101;
		firstBill.planType ="monthly";
		firstBill.billAmountWithTax=220.30;
		firstBill.billIssueDate="10-07-2025";
		firstBill.paymentMethod="Online";
		firstBill.billDueDate="25-07-2025";
		firstBill.isTaxInclusive=true;
		firstBill.isBillPaid=true;
		firstBill.isBillOverDue=false;
		
		System.out.println("The First bill id is : "+firstBill.billId);
		System.out.println("the firstBill planType is :"+firstBill.planType);
		System.out.println("the firstBill bill Amount is  "+firstBill.billAmountWithTax);
		System.out.println("the firstBill bill Issue Date is "+firstBill.billIssueDate) ;
		System.out.println("the firstBill paymentMethod is "+firstBill.paymentMethod);
		System.out.println("the firstBill due Date is "+firstBill.billDueDate);
		System.out.println("the firstBill isTaxInclusive "+firstBill.isTaxInclusive);
		System.out.println("the firstBill is bill paid "+firstBill.isBillPaid );
		System.out.println("the firstBill is bill over due  "+firstBill.isBillOverDue);
		
			System.out.println("          ");
		
		
		Bill	secondBill	=new Bill();
		
		secondBill.billId =102;
		secondBill.planType="Quartly";
		secondBill.billAmountWithTax=500.49;
		secondBill.billIssueDate="08-07-2025";
		secondBill.paymentMethod="Cash";
		secondBill.billDueDate="26-07-2025";
		secondBill.isTaxInclusive=true;
		secondBill.isBillPaid=true;
		secondBill.isBillOverDue=false;
		
		System.out.println("The Second bill id is : "+secondBill.billId);
		System.out.println("the Second Bill planType is :"+secondBill.planType);
		System.out.println("the Second Bill bill Amount is  "+secondBill.billAmountWithTax);
		System.out.println("the Second Bill bill Issue Date is "+secondBill.billIssueDate) ;
		System.out.println("the Second Bill paymentMethod is "+secondBill.paymentMethod);
		System.out.println("the Second Bill due Date is "+secondBill.billDueDate);
		System.out.println("the Second Bill isTaxInclusive "+secondBill.isTaxInclusive);
		System.out.println("the Second Bill is bill paid "+secondBill.isBillPaid );
		System.out.println("the Second Bill is bill over due  "+secondBill.isBillOverDue);
		
			System.out.println("          ");
		
		
		
		Bill	thirdBill	=new Bill();
		
		thirdBill.billId =103;
		thirdBill.planType="Quartly";
		thirdBill.billAmountWithTax=600.49;
		thirdBill.billIssueDate="09-07-2025";
		thirdBill.paymentMethod="UPI";
		thirdBill.billDueDate="26-07-2025";
		thirdBill.isTaxInclusive=true;
		thirdBill.isBillPaid=true;
		thirdBill.isBillOverDue=false;
		
		System.out.println("The third bill id is : "+thirdBill.billId);
		System.out.println("the third Bill planType is :"+thirdBill.planType);
		System.out.println("the third Bill bill Amount is  "+thirdBill.billAmountWithTax);
		System.out.println("the third Bill bill Issue Date is "+thirdBill.billIssueDate) ;
		System.out.println("the third Bill paymentMethod is "+thirdBill.paymentMethod);
		System.out.println("the third Bill due Date is "+thirdBill.billDueDate);
		System.out.println("the third Bill isTaxInclusive "+thirdBill.isTaxInclusive);
		System.out.println("the third Bill is bill paid "+thirdBill.isBillPaid );
		System.out.println("the third Bill is bill over due  "+thirdBill.isBillOverDue);
		
			System.out.println("          ");
		
		Bill	fourthBill	= new Bill();
		
		fourthBill.billId =104;
		fourthBill.planType="Monthly";
		fourthBill.billAmountWithTax=200.49;
		fourthBill.billIssueDate="08-07-2025";
		fourthBill.paymentMethod="Online";
		fourthBill.billDueDate="26-07-2025";
		fourthBill.isTaxInclusive=true;
		fourthBill.isBillPaid=true;
		fourthBill.isBillOverDue=false;
		
		
		System.out.println("The fourth bill id is : "+fourthBill.billId);
		System.out.println("the fourth Bill planType is :"+fourthBill.planType);
		System.out.println("the fourth Bill bill Amount is  "+fourthBill.billAmountWithTax);
		System.out.println("the fourth Bill bill Issue Date is "+fourthBill.billIssueDate) ;
		System.out.println("the fourth Bill paymentMethod is "+fourthBill.paymentMethod);
		System.out.println("the fourth Bill due Date is "+fourthBill.billDueDate);
		System.out.println("the fourth Bill isTaxInclusive "+fourthBill.isTaxInclusive);
		System.out.println("the fourth Bill is bill paid "+fourthBill.isBillPaid );
		System.out.println("the fourth Bill is bill over due  "+fourthBill.isBillOverDue);
		
					System.out.println("          ");
					
		Bill	fifthBill=	new Bill();

		
		fifthBill.billId =105;
		fifthBill.planType="Quartly";
		fifthBill.billAmountWithTax=650.49;
		fifthBill.billIssueDate="08-07-2025";
		fifthBill.paymentMethod="Cash";
		fifthBill.billDueDate="26-07-2025";
		fifthBill.isTaxInclusive=true;
		fifthBill.isBillPaid=true;
		fifthBill.isBillOverDue=true;
		
		System.out.println("The fifth bill id is : "+fifthBill.billId);
		System.out.println("the fifth Bill planType is :"+fifthBill.planType);
		System.out.println("the fifth Bill bill Amount is  "+fifthBill.billAmountWithTax);
		System.out.println("the fifth Bill bill Issue Date is "+fifthBill.billIssueDate) ;
		System.out.println("the fifth Bill paymentMethod is "+fifthBill.paymentMethod);
		System.out.println("the fifth Bill due Date is "+fifthBill.billDueDate);
		System.out.println("the fifth Bill isTaxInclusive "+fifthBill.isTaxInclusive);
		System.out.println("the fifth Bill is bill paid "+fifthBill.isBillPaid );
		System.out.println("the fifth Bill is bill over due  "+fifthBill.isBillOverDue);
		
					System.out.println("          ");
					
		Bill	sixthBill	=new Bill();
		
		
		sixthBill.billId =106;
		sixthBill.planType="yearly";
		sixthBill.billAmountWithTax=1500.49;
		sixthBill.billIssueDate="08-07-2025";
		sixthBill.paymentMethod="Cash";
		sixthBill.billDueDate="31-07-2025";
		sixthBill.isTaxInclusive=true;
		sixthBill.isBillPaid=true;
		sixthBill.isBillOverDue=false;
		
		System.out.println("The sixth bill id is : "+sixthBill.billId);
		System.out.println("the sixth Bill planType is :"+sixthBill.planType);
		System.out.println("the sixth Bill bill Amount is  "+sixthBill.billAmountWithTax);
		System.out.println("the sixth Bill bill Issue Date is "+sixthBill.billIssueDate) ;
		System.out.println("the sixth Bill paymentMethod is "+sixthBill.paymentMethod);
		System.out.println("the sixth Bill due Date is "+sixthBill.billDueDate);
		System.out.println("the sixth Bill isTaxInclusive "+sixthBill.isTaxInclusive);
		System.out.println("the sixth Bill is bill paid "+sixthBill.isBillPaid );
		System.out.println("the sixth Bill is bill over due  "+sixthBill.isBillOverDue);
		
					System.out.println("          ");
					
					
		Bill seventhBill = new Bill();
		
		seventhBill.billId =107;
		seventhBill.planType="Quartly";
		seventhBill.billAmountWithTax=450.49;
		seventhBill.billIssueDate="08-07-2025";
		seventhBill.paymentMethod="Cash";
		seventhBill.billDueDate="26-07-2025";
		seventhBill.isTaxInclusive=true;
		seventhBill.isBillPaid=true;
		seventhBill.isBillOverDue=false;
		
		System.out.println("The seventh bill id is : "+seventhBill.billId);
		System.out.println("the seventh Bill planType is :"+seventhBill.planType);
		System.out.println("the seventh Bill bill Amount is  "+seventhBill.billAmountWithTax);
		System.out.println("the seventh Bill bill Issue Date is "+seventhBill.billIssueDate) ;
		System.out.println("the seventh Bill paymentMethod is "+seventhBill.paymentMethod);
		System.out.println("the seventh Bill due Date is "+seventhBill.billDueDate);
		System.out.println("the seventh Bill isTaxInclusive "+seventhBill.isTaxInclusive);
		System.out.println("the seventh Bill is bill paid "+seventhBill.isBillPaid );
		System.out.println("the seventh Bill is bill over due  "+seventhBill.isBillOverDue);
		
					System.out.println("          ");
		
		Bill	eightBill	=new Bill();
		
		eightBill.billId =108;
		eightBill.planType="6 months";
		eightBill.billAmountWithTax=900.49;
		eightBill.billIssueDate="08-07-2025";
		eightBill.paymentMethod="Cash";
		eightBill.billDueDate="26-07-2025";
		eightBill.isTaxInclusive=true;
		eightBill.isBillPaid=true;
		eightBill.isBillOverDue=false;
		
		System.out.println("The eight bill id is : "+eightBill.billId);
		System.out.println("the eight Bill planType is :"+eightBill.planType);
		System.out.println("the eight Bill bill Amount is  "+eightBill.billAmountWithTax);
		System.out.println("the eight Bill bill Issue Date is "+eightBill.billIssueDate) ;
		System.out.println("the eight Bill paymentMethod is "+eightBill.paymentMethod);
		System.out.println("the eight Bill due Date is "+eightBill.billDueDate);
		System.out.println("the eight Bill isTaxInclusive "+eightBill.isTaxInclusive);
		System.out.println("the eight Bill is bill paid "+eightBill.isBillPaid );
		System.out.println("the eight Bill is bill over due  "+eightBill.isBillOverDue);
		
		
					System.out.println("          ");
					
		Bill ninthBill=	new Bill();
		
		ninthBill.billId =109;
		ninthBill.planType="Quartly";
		ninthBill.billAmountWithTax=700.49;
		ninthBill.billIssueDate="08-07-2025";
		ninthBill.paymentMethod="online";
		ninthBill.billDueDate="26-07-2025";
		ninthBill.isTaxInclusive=true;
		ninthBill.isBillPaid=true;
		ninthBill.isBillOverDue=false;
		
		System.out.println("The ninth bill id is : "+ninthBill.billId);
		System.out.println("the ninth Bill planType is :"+ninthBill.planType);
		System.out.println("the ninth Bill bill Amount is  "+ninthBill.billAmountWithTax);
		System.out.println("the ninth Bill bill Issue Date is "+ninthBill.billIssueDate) ;
		System.out.println("the ninth Bill paymentMethod is "+ninthBill.paymentMethod);
		System.out.println("the ninth Bill due Date is "+ninthBill.billDueDate);
		System.out.println("the ninth Bill isTaxInclusive "+ninthBill.isTaxInclusive);
		System.out.println("the ninth Bill is bill paid "+ninthBill.isBillPaid );
		System.out.println("the ninth Bill is bill over due  "+ninthBill.isBillOverDue);
		
						System.out.println("          ");
						
		Bill tenthBill=	new Bill();
		
		tenthBill.billId =110;
		tenthBill.planType="Quartly";
		tenthBill.billAmountWithTax=800.49;
		tenthBill.billIssueDate="08-07-2025";
		tenthBill.paymentMethod="Cash";
		tenthBill.billDueDate="26-07-2025";
		tenthBill.isTaxInclusive=true;
		tenthBill.isBillPaid=true;
		tenthBill.isBillOverDue=true;
		
		System.out.println("The tenth bill id is : "+tenthBill.billId);
		System.out.println("the tenth Bill planType is :"+tenthBill.planType);
		System.out.println("the tenth Bill bill Amount is  "+tenthBill.billAmountWithTax);
		System.out.println("the tenth Bill bill Issue Date is "+tenthBill.billIssueDate) ;
		System.out.println("the tenth Bill paymentMethod is "+tenthBill.paymentMethod);
		System.out.println("the tenth Bill due Date is "+tenthBill.billDueDate);
		System.out.println("the tenth Bill isTaxInclusive "+tenthBill.isTaxInclusive);
		System.out.println("the tenth Bill is bill paid "+tenthBill.isBillPaid );
		System.out.println("the tenth Bill is bill over due  "+tenthBill.isBillOverDue);
		
					System.out.println("          ");


		Bill eleventhBill	=new Bill();
		
		eleventhBill.billId =111;
		eleventhBill.planType="Monthly";
		eleventhBill.billAmountWithTax=300.49;
		eleventhBill.billIssueDate="08-07-2025";
		eleventhBill.paymentMethod="Cash";
		eleventhBill.billDueDate="26-07-2025";
		eleventhBill.isTaxInclusive=true;
		eleventhBill.isBillPaid=true;
		eleventhBill.isBillOverDue=true;
		
		System.out.println("The eleventh bill id is : "+eleventhBill.billId);
		System.out.println("the eleventh Bill planType is :"+eleventhBill.planType);
		System.out.println("the eleventh Bill bill Amount is  "+eleventhBill.billAmountWithTax);
		System.out.println("the eleventh Bill bill Issue Date is "+eleventhBill.billIssueDate) ;
		System.out.println("the eleventh Bill paymentMethod is "+eleventhBill.paymentMethod);
		System.out.println("the eleventh Bill due Date is "+eleventhBill.billDueDate);
		System.out.println("the eleventh Bill isTaxInclusive "+eleventhBill.isTaxInclusive);
		System.out.println("the eleventh Bill is bill paid "+eleventhBill.isBillPaid );
		System.out.println("the eleventh Bill is bill over due  "+eleventhBill.isBillOverDue);
		
					System.out.println("          ");

		Bill	twelveth=new Bill();
		
		twelveth.billId =112;
		twelveth.planType="Quartly";
		twelveth.billAmountWithTax=500.49;
		twelveth.billIssueDate="08-07-2025";
		twelveth.paymentMethod="Cash";
		twelveth.billDueDate="26-07-2025";
		twelveth.isTaxInclusive=true;
		twelveth.isBillPaid=true;
		twelveth.isBillOverDue=false;
		
		
		System.out.println("The twelveth bill id is : "+twelveth.billId);
		System.out.println("the twelveth Bill planType is :"+twelveth.planType);
		System.out.println("the twelveth Bill bill Amount is  "+twelveth.billAmountWithTax);
		System.out.println("the twelveth Bill bill Issue Date is "+twelveth.billIssueDate) ;
		System.out.println("the twelveth Bill paymentMethod is "+twelveth.paymentMethod);
		System.out.println("the twelveth Bill due Date is "+twelveth.billDueDate);
		System.out.println("the twelveth Bill isTaxInclusive "+twelveth.isTaxInclusive);
		System.out.println("the twelveth Bill is bill paid "+twelveth.isBillPaid );
		System.out.println("the twelveth Bill is bill over due  "+twelveth.isBillOverDue);
		
		System.out.println("                      ");
		
		Bill	thirteenBill=new Bill();
		
		thirteenBill.billId =113;
		thirteenBill.planType="Quartly";
		thirteenBill.billAmountWithTax=600.49;
		thirteenBill.billIssueDate="08-07-2025";
		thirteenBill.paymentMethod="Cash";
		thirteenBill.billDueDate="26-07-2025";
		thirteenBill.isTaxInclusive=true;
		thirteenBill.isBillPaid=true;
		thirteenBill.isBillOverDue=true;
		
					
		System.out.println("The thirteen bill id is : "+thirteenBill.billId);
		System.out.println("the thirteen Bill planType is :"+thirteenBill.planType);
		System.out.println("the thirteen Bill bill Amount is  "+thirteenBill.billAmountWithTax);
		System.out.println("the thirteen Bill bill Issue Date is "+thirteenBill.billIssueDate) ;
		System.out.println("the thirteen Bill paymentMethod is "+thirteenBill.paymentMethod);
		System.out.println("the thirteen Bill due Date is "+thirteenBill.billDueDate);
		System.out.println("the thirteen Bill isTaxInclusive "+thirteenBill.isTaxInclusive);
		System.out.println("the thirteen Bill is bill paid "+thirteenBill.isBillPaid );
		System.out.println("the thirteen Bill is bill over due  "+thirteenBill.isBillOverDue);
		
		System.out.println("                      ");
		
		
		Bill	fourteenBill	=new Bill();
				
		fourteenBill.billId =114;
		fourteenBill.planType="Quartly";
		fourteenBill.billAmountWithTax=500.49;
		fourteenBill.billIssueDate="08-07-2025";
		fourteenBill.paymentMethod="Cash";
		fourteenBill.billDueDate="26-07-2025";
		fourteenBill.isTaxInclusive=true;
		fourteenBill.isBillPaid=true;
		fourteenBill.isBillOverDue=false;
		
		System.out.println("The fourteenth bill id is : "+fourteenBill.billId);
		System.out.println("the fourteenth Bill planType is :"+fourteenBill.planType);
		System.out.println("the fourteenth Bill bill Amount is  "+fourteenBill.billAmountWithTax);
		System.out.println("the fourteenth Bill bill Issue Date is "+fourteenBill.billIssueDate) ;
		System.out.println("the fourteenth Bill paymentMethod is "+fourteenBill.paymentMethod);
		System.out.println("the fourteenth Bill due Date is "+fourteenBill.billDueDate);
		System.out.println("the fourteenth Bill isTaxInclusive "+fourteenBill.isTaxInclusive);
		System.out.println("the fourteenth Bill is bill paid "+fourteenBill.isBillPaid );
		System.out.println("the fourteenth Bill is bill over due  "+fourteenBill.isBillOverDue);
				
				System.out.println("                      ");
				
		Bill fifteenthBill=	new Bill();
		
		fifteenthBill.billId =115;
		fifteenthBill.planType="Monthly";
		fifteenthBill.billAmountWithTax=300.49;
		fifteenthBill.billIssueDate="08-07-2025";
		fifteenthBill.paymentMethod="Cash";
		fifteenthBill.billDueDate="26-07-2025";
		fifteenthBill.isTaxInclusive=true;
		fifteenthBill.isBillPaid=true;
		fifteenthBill.isBillOverDue=true;
		
		System.out.println("The fifteenth bill id is : "+fifteenthBill.billId);
		System.out.println("the fifteenth Bill planType is :"+fifteenthBill.planType);
		System.out.println("the fifteenth Bill bill Amount is  "+fifteenthBill.billAmountWithTax);
		System.out.println("the fifteenth Bill bill Issue Date is "+fifteenthBill.billIssueDate) ;
		System.out.println("the fifteenth Bill paymentMethod is "+fifteenthBill.paymentMethod);
		System.out.println("the fifteenth Bill due Date is "+fifteenthBill.billDueDate);
		System.out.println("the fifteenth Bill isTaxInclusive "+fifteenthBill.isTaxInclusive);
		System.out.println("the fifteenth Bill is bill paid "+fifteenthBill.isBillPaid );
		System.out.println("the fifteenth Bill is bill over due  "+fifteenthBill.isBillOverDue);
		

				System.out.println("                      ");
				
		Bill	sixteenthBill	= new Bill();
		
		sixteenthBill.billId =116;
		sixteenthBill.planType="Quartly";
		sixteenthBill.billAmountWithTax=550.49;
		sixteenthBill.billIssueDate="08-07-2025";
		sixteenthBill.paymentMethod="Cash";
		sixteenthBill.billDueDate="26-07-2025";
		sixteenthBill.isTaxInclusive=true;
		sixteenthBill.isBillPaid=true;
		sixteenthBill.isBillOverDue=true;
		
		System.out.println("The sixteenth bill id is : "+sixteenthBill.billId);
		System.out.println("the sixteenth Bill planType is :"+sixteenthBill.planType);
		System.out.println("the sixteenth Bill bill Amount is  "+sixteenthBill.billAmountWithTax);
		System.out.println("the sixteenth Bill bill Issue Date is "+sixteenthBill.billIssueDate) ;
		System.out.println("the sixteenth Bill paymentMethod is "+sixteenthBill.paymentMethod);
		System.out.println("the sixteenth Bill due Date is "+sixteenthBill.billDueDate);
		System.out.println("the sixteenth Bill isTaxInclusive "+sixteenthBill.isTaxInclusive);
		System.out.println("the sixteenth Bill is bill paid "+sixteenthBill.isBillPaid );
		System.out.println("the sixteenth Bill is bill over due  "+sixteenthBill.isBillOverDue);
		

				System.out.println("                      ");
		
		
		Bill	seventeenth	=new Bill();
		
		seventeenth.billId =117;
		seventeenth.planType="Quartly";
		seventeenth.billAmountWithTax=500.49;
		seventeenth.billIssueDate="08-07-2025";
		seventeenth.paymentMethod="Cash";
		seventeenth.billDueDate="26-07-2025";
		seventeenth.isTaxInclusive=true;
		seventeenth.isBillPaid=true;
		seventeenth.isBillOverDue=false;
		
		System.out.println("The seventeenth bill id is : "+seventeenth.billId);
		System.out.println("the seventeenth Bill planType is :"+seventeenth.planType);
		System.out.println("the seventeenth Bill bill Amount is  "+seventeenth.billAmountWithTax);
		System.out.println("the seventeenth Bill bill Issue Date is "+seventeenth.billIssueDate) ;
		System.out.println("the seventeenth Bill paymentMethod is "+seventeenth.paymentMethod);
		System.out.println("the seventeenth Bill due Date is "+seventeenth.billDueDate);
		System.out.println("the seventeenth Bill isTaxInclusive "+seventeenth.isTaxInclusive);
		System.out.println("the seventeenth Bill is bill paid "+seventeenth.isBillPaid );
		System.out.println("the seventeenth Bill is bill over due  "+seventeenth.isBillOverDue);
		
		
				System.out.println("                      ");
				
		Bill	eighteenthBill	=new Bill();
		
		eighteenthBill.billId =118;
		eighteenthBill.planType="yearly";
		eighteenthBill.billAmountWithTax=1600.49;
		eighteenthBill.billIssueDate="08-07-2025";
		eighteenthBill.paymentMethod="Upi";
		eighteenthBill.billDueDate="26-07-2025";
		eighteenthBill.isTaxInclusive=true;
		eighteenthBill.isBillPaid=true;
		eighteenthBill.isBillOverDue=true;
		
		System.out.println("The eighteenth bill id is : "+eighteenthBill.billId);
		System.out.println("the eighteenth Bill planType is :"+eighteenthBill.planType);
		System.out.println("the eighteenth Bill bill Amount is  "+eighteenthBill.billAmountWithTax);
		System.out.println("the eighteenth Bill bill Issue Date is "+eighteenthBill.billIssueDate) ;
		System.out.println("the eighteenth Bill paymentMethod is "+eighteenthBill.paymentMethod);
		System.out.println("the eighteenth Bill due Date is "+eighteenthBill.billDueDate);
		System.out.println("the eighteenth Bill isTaxInclusive "+eighteenthBill.isTaxInclusive);
		System.out.println("the eighteenth Bill is bill paid "+eighteenthBill.isBillPaid );
		System.out.println("the eighteenth Bill is bill over due  "+eighteenthBill.isBillOverDue);
		
		
				System.out.println("                      ");

		Bill	ninteenthBill=	new Bill();
		
		ninteenthBill.billId =119;
		ninteenthBill.planType="Quartly";
		ninteenthBill.billAmountWithTax=500.49;
		ninteenthBill.billIssueDate="08-07-2025";
		ninteenthBill.paymentMethod="Cash";
		ninteenthBill.billDueDate="26-07-2025";
		ninteenthBill.isTaxInclusive=true;
		ninteenthBill.isBillPaid=true;
		ninteenthBill.isBillOverDue=false;
		
		
		System.out.println("The ninteenth bill id is : "+ninteenthBill.billId);
		System.out.println("the ninteenth Bill planType is :"+ninteenthBill.planType);
		System.out.println("the ninteenth Bill bill Amount is  "+ninteenthBill.billAmountWithTax);
		System.out.println("the ninteenth Bill bill Issue Date is "+ninteenthBill.billIssueDate) ;
		System.out.println("the ninteenth Bill paymentMethod is "+ninteenthBill.paymentMethod);
		System.out.println("the ninteenth Bill due Date is "+ninteenthBill.billDueDate);
		System.out.println("the ninteenth Bill isTaxInclusive "+ninteenthBill.isTaxInclusive);
		System.out.println("the ninteenth Bill is bill paid "+ninteenthBill.isBillPaid );
		System.out.println("the ninteenth Bill is bill over due  "+ninteenthBill.isBillOverDue);
		
				System.out.println("                      ");

		Bill	twentythBill	=new Bill();
		
		twentythBill.billId=120;
		twentythBill.planType="yearly";
		twentythBill.billAmountWithTax=1700.50;
		twentythBill.billIssueDate="01-07-2025";
		twentythBill.paymentMethod ="UPi";
		twentythBill.billDueDate="31-07-2025";
		twentythBill.isTaxInclusive =true;
		twentythBill.isBillPaid=false;
		twentythBill.isTaxInclusive=true;
		
		System.out.println("The twentyth bill id is : "+twentythBill.billId);
		System.out.println("the twentyth Bill planType is :"+twentythBill.planType);
		System.out.println("the twentyth Bill bill Amount is  "+twentythBill.billAmountWithTax);
		System.out.println("the twentyth Bill bill Issue Date is "+twentythBill.billIssueDate) ;
		System.out.println("the twentyth Bill paymentMethod is "+twentythBill.paymentMethod);
		System.out.println("the twentyth Bill due Date is "+twentythBill.billDueDate);
		System.out.println("the twentyth Bill isTaxInclusive "+twentythBill.isTaxInclusive);
		System.out.println("the twentyth Bill is bill paid "+twentythBill.isBillPaid );
		System.out.println("the twentyth Bill is bill over due  "+twentythBill.isBillOverDue);
		
		
	}
}