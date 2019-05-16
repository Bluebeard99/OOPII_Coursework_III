package haris.iuea;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student std1 = new Student("18/UG/485/BSSE-S","Kalyango Haris ",1999);	
		
		System.out.println("\nStudent Name :"+std1.getName());
		
		System.out.println("Student Year Of Birth :" +std1.getYOB());		
		
		System.out.println("Student Registration Number :"  +std1.getRegNO());
		
		std1.getCourseWork();
	}

}
