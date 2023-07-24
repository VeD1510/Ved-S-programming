package com.app;

import java.util.Scanner;

import com.dao.StudentImplementation;

public class StudentApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentImplementation s = new StudentImplementation();
		char ch;
		
		
		do
		{
			System.out.println("Enter Your Choice: ");
			System.out.println("1.Insert Details\n2.Update Details\n3.Delete Details\n4.Search Details\n5.Display All");
			int choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:s.insert();
			break;
			case 2:s.update();
			break;
			case 3:s.delete();
			break;
			case 4:s.search();
			break;
			case 5:s.displayAll();
			break;
			}
			System.out.println("Do You Want To Continue...Y/N");
			ch=sc.next().charAt(0);
			
				
			
		}while(ch!='y'|| ch!='Y');
		
	}

}
