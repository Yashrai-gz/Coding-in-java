import java.util.Scanner;

public class ArmstrongCheck {
    //an Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
    //371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371
    //there are only 4 three digit armstrong numbers 153, 370, 371, 407.
    public static void main(String[] args) {
        System.out.println("Enter a three digit number to check it is an armstrong number or not : ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(isArm(n))
        {
            System.out.println("Yes, the number is an armstrong number");
        }
        else System.out.println("No, the number is not an armstrong number");
        sc.close();
    }

    static  boolean isArm(int n)
    {
        int original=n;
        int sum= 0;
        while(n>0)
        {
            int t=n%10;
            sum=sum+(t*t*t);
            n= n/10;
        }

        return original==sum;

    }
}
