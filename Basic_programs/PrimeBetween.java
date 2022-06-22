import java.util.Scanner;

public class PrimeBetween {

    //Q:-Write a function that returns all prime numbers between two given numbers.

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int min=Math.min(a, b);
        int max= Math.max(a, b);
        for(int i=min+1;i<max;i++)
        {
            isPrime(i);
        }

        sc.close();
    }
   
    static void isPrime(int n)
    {
        boolean c=true;
        for(int i=2; i<= Math.sqrt(n);i++)
        {
            if(n%i==0)
            c=false;
        }

        if(c) System.out.println(n);

    }
}
