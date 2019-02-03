import java.lang.Exception;
class abc
{
	public static void main(String args[])
	{
	try
	{
	Exception a=new Exception("focp");
	throw a;
	}
	catch(Exception e)
	{
    System.out.println(e.getMessage());
	}
finally
{
	System.out.println("you were here");
}
}
}
