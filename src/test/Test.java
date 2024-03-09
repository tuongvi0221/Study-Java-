package test;

import java.util.Scanner;
import main.ListStudent;
import main.Student;

public class Test {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		ListStudent dssv = new ListStudent();
		
		int opt = 0;
		do {
			sc.nextLine();
			System.out.println("MENU--------");
			System.out.println("PLEASE CHOOSE YOUR CHOICE--------");
			System.out.println("1. Add student to the list. \n" 
	                 + "2. Print List Student. \n"
	                 + "3. Check if the list is null or not null. \n"
	                 + "4. Select a number of students. \n"
	                 + "5. Make the list null. \n"
	                 + "6. Check if the student exists or not based on codeSV. \n"
	                 + "7. Delete the student from the List based on codeSV. \n"
	                 + "8. Find all students based on entering the key. \n"
	                 + "9. Print the list of students with scores from high to low. \n"
	                 + "0. Exist \n");
			
			opt = sc.nextInt();
			sc.nextLine();
			if(opt == 1) {
				System.out.println("Enter the code SV");
				String codeSV = sc.nextLine();
				System.out.println("Enter the student's name");
				String name = sc.nextLine();
				System.out.println("Enter the student's birth");
				int year = sc.nextInt();
				System.out.println("Enter the student's score avg");
				float score = sc.nextFloat();
				
				Student sv = new Student(codeSV, name, year, score);
				dssv.addStudent(sv);
				
			}else if( opt == 2) {
				dssv.printList();
			}else if(opt == 3) {
				System.out.println("Check if the list is null or not null: " + dssv.checkListNull());
			}else if(opt == 4) {
				System.out.println("Select a number of students: " + dssv.getNumberOfStudent());
			}else if(opt == 5) {
				 dssv.makingNullList();

			}else if(opt == 6) {
				System.out.println("Enter the code SV");
				String codeSV = sc.nextLine();
				Student sv = new Student(codeSV);
				System.out.println("Check if the student exists or not based on codeSV: " + dssv.checkingExist(sv));
			}else if (opt == 7) {
				System.out.println("Enter the code SV");
				String codeSV = sc.nextLine();
				Student sv = new Student(codeSV);
				System.out.println("Delete the student from the List based on codeSV: " + dssv.deleteStudent(sv));
			}else if(opt == 8) {
				System.out.println("Enter the student's name");
				String name = sc.nextLine();
				System.out.println("Find all students based on name \n ");
				dssv.findStudent(name);
			}else if(opt == 9) {
				dssv.sortScoreDesc();
				dssv.printList();
			}
					
		}while(opt != 0);
	}
}
