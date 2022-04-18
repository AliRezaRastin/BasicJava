package bank;


import java.util.Scanner;
class BankBill
{
public static void main(String[]ar)
{
	//lest of variable
	String wbill="Wbill";
	String ebill="Ebill";
	String acc="Acc";
	String choose;
	byte  choose1;
	double amount;
	byte choose2;
	byte choose3;
	double tax=0;
	Scanner sc=new Scanner(System.in);
	//lest of outputs
	System.out.print("\n\tif you want to login to electricity  part  :  Enter (Ebill) "+
	"\n\tif you want to login to water part : Enter (Wblill)"+
	"\n\tif you want to login to accounting part : Enter  (Acc)"+
	"\n\t________________________________________________ "+
	"\n\tBe carful you must enter between of (Wblill)/(Ebill)/(Acc)  ");
	choose=sc.nextLine();
	
	//conditions 
	if (choose.equals(ebill))
	{

		System.out.print("\n\t\tfor home bill electricity :you must choose (1)  "
		+"\n\t\tfor Office bill : you must choose(2) "
		+"\n\t\tfor Industry bill: you must choose(3)"
		+"\n\t_________________________________________"
		+"\n\tchoose one of them(1,2,3) for paying :"
		); 
		choose1=sc.nextByte();
		
	if(choose1 ==1)
	{ 
		System.out.print("\n\t\tEnter the amount of money : ");
		amount =sc.nextDouble();
		if(amount>1500 && amount<2000)
	{
	System.out.println("\t\tyour tax is"+tax);
	System.out.print("\t\tyour must pay  : " +(amount+tax));
	
	}
		 else if(amount>=2000&&amount<3000 )
	{
		tax =(amount*2)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	
	}
	else if ( amount>=3000&&amount<5000)
	{
		tax =(amount*3)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else if (amount>=5000&&amount<10000)
	{
		tax =(amount*5)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else if (amount>=10000 )
	{
		tax =(amount*10)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else 
	{System.out.println("\n\t\tinvailid amount");}
	}
	
	else if ( choose1==2)
	{
		System.out.print("\n\t\tEnter the amount of money : ");
	amount=sc.nextDouble(); 
	
				if(amount>1500 && amount<3000)
	{
	System.out.println("\t\tyour tax is"+tax);
	System.out.print("\t\tyour must pay  : " +(amount+tax));
	
	}
	
	else if ( amount>=3000&&amount<5000)
	{
		tax =(amount*3)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else if ( amount>=5000&&amount<10000)
	{
		tax =(amount*5)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else if ( amount>=10000)
	{
		tax =(amount*8)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}else {System.out.println("\t\tinvailid amount");}
	}
	else if (choose1==3)
	{ 	System.out.print("\n\t\tEnter the amount of money : ");
		amount=sc.nextDouble(); 
	
	 	if(amount>=10000 && amount<20000)
	{
	System.out.println("\t\tyour tax is"+tax);
	System.out.print("\t\tyour must pay  : " +(amount+tax));
	
	}
	else if ( amount>=20000&&amount<30000)
	{
		tax =(amount*6)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else if ( amount>=30000&&amount<50000)
	{
		tax =(amount*10)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else if ( amount>=50000)
	{
		tax =(amount*15)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}else {System.out.println("\t\tinvailid amount");}
	
	}}
	
	else if (choose.equals(wbill))
		
		{
System.out.print("\n\t\tfor home bill water :you must choose (1)  "
		+"\n\t\tfor Office bill : you must choose(2) "
		+"\n\t\tfor Industry bill: you must choose(3)"
		+"\n\t_________________________________________"
		+"\n\tchoose one of them(1,2,3) for paying :"
		); 
		choose2=sc.nextByte();

	if ( choose2==1 )
	{
		
		System.out.print("\n\t\tEnter the amount of money : ");
		amount =sc.nextDouble();
			if(amount>1500 && amount<2000)
	{
	System.out.println("\t\tyour tax is"+tax);
	System.out.print("\t\tyour must pay  : " +(amount+tax));
	
	}
	else if(amount>=2000&&amount<3000 )
	{
		tax =(amount*2)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	
	}
	else if ( amount>=3000&&amount<5000)
	{
		tax =(amount*3)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else if (amount>=5000&&amount<10000)
	{
		tax =(amount*5)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else if (amount>=10000 )
	{
		tax =(amount*10)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else 
	{System.out.println("\n\t\tinvailid amount");}
	}
			
	       else if ( choose2==2)
	{
		System.out.print("\n\t\tEnter the amount of money : ");
		amount=sc.nextDouble(); 
				if(amount>1500 && amount<3000)
	{
	System.out.println("\t\tyour tax is"+tax);
	System.out.print("\t\tyour must pay  : " +(amount+tax));
	
	}
	else if ( amount>=3000&&amount<5000)
	{
		tax =(amount*3)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else if ( amount>=5000&&amount<10000)
	{
		tax =(amount*5)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else if ( amount>=10000)
	{
		tax =(amount*8)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}else {System.out.println("\t\tinvailid amount");}
		
	}
			else if (choose2==3)
	{ 	System.out.print("\n\t\tEnter the amount of money : ");
		amount=sc.nextDouble(); 
			if(amount>=10000 && amount<20000)
	{
	System.out.println("\t\tyour tax is"+tax);
	System.out.print("\t\tyour must pay  : " +(amount+tax));
	
	}
	else if ( amount>=20000&&amount<30000)
	{
		tax =(amount*6)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else if ( amount>=30000&&amount<50000)
	{
		tax =(amount*10)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}
	else if ( amount>=50000)
	{
		tax =(amount*15)/100;
	System.out.println("\t\tyour must pay "+ (amount+tax ));
	System.out.println("\t\tyour tax is :" +tax );
	}else {System.out.println("\t\tinvailid amount");}

	}
	}	
		else if (choose.equals(acc))
		{
			
	System.out.print("\n\tfor saving account Enter 1: "+
"\n\tfor current account enter 2 :"
+"\n\t________________________________________"	);
	choose1=sc.nextByte();
	
	if (choose1==1  )
	{System.out.print("\n\t\tenter the amount of your money: ");
	amount=sc.nextDouble();
		if( amount>10000&&amount<20000)
		{
			
		tax =(amount*1)/100;

		System.out.println("\t\tthe profit of your money is: "+tax );
	System.out.println("\t\tyour money is :" +(amount+tax ));
			
		}
			else if( amount>=20000&&amount<50000)
		{
			
		tax =(amount*2)/100;

		System.out.println("\t\tthe profit of your money is: "+tax );
	System.out.println("\t\tyour money is :" +(amount+tax ));
	
	} 
			else if( amount>=50000&&amount<200000)
		{
			
		tax =(amount*5)/100;

		System.out.println("\t\tthe profit of your money is: "+tax );
	System.out.println("\t\tyour money is :" +(amount+tax ));
	
	}
		else if( amount>=200000&&amount<1000000)
		{
			
		tax =(amount*10)/100;

		System.out.println("\t\tthe profit of your money is: "+tax );
	System.out.println("\t\tyour money is :" +(amount+tax ));
	
	} else 
	{
		System.out.println("invaild amount");
	}	
		}
		else if(choose1==2  )
			{
	System.out.print("\n\n\t\tenter the amount of your money: ");
	amount=sc.nextDouble();
				if( amount>1000&&amount<10000)
		{
		tax =(amount*1)/100;
		System.out.println("\n\t\tthe tax of your money is: "+tax );
	System.out.println("\n\t\tyour money is :" +(amount-tax ));	
		}
				 else if( amount>=10000&&amount<50000)
		{	
		tax =(amount*5)/100;
		System.out.println("\n\t\tthe tax of your money is: "+tax );
	System.out.println("\n\t\tyour money is :" +(amount-tax ));
		}
				 else if( amount>=50000&&amount<100000)
		{	
		tax =(amount*10)/100;
		System.out.println("\n\t\tthe tax of your money is: "+tax );
	System.out.println("\n\t\tyour money is :" +(amount-tax ));
		}
				 else if( amount>=100000)
		{
		tax =(amount*12)/100;
		System.out.println("\n\t\tthe tax of your money is: "+tax );
	System.out.println("\n\t\tyour money is :" +(amount-tax ));	
		}	
			else {System.out.println("invailid amount");}	
			}
	else {System.out.println("invailid code ");}
}}}	
	