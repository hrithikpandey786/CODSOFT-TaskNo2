package studentGradeCalculator2;
import java.util.*;

public class GradeCalculator2 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("-----------------------------------------STUDENT GRADE CALCULATOR------------------------------------------");
		StudentMarks();
	
	}
	
	public static String CalculateGrade(int percent) {
		
		String grade = "";
		if(percent > 90)
		    grade = "A1";
		else if(percent > 80)
			grade = "A2";
		else if(percent > 70)
			grade = "B1";
		else if(percent > 60)
			grade = "B2";
		else if(percent > 50)
			grade = "C1";
		else if(percent > 40)
			grade = "C2";
		else if(percent >= 33)
			grade = "D";
		else if(percent > 20)
			grade = "E1";
		else grade = "E2";
		
		return grade;
	}
	
	public static void StudentMarks() {
		
		Scanner sc = new Scanner(System.in);
		int totalMarks = 0;
		String grade = "";
		System.out.println("Enter number of subjects ");
		int numberOfSubjects = 0;
		numberOfSubjects = sc.nextInt();
		String subjects[] = new String[numberOfSubjects];
		int marks[] = new int[numberOfSubjects];
		
		for(int i=0; i<numberOfSubjects; i++) {
			
			System.out.println("Enter name of Subject "+(i+1));
			subjects[i] = sc.next();
			System.out.print("Enter marks obtained in "+subjects[i]+"(out of 100) ");
			marks[i] = sc.nextInt();
			totalMarks += marks[i];
		
		}
		
		int percentage = totalMarks/numberOfSubjects;
		grade = CalculateGrade(percentage);
		
		DisplayGrades(subjects, marks, percentage, totalMarks, grade);
	
	}
    
	public static void DisplayGrades(String subjects[],int marks[], int percent, int totalMarks, String grade) {
		
		System.out.println();
		System.out.print("          -------------------RESULT-------------------");
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println(" SUBJECT\tTOTAL MARKS\tOBTAINED MARKS");
		System.out.println("----------------------------------------------------------------");
		
		for(int i=0; i<subjects.length; i++) {
			System.out.print("  "+subjects[i]+"\t\t100\t\t"+marks[i]+"\n");
		}
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\tPERCENTAGE: "+percent+"%"+"\t\tGRADE: "+grade);
		System.out.println("----------------------------------------------------------------");
	
	}
}
