import java.util.Scanner;
public class caladd
{
    public static void main(String args[])
    {
	float a,b,res;
	char choice,ch;
	Scanner sc=new Scanner(System.in);
	do {
	    System.out.print("1. Add two numbers\n");
	    System.out.print("2. Exit \n\n");
	    System.out.print("Enter choice: ");
	    choice=sc.next().charAt(0);
	    switch (choice)
	    {
		case '1': System.out.print("Enter two numbers: ");
		a=sc.nextFloat();
		b=sc.nextFloat();
		res=a+b;
		System.out.print("Result: "+res);
		break;
		case '2': System.exit(0);
			    break;
		default: System.out.print("invalid choice");
		break;
	    }
	    System.out.print("\n----------------------\n");
	}while (choice!=2);
}}
