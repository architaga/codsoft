import java.util.*;
public class StudentGradingSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of subject:");
        int numberOfSubjects=sc.nextInt();
        int TotalMarks=0;
        for(int i=1;i<=numberOfSubjects;i++){
            System.out.print("Enter marks for subject "+i+" (out of 100): ");
            int marks=sc.nextInt();
            TotalMarks += marks;
        }
        double averagePercentage=(TotalMarks*100.0)/(numberOfSubjects*100);
        String grade;
        if(averagePercentage>=90){
            grade="A";
        }else if(averagePercentage>=80){
            grade="B";

        }else if(averagePercentage>=70){
            grade="C";
        }else if(averagePercentage>=60){
            grade="D";
        }else{
            grade="F";
        }
        System.out.println("\nResults:");
        System.out.println("Total marks: "+TotalMarks);
        System.out.println("Average percentage: "+averagePercentage+"%");
        System.out.println("grade: "+grade);

    }
}