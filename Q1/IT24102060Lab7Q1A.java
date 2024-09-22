import java.util.Scanner;

public class IT24102060Lab7Q1A{
    public static void main(String[] args)
    {
        int count=1;
        int sum=0;
        double average;
        String grade;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");
        for(int mark; count<=4; count++)
        {
            System.out.print("Enter Subject Mark " + count + ":");
            mark = input.nextInt();
            sum += mark;
        }
        System.out.println(" ");

        average = sum/(count - 1);
        System.out.println("Average is : " + average);

        grade = (average<=100 && average>=75) ? "Distinction" : (average<=74 && average>=50) ? "Credit" : "Fail";
        System.out.print("Overall Credit is: " + grade);
    }
}