package com.ncu.assignment.main;
import com.ncu.assignment.*;
import com.ncu.assignment.exception.*;
import java.util.*;
import java.text.SimpleDateFormat;
import com.ncu.assignment.validation.*;
public class StudentDriver
{
	

	public void student()
	{
		Scanner sc=new Scanner(System.in);
		Student sd1=new Student();
		
		try
		{
			System.out.print(" Student first name : ");
			String st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			sd1.setfirstName(st1);
			System.out.print("\nEnter Student last name  : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			sd1.setlastName(st1);
			System.out.println("\nEnter Address : ");
			System.out.print("LINE 1  : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			sd1.addr.setline1(st1);
			System.out.print("LINE 2  : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			sd1.addr.setline2(st1);
			System.out.print("City    : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			sd1.addr.setcity(st1);
			System.out.print("State   : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			sd1.addr.setstate(st1);
			System.out.print("PinCode : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			sd1.addr.setpinCode(Integer.parseInt(st1));
			System.out.print("\nE-Mail : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			sd1.seteMail(st1);
			System.out.print("\nContact No. : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			sd1.setcontactNo(st1);
			
			System.out.print("Enter Student Date of Birth in dd-mm-yyyy format: ");
				SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
				String dob=sc.nextLine();
				try
				{
					sd1.setdob(sdf.parse(dob));
				}
				catch(Exception e)
				{
					throw new DateFormatException("Enter correct date.");
				};
			System.out.print("\nNo. of Skills you want to enter : ");
			int size=sc.nextInt();
			
			sc.nextLine();
			StudentValidation.Exception2(size);
			int sno=size;
			sd1.skills=new String[sno];
			System.out.println("Enter Skills : ");
			for(int i=0;i<sno;i++)
			{
				System.out.print("\t"+(i+1)+". : ");
				sd1.skills[i]=sc.nextLine();
				
				
			}
			System.out.print("\nNo. of Qualification you have done : ");
			size=sc.nextInt();
			StudentValidation.Exception2(size);
			int qno=size;
			sd1.skills=new String[sno];
			sd1.qual=new Qualification[qno];
			System.out.println("\nEnter Qualification : ");
			for(int j=0;j<qno;j++)
			{
				sd1.qual[j]= new Qualification();
				System.out.print("Qualification Name : ");
				sd1.qual[j].setqualName(sc.next());
				System.out.print("University Name    : ");
				sd1.qual[j].setuniversity(sc.next());
				System.out.print("Institute Name     : ");
				sd1.qual[j].setinstitute(sc.next());
				System.out.print("CGPA               : ");
				sd1.qual[j].setcgpa(sc.nextFloat());
			}
			System.out.print("\nNo. of Projects you have done : ");
			int pno=sc.nextInt();
			sc.nextLine();
			int rno=0;
			sd1.projects=new Project[pno];
			System.out.println("\nEnter Projects:: ");
			for(int l=0;l<pno;l++)
			{
				sd1.projects[l]= new Project();
				System.out.print("Name           : ");
				sd1.projects[l].setname(sc.next());
				System.out.print("Start Date in dd-mm-yyyy format: ");
				sc.nextLine();
				try
				{
					sd1.projects[l].setstartDate(sdf.parse(sc.nextLine()));
				}
				catch(Exception e){throw new DateFormatException("Enter correct date."); };
				
				System.out.print("End Date in dd-mm-yyyy format: ");
				try
				{
					sd1.projects[l].setendDate(sdf.parse(sc.nextLine()));
				}
				catch(Exception e){throw new DateFormatException("Enter correct date."); };
				System.out.print("Enter no. of Responsibility: ");
				rno=sc.nextInt();
				sd1.projects[l].responsibilities=new String[rno];
				System.out.println("Responsibility : ");
				for(int k=0;k<rno;k++)
				{
					System.out.print((k+1)+"**");
					sd1.projects[l].responsibilities[k]=sc.next();
				}
			}




			
			System.out.println("*******************");
			System.out.println("\nFirst Name       : "+sd1.getfirstName());
			System.out.println("\nLast Name        : "+sd1.getlastName());
			System.out.println("\nAddress          : ");
			System.out.println("Line1     : "+sd1.addr.getline1());
			System.out.println("Line2     : "+sd1.addr.getline2());
			System.out.println("City      : "+sd1.addr.getcity());
			System.out.println("State     : "+sd1.addr.getstate());
			System.out.println("PinCode   : "+sd1.addr.getpinCode());
			System.out.println("DOB        : "+sd1.getdob());
			System.out.println("\nE-Mail           : "+sd1.geteMail());
			System.out.println("\nContact No.      : "+sd1.getcontactNo());
			System.out.println("\nSkills           :");
			for(int i=0;i<sno;i++)
			{
				System.out.println("\t"+(i+1)+". : "+sd1.skills[i]);
			}
			System.out.println("\nQualification    : ");
			for(int j=0;j<qno;j++)
			{
				System.out.println("QName      : "+sd1.qual[j].getqualName());
				System.out.println("University : "+sd1.qual[j].getuniversity());
				System.out.println("Institute  : "+sd1.qual[j].getinstitute());
				System.out.println("CGPA       : "+sd1.qual[j].getcgpa());
			}
			System.out.println("\nProjects         : ");
			for(int l=0;l<pno;l++)
			{
				System.out.println("Name       : "+sd1.projects[l].getname());
				System.out.println("Start Date           : "+sd1.projects[l].getstartDate());
				System.out.println("End Date             : "+sd1.projects[l].getendDate());
				for(int k=0;k<rno;k++)
				{
					System.out.println("\t"+(k+1)+". : "+sd1.projects[l].responsibilities[k]);
				}
		}
	}
		catch(MandatoryMissingException e)
		{
			System.out.println(e);
		}
		catch(DateFormatException e1)
		{
			System.out.println(e1);
		}

}

	
	public static void main(String [] args)
	{
		
		StudentDriver s1=new StudentDriver();
		s1.student();
	}
	
}