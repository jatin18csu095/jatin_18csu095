import java.util.Scanner;
class digits{
public static void main (String args[]){
int x;
System.out.println("enter the five digit no.");
Scanner s=new Scanner(System.in);
x=s.nextInt();
int x1,x2,x3,x4,x5;
if(x>=10000 && x<=99999)
{ x1=(x%10);
 x2=((x-x1)%100)/10;
 x3=((x-x2-x1)%1000)/100;
 x4=((x-x3-x2-x1)%10000)/1000;
 x5=((x-x4-x3-x2-x1)%100000)/10000;
System.out.println(x5 + "   " + x4 + "   " + x3 + "   " + x2 + "   " + x1);
}
else
System.out.println("not a valid 5 digit no.");
}


}