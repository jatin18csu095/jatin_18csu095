class Box1
{
 double width;
 double depth;
 double height;
 Box1(double w,double h,double d)
 {
   this.width=w;
   this.height=h;
   this.depth=d;

 }
 Box1()
 {
   width=1;
   height=1;
   depth=1;
 }
 double volume()
 {
 	double volume;
 	volume=height*depth*width;
 	return volume;
 }
}
class BoxDemo1
{
	public static void main(String args[])
	{
       Box1 b1=new Box1(7,8,6);
       Box1 b2=new Box1();
       System.out.println(b1.volume());
       System.out.println(b2.volume());
	}
}