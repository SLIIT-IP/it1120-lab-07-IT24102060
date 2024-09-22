import java.util.Scanner;

public class IT24102060Lab7Q2B{
    public static void main(String[] args)
    {
        int i, j;
        int k=1; 
        
        Scanner input = new Scanner(System.in);
        
        for(j=1; j<=5; j++)
        {
         System.out.print(j + "-");

        for(i=1; i<=k; i++)
        {
            System.out.print("*");
        }
        k++;
        System.out.println(" ");
        }
    }
}