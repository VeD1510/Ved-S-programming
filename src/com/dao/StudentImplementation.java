package com.dao;

import java.util.Scanner;

import com.beans.Course;
import com.beans.StudentInfo;

public class StudentImplementation extends StudentDetails{
	
	Scanner sc;
	
	int count;
	StudentInfo[] studArr;
	
	public StudentImplementation()
	{
		sc=new Scanner(System.in);
		count=0;
	    studArr=new StudentInfo[2];
	}

	@Override
	public
	void insert() {
		//System.out.println("Enter No. Of Students:  ");
		
		//int num=sc.nextInt();
		
		for(int i=0;i<studArr.length;i++)
		{
			System.out.println("Enter Student ID: ");
			int id=sc.nextInt();
			StudentInfo s =new StudentInfo();
			s.setStudId(id);
			System.out.println("Enter Student Name: ");
			String name=sc.next();
			s.setStudName(name);
			s.setC(new Course());
			System.out.println("Enter Course ID: ");
			int cid=sc.nextInt();
			s.getC().setcId(cid);
			System.out.println("Enter Course Name: ");
			String cname=sc.next();
			s.getC().setcName(cname);
			studArr[i]=s;
			
			
			
			
			
			
		
		}
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void displayAll() {
		
		for(int i=0;i<studArr.length;i++)
		{
			StudentInfo s =studArr[i];
			System.out.println(s.getStudId()+"  "+s.getStudName()+"  "+s.getC().getcId()+"  "+s.getC().getcName());
		}
		
		
	}

}
