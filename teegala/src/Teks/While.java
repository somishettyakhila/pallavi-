package Teks;

import java.util.Scanner;

public class While {
	public static void main(String args[]) {
		int students=0;
		boolean choice=true;
		Scanner sc=new Scanner(System.in);
		while(choice) {
			 
				
				System.out.println("student added successfully");
			
			System.out.println("do you want add another student..! 1.true 2.false");
			choice=sc.nextBoolean();
			if(choice==true) {
				students++;
			}
			
		}
			 System.out.println("Total number of students:" +students);
	}

	}

