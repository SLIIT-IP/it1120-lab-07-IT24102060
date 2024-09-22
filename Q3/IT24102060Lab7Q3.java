import java.util.Scanner;

public class IT24102060Lab7Q3{
    public static void main(String[] args)
    {
        int i, totalBill;
        char payMode;
        double discount, payAmount;
        Scanner input = new Scanner(System.in);

        for(i=1; i<=5; i++)
        {
            System.out.println("Customer" + i);

            System.out.print("Enter total bill amount: ");
            totalBill = input.nextInt();

            System.out.print("Enter mode of payment (C for cash, O for other):");
            payMode = input.next().charAt(0);

            if(payMode == 'C' || payMode =='c')
            {
                discount = totalBill*0.05;
                System.out.println("Discount is : " + discount);
                payAmount = totalBill - discount;
                System.out.println("Amount to be paid: " + payAmount);
            }
            else if(payMode == 'O' || payMode =='o')
            {
                discount = totalBill;
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + discount);
            }
            else
            {
                System.out.println("Payment mode is Not Valid");
            }

            System.out.println(" ");
        }
    }
}