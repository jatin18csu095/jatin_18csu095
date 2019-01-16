class Box
{
 double width;
 double depth;
 double height;
 Box(double w,double h,double d)
 {
   this.width=w;
   this.height=h;
   this.depth=d;

 }
 Box()
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
       Box b=new Box();
       //b.setDim(1,2,3);
       double vol=b.volume();
       System.out.println(vol);
	}
}