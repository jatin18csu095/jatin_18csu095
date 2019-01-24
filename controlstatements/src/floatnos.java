import java.util.Scanner;
class floatnos
{
	public static void main(String args[])
	{
	 double a,b;
	 System.out.println("enter the first no ");
	 Scanner s= new Scanner(System.in);
	 a=s.nextDouble();
	 System.out.println("enter the second no.");
	 b=s.nextDouble();
	 if(a==b)
	{ System.out.println("the entered nos. are same");}
     else
     {System.out.println("the entered nos. are not same");}
	}
}