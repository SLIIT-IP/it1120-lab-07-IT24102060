import java.util.Scanner;

public class IT24102060Lab7Q1B{
    public static void main(String[] args)
    {
        double average;
        String grade;

        Scanner input = new Scanner(System.in);
        
        for(int stdCount = 1; stdCount<=3; stdCount++)
        {
        System.out.println("Student " + stdCount);
        
        int sum=0;

        System.out.print("Enter Marks:");
        for(int count=1; count<=4; count++)
        {
           int mark = input.nextInt();
            sum += mark;
        }

        average = sum/ 4.0;
        System.out.println("Average is : " + average);

        grade = (average<=100 && average>=75) ? "Distinction" : (average<=74 && average>=50) ? "Credit" : "Fail";
        System.out.println("Overall Credit is: " + grade);
        System.out.println(" ");
        }
    }
}