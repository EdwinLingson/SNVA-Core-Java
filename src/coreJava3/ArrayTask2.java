package coreJava3;

import java.util.Scanner;

public class ArrayTask2 {

	public static void main(String[] args) {
			String student_name;
			int student_id;
			String branch;
			int sem;
			float avg;
			int total =0;
			String grade;
			int[] subject_marks = new int[6];
			String[] subjects = {"Java","Python", "Web","C", "CPP","spring-boot"};

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Name");
		student_name = scanner.nextLine();
		System.out.println("Enter Student id");
		student_id = scanner.nextInt();
		System.out.println("Enter Branch");
		branch = scanner.next();
		System.out.println("Enter Semester");
		sem = scanner.nextInt();

		for (int i =0;i<subjects.length;i++){
			System.out.printf("Enter marks of %s: \n",subjects[i]);
			subject_marks[i] = scanner.nextInt();
			total+= subject_marks[i];
		}

		avg = (float) (total/6.0);

		if (avg>=90) grade = "A++";
		else if (avg>80) {
			grade ="A+";
		} else if (avg>70) {
			grade ="B++";
		}
		else if (avg>60) {
			grade ="B+";
		}
		else if (avg>50) {
			grade ="C";
		}
		else  {
			grade ="E";
		}

		for(int i=0;i<50;i++) {
			System.out.print("=");
		}
		System.out.println("=");

		System.out.printf("CIT\t\t\tREPORT CARD\n");

		for(int i=0;i<50;i++) {
			System.out.print("=");
		}
		System.out.println("=");

		System.out.printf("%s\t%d\t%s\tSem %d\n",student_name,student_id,branch,sem);

		
		for(int i=0;i<50;i++) {
			System.out.print("=");
		}
		System.out.println("=");

		for (int i = 0; i < subject_marks.length; i++) {
			System.out.printf("%d\t%s\t\t\t%d\n",i+1,subjects[i],subject_marks[i]);
		}

		for(int i=0;i<50;i++) {
			System.out.print("=");
		}
		System.out.println("=");

		System.out.printf("Total: %d\t Avg: %f \tGrade:%s",total,avg,grade);

	}

}
