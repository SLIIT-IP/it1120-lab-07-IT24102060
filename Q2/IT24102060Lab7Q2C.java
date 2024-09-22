import java.util.Scanner;

public class IT24102060Lab7Q2C{
    public static void main(String[] args)
    {
        int i, j;
        int k=5; 
        
        Scanner input = new Scanner(System.in);
        
        for(j=5; j>=1; j--)
        {

        for(i=1; i<=k; i++)
        {
            System.out.print(j);
        }
        k--;
        System.out.println(" ");
        }
    }
}