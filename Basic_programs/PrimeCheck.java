import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        System.out.print("Enter Your number: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the number is  not prime");

        }
        sc.close();
    }

    static boolean isPrime(int n)
    {
        if(n <0) return false;
        for(int i=2; i<= Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }

        return true;

    }
}
