import java.util.*; 

class Activity
{
	String name;
	int calburnt;
	int time;
	Activity(String s,int burnt,int t)
	{
		name=s;
		calburnt=burnt;
		time=t;
	}
}


public class Calorie 
{
	public static final String RESET = "\u001B[0m";
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";
	
	public static final String BLACKBACK = "\u001B[40m";
	public static final String REDBACK = "\u001B[41m";
	public static final String GREENBACK = "\u001B[42m";
	public static final String YELLOWBACK = "\u001B[43m";
	public static final String BLUEBACK = "\u001B[44m";
	public static final String PURPLEBACK = "\u001B[45m";
	public static final String CYANBACK = "\u001B[46m";
	public static final String WHITEBACK = "\u001B[47m";

	
	static Scanner input= new Scanner(System.in);
	
	public static void timer()
	{
		Thread tr=new Thread();
		try
		{
			for(int t=5;t>0;t--)
			{
				tr.sleep(1000);
				System.out.println("\t\t\t\t\t\t\t\t\t\t"+t);
			
			}
		}
		catch(Exception e)
		{
				e.printStackTrace();
		}
	}
	
	
	static public void clrscr1()
	{
		int i; 
		for(i=0;i<40;i++)
		{
			System.out.println("");
		}
	}
	
	
	public static void clrscr2()
	{
		int i;
		for(i=0;i<10;i++)
	{
		System.out.println("");
	}
	}
	
	
	public static void consumed()
	{
		Scanner in=new Scanner(System.in);
		clrscr1();
		int totcal=0;
		System.out.println("Enter your calorie goal :");
		int calgoal=input.nextInt();
		System.out.println("\n\n\nEnter the number of food items consumed :");
		int num=input.nextInt();
		String name[]=new String[num];
		int cal[]=new int[num];
		for(int i=0;i<num;i++)
		{
			int j=i+1;
			System.out.println("\n\n\nEnter the name of food item number "+j+":");
			name[i]=input.next();
		}
		for(int i=0;i<num;i++)
		{
			System.out.println("\n\n\nEnter the number of calories of "+name[i]+":");
			cal[i]=input.nextInt();
			totcal=totcal+cal[i];
		}
		clrscr1();
		System.out.println("\t\t\t\t\t\t\t\t"+GREEN+"SUMMARY\n\n\n\n"+RESET);
		System.out.println("\t\t\t\t"+YELLOW+"NAME\t\t\t\t\t\t\t\t\t\t"+YELLOW+"CALORIES\n"+RESET);
		for(int i=0;i<num;i++)
		{
			System.out.println("\n");
			System.out.println("\t\t\t\t"+name[i]+"\t\t\t\t\t\t\t\t\t\t"+cal[i]+"\n");
		}
		System.out.println("\n\n\n\t\t\t\t\t\t\t"+CYANBACK+BLACK+"TOTAL CALORIES CONSUMED = "+totcal+RESET);
		if(totcal>=calgoal)
		{
			System.out.println("\n\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"CONGRATULATIONS!!"+RESET);
			System.out.println("\n\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"CALORIE GOAL ACHIEVED\n\n\n"+RESET);
			System.out.println("\n\n");
		}
		else
		{
			System.out.println("\n\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"INSUFFICIENT AMOUNT OF CALORIES CONSUMED"+RESET);
			System.out.println("\n\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"CONSUME MORE FOOD ITEMS TO REACH CALORIE GOAL\n\n\n"+RESET);
			System.out.println("\n\n");
		}
		in.nextLine();
	}
	
	
	
	public static void burnt()
	{
		Scanner in=new Scanner(System.in);
		int c1,c2,time=0;
		boolean a=true;
		int burnt=0,totburnt=0;
		String n="";
		clrscr1();
		System.out.println("How many physical activities did u perform : ");
		int count=input.nextInt();
		Activity obj[]=new Activity[count];
		for(int i=0;i<count;i++)
		{
		clrscr1();
		System.out.println(CYAN+"Chose the type of physical activity you have performed : "+RESET);
		System.out.println("\n1.General activities \n\n2.Sports \n\n3.Gym excercises");
		System.out.println("\nENTER YOUR CHOICE : ");
		c1=input.nextInt();
		if(c1==1)
		{
			clrscr1();
			System.out.println(CYAN+"Chose the physical activity you have performed : "+RESET);
			System.out.println("\n1.Walking \n\n2.Jogging \n\n3.Yoga \n\n4.Swimming \n\n5.Aerobic Dancing \n\n6.Cycling \n\n7.Sprinting");
			System.out.println("\nENTER YOUR CHOICE : ");
			c2=input.nextInt();
			switch(c2)
			{
			case 1:
				System.out.println("\nEnter the duration of walking in hours :");
				time=input.nextInt();
				burnt=210*time;
				totburnt=totburnt+burnt;
				n="Walking";
				break;
			case 2:
				System.out.println("\nEnter the duration of jogging in hours :");
				time=input.nextInt();
				burnt=400*time;				
				totburnt=totburnt+burnt;
				n="Jogging";
				break;
			case 3:
				System.out.println("\nEnter the duration of Yoga in hours :");
				time=input.nextInt();
				burnt=226*time;				
				totburnt=totburnt+burnt;
				n="Yoga";
				break;
			case 4:
				System.out.println("\nEnter the duration of swimming in hours :");
				time=input.nextInt();
				burnt=600*time;				
				totburnt=totburnt+burnt;
				n="Swimming";
				break;
			case 5:
				System.out.println("\nEnter the duration of aerobic dancing in hours :");
				time=input.nextInt();
				burnt=406*time;				
				totburnt=totburnt+burnt;
				n="Aerobic Dancing";
				break;
			case 6:
				System.out.println("\nEnter the duration of cycling in hours :");
				time=input.nextInt();
				burnt=563*time;				
				totburnt=totburnt+burnt;
				n="Cycling";
				break;
			case 7:
				System.out.println("\nEnter the duration of sprinting in hours :");
				time=input.nextInt();
				burnt=563*time;
				totburnt=totburnt+burnt;
				n="Sprinting";
				break;
			default:
				System.out.println("\nEnter a valid choice");
				break;
				
			}
			obj[i]=new Activity(n,burnt,time);
		}
		else if(c1==2)
		{
			clrscr1();
			System.out.println(CYAN+"Chose the physical activity you have performed : "+RESET);
			System.out.println("\n1.Football \n\n2.Cricket \n\n3.Baseball \n\n4.Gymnastics \n\n5.Badminton \n\n6.Golf \n\n7.Boxing \n\n8.Skiing \n\n9.Tennis \n\n10.Basketball");
			System.out.println("\nENTER YOUR CHOICE : ");
			c2=input.nextInt();
			switch(c2)
			{
			case 1:
				System.out.println("\nEnter the duration of playing Football in hours :");
				time=input.nextInt();				
				burnt=540*time;				
				totburnt=totburnt+burnt;
				n="Football";
				break;
			case 2:
				System.out.println("\nEnter the duration of Playing cricket in hours :");
				time=input.nextInt();				
				burnt=272*time;				
				totburnt=totburnt+burnt;
				n="Cricket";
				break;
			case 3:
				System.out.println("\nEnter the duration of playing baseball in hours :");
				time=input.nextInt();				
				burnt=460*time;				
				totburnt=totburnt+burnt;
				n="Baseball";
				break;
			case 4:
				System.out.println("\nEnter the duration of performing gymnastics in hours :");
				time=input.nextInt();				
				burnt=298*time;				
				totburnt=totburnt+burnt;
				n="Gymnastics";
				break;
			case 5:
				System.out.println("\nEnter the duration of playing badminton in hours :");
				time=input.nextInt();				
				burnt=334*time;				
				totburnt=totburnt+burnt;
				n="Badminton";
				break;
			case 6:
				System.out.println("\nEnter the duration of playing golf in hours :");
				time=input.nextInt();				
				burnt=410*time;				
				totburnt=totburnt+burnt;
				n="Golf";
				break;
			case 7:
				System.out.println("\nEnter the duration of boxing in hours :");
				time=input.nextInt();				
				burnt=670*time;				
				totburnt=totburnt+burnt;
				n="Boxing";
				break;
			case 8:
				System.out.println("\nEnter the duration of skiing in hours :");
				time=input.nextInt();				
				burnt=446*time;				
				totburnt=totburnt+burnt;
				n="Skiing";
				break;
			case 9:
				System.out.println("\nEnter the duration of playing tennis in hours :");
				time=input.nextInt();			
				burnt=520*time;				
				totburnt=totburnt+burnt;
				n="Tennis";
				break;
			case 10:
				System.out.println("\nEnter the duration of playing basketball in hours :");
				time=input.nextInt();				
				burnt=596*time;				
				totburnt=totburnt+burnt;
				n="Basketball";
				break;
			default:
				System.out.println("\nEnter a valid choice");
				break;
				
			}
			obj[i]=new Activity(n,burnt,time);
		}
		else if(c1==3)
		{
			clrscr1();
			System.out.println(CYAN+"Chose the physical activity you have performed : "+RESET);
			System.out.println("\n1.Sit ups \n\n2.Weight lifting \n\n3.Planks \n\n4.Crunches \n\n5.Elliptical Machine \n\n6.Push ups \n\n7.Stair Machine \n\n8.Rowing Machine \n\n9.Squats \n\n10.Pull ups");
			System.out.println("\nENTER YOUR CHOICE : ");
			c2=input.nextInt();
			switch(c2)
			{
			case 1:
				System.out.println("\nEnter the duration of doing sit ups in hours :");
				time=input.nextInt();				
				burnt=540*time;				
				totburnt=totburnt+burnt;
				n="Sit Ups";
				break;
			case 2:
				System.out.println("\nEnter the duration of weight lifting in hours :");
				time=input.nextInt();				
				burnt=272*time;				
				totburnt=totburnt+burnt;
				n="Weight Lifting";
				break;
			case 3:
				System.out.println("\nEnter the duration of doing planks in hours :");
				time=input.nextInt();				
				burnt=460*time;				
				totburnt=totburnt+burnt;
				n="Planks";
				break;
			case 4:
				System.out.println("\nEnter the duration of doing crunches in hours :");
				time=input.nextInt();				
				burnt=298*time;				
				totburnt=totburnt+burnt;
				n="Crunches";
				break;
			case 5:
				System.out.println("\nEnter the duration of using elliptical machine in hours :");
				time=input.nextInt();			
				burnt=334*time;				
				totburnt=totburnt+burnt;
				n="Elliptical Machine";
				break;
			case 6:
				System.out.println("\nEnter the duration of doing push ups in hours :");
				time=input.nextInt();
				burnt=410*time;				
				totburnt=totburnt+burnt;
				n="Push Ups";
				break;
			case 7:
				System.out.println("\nEnter the duration of using stair machine in hours :");
				time=input.nextInt();	
				burnt=670*time;				
				totburnt=totburnt+burnt;
				n="Stair Machine";
				break;
			case 8:
				System.out.println("\nEnter the duration of using rowing machine in hours :");
				time=input.nextInt();			
				burnt=446*time;				
				totburnt=totburnt+burnt;
				n="Rowing Machine";
				break;
			case 9:
				System.out.println("\nEnter the duration of doing squats in hours :");
				time=input.nextInt();				
				burnt=520*time;			
				totburnt=totburnt+burnt;
				n="Squats";
				break;
			case 10:
				System.out.println("\nEnter the duration of doing pull ups in hours :");
				time=input.nextInt();
				burnt=596*time;
				totburnt=totburnt+burnt;
				n="Pull ups";
				break;
			default:
				System.out.println("\nEnter a valid choice");
				break;
				
			}
			obj[i]=new Activity(n,burnt,time);
		}
		else
		{
			System.out.println("\nEnter a Valid choice");
		}
		
		}
		clrscr1();
		System.out.println(GREEN+"\t\t\t\t\t\t\t\t\tSUMMARY\n\n\n\n"+RESET);
		System.out.println(YELLOW+"\t\t\t\tNAME\t\t\t\t\tDURATION\t\t\t\tCALORIES BURNT\n"+RESET);
		for(int i=0;i<count;i++)
		{
		System.out.println("\t\t\t"+obj[i].name);
		System.out.print("\t\t\t\t\t\t\t\t   "+obj[i].time);
		System.out.print("\t\t\t\t\t  "+obj[i].calburnt);
		System.out.println("\n\n");
		}
		System.out.println("\n\n\n\n\t\t\t\t\t\t\t"+CYANBACK+BLACK+"TOTAL CALORIES BURNT = "+totburnt+RESET);
		System.out.println("\n\n\n\n\n");
		in.nextLine();
	}
	
	
	
	
	
	public static void suggestion()
	{
		Scanner in=new Scanner(System.in);
		clrscr1();
		double h,w;
		int a,g=0;
		double main=0,mwg=0,wg=0,fwg=0,mwl=0,wl=0,fwl=0;
		System.out.println("Enter you gender\n\n1.Male\n2.Female\n\nEnter your choice");
		g=input.nextInt();
		System.out.println("\n\n\nEnter your Height in cm :");
		h=input.nextDouble();
		System.out.println("\n\n\nEnter your Weight in kg :");
		w=input.nextDouble();
		System.out.println("\n\n\nEnter your Age :");
		a=input.nextInt();
		h=h/2.54;
		w=w*2.205;
		if(g==1)
		{
			main=66+(6.23*w)+(12.7*h)-(6.8*a);	
			main=main*1.2;
		}
		else if(g==2)
		{
			main=655+(4.3*w)+(4.7*h)-(4.7*a);
			main=main*1.2;
		}
		else
		{
			System.out.println("\n\n\nEnter a valid Choice");
		}
		mwg=main+250;
		wg=main+500;
		fwg=main+1000;
		mwl=main-250;
		wl=main-500;
		fwl=main-1000;
		System.out.println("\n\n\n\n\n\n");
		System.out.println(BLUE+"\n\n\nCalories required to maintaion weight : "+RESET+String.format("%.0f",main));
		System.out.println(BLUE+"\n\n\nCalories required for mild weight gain (0.25 KG per week) : "+RESET+String.format("%.0f",mwg));
		System.out.println(BLUE+"\n\n\nCalories required for weight gain (0.5 KG per week) : "+RESET+String.format("%.0f",wg));
		System.out.println(BLUE+"\n\n\nCalories required for fast weight gain (1 KG per week) : "+RESET+String.format("%.0f",fwg));
		System.out.println(BLUE+"\n\n\nCalories required for mild weight loss (0.25 KG per week) : "+RESET+String.format("%.0f",mwl));
		System.out.println(BLUE+"\n\n\nCalories required for weight loss (0.5 KG per week) : "+RESET+String.format("%.0f",wl));
		System.out.println(BLUE+"\n\n\nCalories required for fast weight loss (1 KG per week) : "+RESET+String.format("%.0f",fwl));
		System.out.println("\n\n\n\n\n");
		in.nextLine();
	}
	
	
	
	public static void bmi()
	{
		Scanner in=new Scanner(System.in);
		clrscr1();
		double h,w,bmi;
		System.out.println("Enter your Height in cm :");
		h=input.nextDouble();
		System.out.println("\n\n\nEnter your Weight in kg :");
		w=input.nextDouble();
		h=h/100;
		h=h*h;
		bmi=w/h;
		System.out.println(RED+"\n\n\n\nBody Mass Index(BMI) = "+RESET+String.format("%.0f",bmi));
		if(bmi<18.5)
		{
			System.out.println(WHITEBACK+BLACK+"\n\n\nYOU ARE UNDERWEIGHT!!"+RESET);
			System.out.println("\n\nCONSUME MORE FOOD AND INCREASE YOUR WEIGHT");
			in.nextLine();
			System.out.println("\n\n\n\n\n\n");
			System.out.println(WHITEBACK+BLACK+"\n\nDIET PLAN FOR WEIGHT GAIN"+RESET);
			System.out.println(CYAN+"\n\nEARLY MORNING(6 AM - 7 AM) : "+RESET);
			System.out.println("1 glass warm water\n5 almonds (soaked overnight)\ntea or coffee");
			System.out.println(CYAN+"\n\nBREAKFAST(9 AM - 10 AM) : "+RESET);
			System.out.println("Chapathi with scrambled Egg \nor \nparatha with veg kurma \nor \ncheese sandwich with 2 boiled eggs \nor \nidli with coconut chutney and sambhar.");
			System.out.println(CYAN+"\n\nLUNCH(1 PM - 2 PM) : "+RESET);
			System.out.println("Stuffed paratha/roti \nor \nrice with vegetables \nor \nbiriyani with raita \nor \nside dishes : paneer/sprouts/egg/fish/chicken.");
			System.out.println(CYAN+"\n\nEVENING(5 PM - 6 PM) : "+RESET);
			System.out.print("Fruits and Marie biscuit with tea or coffee.");
			System.out.println(CYAN+"\n\nDINNER(7:30 PM - 8:30 PM) : "+RESET);
			System.out.println("The combinations can be same as lunch. You may avoid eating non-veg at dinner.");
			}
		else if(bmi>=18.5 && bmi <=24.9)
		{
			System.out.println(WHITEBACK+BLACK+"\n\n\nYOU ARE AT A HEALTHY WEIGHT!!"+RESET);
			System.out.println("\n\nEAT A HEALTHY BALANCED DIET AND MAINTAIN YOUR CURRENT WEIGHT");
			System.out.println("\n\n\nFOLLOW YOUR CURRENT DIET PLAN");
		}
		else if(bmi>=25.0 && bmi <=29.9)
		{
			System.out.println(WHITEBACK+BLACK+"\n\n\nYOU ARE OVERWEIGHT!!"+RESET);
			System.out.println("\n\nREDCUCE INTAKE OF FOOD ITEMS AND REDUCE YOUR WEIGHT");
			in.nextLine();
			System.out.println("\n\n");
			System.out.println(WHITEBACK+BLACK+"\nDIET PLAN FOR WEIGHT LOSS"+RESET);
			System.out.println(CYAN+"\n\nEARLY MORNING(6 AM - 7 AM) : "+RESET);
			System.out.println("1 glass warm water\n5 almonds (soaked overnight)\ntea or coffee");
			System.out.println(CYAN+"\n\nBREAKFAST(9 AM - 10 AM) : "+RESET);
			System.out.println("breakfast cereal with 1 cup milk \nor \n2 egg whites with brown bread \nor \nvegetable salad with 1 glass milk \nor \noats with 1 cup milk.");
			System.out.println(CYAN+"\n\nLUNCH(1 PM - 2 PM) : "+RESET);
			System.out.println("Wheat roti/rice with vegetables \nor \nsalad with soup \nor \nside dishes : Sprouts/dal/curd/fish/chicken/egg whites.");
			System.out.println(CYAN+"\n\nEVENING(5 PM - 6 PM) : "+RESET);
			System.out.println("Fruits/Thin butttermilk");
			System.out.println(CYAN+"\n\nDINNER(7:30 PM - 8:30 PM) : "+RESET);
			System.out.println("Clear soup with vegetables and half cup thin dal.");
			}
		else if(bmi>=30.0)
		{
			System.out.println(WHITEBACK+BLACK+"\n\n\nYOU ARE OBESE!!"+RESET);
			System.out.println("\n\nCUT DOWN YOUR CALORIE INTAKE AND GO TO THE GYM TO REDUCE YOUR WEIGHT");
		}
		else
		{
			System.out.println("\n\n\nENTER CORRECT VALUES");
		}
		in.nextLine();
	}
	
	
	
	
	public static void companion()
	{
		Scanner in=new Scanner(System.in);
		clrscr1();
		System.out.println("\t\t\t\t\t\t\t\t"+CYAN+"CHOSE EXERCISE DIFFICULTY LEVEL :"+RESET);
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t1.BEGINNER");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t2.INTERMEDIATE");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t3.PROFESSIONAL");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\tENTER YOUR CHOICE");
		clrscr2();
		int n=input.nextInt();
		clrscr2();
		switch(n)
		{
		case 1:
			clrscr1();
			System.out.println("\t\t\t\t\t\t\t"+CYAN+"YOU WILL BE PERFORMING THE FOLLOWING EXERCISES"+RESET);
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t1.PUSHUPS");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t2.SQUATS");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t3.PLANK");
			clrscr2();
			for(int i=0;i<3;i++)
			{
				System.out.println("");
			}
			in.nextLine();
			for(int i=0;i<10;i++)
			{
				System.out.println("");
			}
			System.out.println("\t\t\t\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"PUSHUPS"+RESET);
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t"+PURPLE+"INSTRUCTIONS:"+RESET);
			System.out.println("");
			System.out.println("\t\t\t\t\t1.Get down on all fours, placing your hands slightly wider than your shoulders.");
			System.out.println("");
			System.out.println("\t\t\t\t\t2.Straighten your arms and legs.");
			System.out.println("");
			System.out.println("\t\t\t\t\t3.Lower your body until your chest nearly touches the floor.");
			System.out.println("");
			System.out.println("\t\t\t\t\t4.Pause, then push yourself back up.");
			System.out.println("");
			System.out.println("\t\t\t\t\t5.Repeat.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			clrscr2();
			timer();
			clrscr1();
			System.out.println("\t\t\t\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"SQUATS"+RESET);
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t"+PURPLE+"INSTRUCTIONS:"+RESET);
			System.out.println("");
			System.out.println("\t\t\t\t\t1.Stand straight with feet hip-width apart.");
			System.out.println("");
			System.out.println("\t\t\t\t\t2.Tighten your stomach muscles.");
			System.out.println("");
			System.out.println("\t\t\t\t\t3.Lower down, as if sitting in an invisible chair.");
			System.out.println("");
			System.out.println("\t\t\t\t\t4.Straighten your legs to lift back up.");
			System.out.println("");
			System.out.println("\t\t\t\t\t5.Repeat.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			clrscr2();
			timer();
			clrscr1();
			System.out.println("\t\t\t\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"PLANK"+RESET);
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t"+PURPLE+"INSTRUCTIONS:"+RESET);
			System.out.println("");
			System.out.println("\t\t\t\t\t1.Begin in the plank position, face down with your forearms and toes on the floor.");
			System.out.println("");
			System.out.println("\t\t\t\t\t2.Engage your abdominal muscles, drawing your navel toward your spine.");
			System.out.println("");
			System.out.println("\t\t\t\t\t3.Hold this position for 10 seconds.");
			System.out.println("");
			System.out.println("\t\t\t\t\t4.Repeat.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			clrscr2();
			timer();
			clrscr1();
			break;
			
		case 2:
			clrscr1();
			System.out.println("\t\t\t\t\t\t\t"+CYAN+"YOU WILL BE PERFORMING THE FOLLOWING EXERCISES"+RESET);
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t1.CRUNCHES");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t2.DIPS");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t3.DUMBELL CURLS");
			clrscr2();
			for(int i=0;i<3;i++)
			{
				System.out.println("");
			}
			in.nextLine();
			for(int i=0;i<10;i++)
			{
				System.out.println("");
			}
			System.out.println("\t\t\t\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"CRUNCHES"+RESET);
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t"+PURPLE+"INSTRUCTIONS:"+RESET);
			System.out.println("");
			System.out.println("\t\t\t\t\t1.Lie down on your back. Plant your feet on the floor,hip-width apart.Bend your knees and Contract your abs");
			System.out.println("");
			System.out.println("\t\t\t\t\t2.Exhale and lift your upper body, keeping your head and neck relaxed.");
			System.out.println("");
			System.out.println("\t\t\t\t\t3.Inhale and return to the starting position.");
			System.out.println("");
			System.out.println("\t\t\t\t\t4.Repeat.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			clrscr2();
			timer();
			clrscr1();
			System.out.println("\t\t\t\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"DIPS"+RESET);
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t"+PURPLE+"INSTRUCTIONS:"+RESET);
			System.out.println("");
			System.out.println("\t\t\t\t\t1.Get into position with a bench behind you.");
			System.out.println("");
			System.out.println("\t\t\t\t\t2.Tighten your core and lower your body off the bench.");
			System.out.println("");
			System.out.println("\t\t\t\t\t3.Keep your head and upper body straight.");
			System.out.println("");
			System.out.println("\t\t\t\t\t4.Hold the dipped position for 1-2 seconds before pushing back up.");
			System.out.println("");
			System.out.println("\t\t\t\t\t5.Repeat.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			clrscr2();
			timer();
			clrscr1();
			System.out.println("\t\t\t\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"DUMBELL CURLS"+RESET);
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t"+PURPLE+"INSTRUCTIONS:"+RESET);
			System.out.println("");
			System.out.println("\t\t\t\t\t1.stand with your feet about hip-width apart Keeping your abdominal muscles engaged.");
			System.out.println("");
			System.out.println("\t\t\t\t\t2.Hold one dumbbell in each hand. Let your arms relax down at the sides of your body.");
			System.out.println("");
			System.out.println("\t\t\t\t\t3.bend the elbow and lift the weights so that the dumbbells approach your shoulders.");
			System.out.println("");
			System.out.println("\t\t\t\t\t4.Lower the weights to the starting position.");
			System.out.println("");
			System.out.println("\t\t\t\t\t5.Repeat.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			clrscr2();
			timer();
			clrscr1();
			break;
		case 3:
			clrscr1();
			System.out.println("\t\t\t\t\t\t\t"+CYAN+"YOU WILL BE PERFORMING THE FOLLOWING EXERCISES"+RESET);
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t1.BENCH PRESS");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t2.PULL UPS");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t3.DEADLIFTS");
			clrscr2();
			for(int i=0;i<3;i++)
			{
				System.out.println("");
			}
			in.nextLine();
			for(int i=0;i<10;i++)
			{
				System.out.println("");
			}
			System.out.println("\t\t\t\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"BENCH PRESS"+RESET);
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t"+PURPLE+"INSTRUCTIONS:"+RESET);
			System.out.println("");
			System.out.println("\t\t\t\t\t1.Lie on your back on a flat bench.Hold a barbell slightly wider than shoulder width.");
			System.out.println("");
			System.out.println("\t\t\t\t\t2.Keep your core engaged and maintain a neutral spine position throughout the movement.");
			System.out.println("");
			System.out.println("\t\t\t\t\t3.Slowly lift the bar off the rack.Lower the bar to the chest level, allowing elbows to bend out to the side.");
			System.out.println("");
			System.out.println("\t\t\t\t\t4.Press feet into the floor as you push the bar back up to return to starting position.");
			System.out.println("");
			System.out.println("\t\t\t\t\t5.Repeat.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			clrscr2();
			timer();
			clrscr1();
			System.out.println("\t\t\t\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"PULL UPS"+RESET);
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t"+PURPLE+"INSTRUCTIONS:"+RESET);
			System.out.println("");
			System.out.println("\t\t\t\t\t1.Grip a pullup bar with your palms facing whichever direction you prefer.");
			System.out.println("");
			System.out.println("\t\t\t\t\t2.Pull your bodyweight up until your chin is just barely above the bar.");
			System.out.println("");
			System.out.println("\t\t\t\t\t3.Lower yourself until your arms are fully extended.");
			System.out.println("");
			System.out.println("\t\t\t\t\t4.Repeat.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			clrscr2();
			timer();
			clrscr1();
			System.out.println("\t\t\t\t\t\t\t\t\t\t"+WHITEBACK+BLACK+"DEADLIFT"+RESET);
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t"+PURPLE+"INSTRUCTIONS:"+RESET);
			System.out.println("");
			System.out.println("\t\t\t\t\t1.Stand with your mid-foot under the barbell.");
			System.out.println("");
			System.out.println("\t\t\t\t\t2.Bend over and grab the bar with a shoulder-width grip.");
			System.out.println("");
			System.out.println("\t\t\t\t\t3.Bend your knees until your shins touch the bar.");
			System.out.println("");
			System.out.println("\t\t\t\t\t4.Lift your chest up and straighten your lower back.");
			System.out.println("");
			System.out.println("\t\t\t\t\t5.Take a big breath, hold it, and stand up with the weight.");
			System.out.println("");
			System.out.println("\t\t\t\t\t6.Repeat.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			clrscr2();
			timer();
			clrscr1();
			break;
		default:
			System.out.println("\t\t\t\t\t\t\t\t\t\tEnter a valid choice");
			break;
		}
		
	}
	
	
	
	
	public static void main(String[] args)
	{
	int i;
	for(i=0;i<16;i++)
	{
		System.out.println("");
	}
	System.out.println("\t\t\t\t\t\t\t\t\t"+YELLOWBACK+BLACK+"CALORIE TRACKER"+RESET);
	input.nextLine();
	boolean b=true;
	while(b)
	{
		clrscr1();
		System.out.println("\t\t\t\t\t\t\t\t\t"+CYAN+"MENU"+RESET);
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t1.WORKOUT COMPANION");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t2.CALORIES CONSUMED COUNTER");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t3.CALORIE SUGGESTION");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t4.BMI CALCULATOR");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t5.CALORIES BURNT COUNTER");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t6.EXIT");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\tENTER YOUR CHOICE :");
		clrscr2();
		int a=input.nextInt();
		clrscr2();
		switch(a)
		{
		case 1:
				companion();
				break;
		case 2:
				consumed();
				break;
		case 3:
				suggestion();
				break;
		case 4:
				bmi();
				break;
		case 5:
				burnt();
				break;
		case 6:
				b=false;
				break;
		default:
				System.out.println("\t\t\t\t\t\t\t\t\t\tEnter a valid choice");
				break;
		}
		
	}
	}

}
