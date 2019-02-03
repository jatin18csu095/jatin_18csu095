package com.ncu.assignment;
public class Qualification
{
	String Name;
	String university;
	String institute;
	float cgpa;
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return Name;
	}
	
	public void setuniversity(String university)
	{
		this.university=university;
	}
	public String getuniversity()
	{
		return university;
	}
	
	public void setinstitute(String institute)
	{
		this.institute=institute;
	}
	public String getinstitute()
	{
		return institute;
	}
	
	public void setcgpa(float cgpa)
	{
		this.cgpa=cgpa;
	}
	public float getcgpa()
	{
		return cgpa;
	}
}