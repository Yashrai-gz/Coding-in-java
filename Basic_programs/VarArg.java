import java.util.Arrays;
public class VarArg {
    public static void main(String[] args) {
        fun(1,2,4,6,8,0,1,2,3);

        multi( 1,'A', " Yash", "Rai ", "Java ");
    }
   
    static void fun(int ...n) // syntax to store variable length argumnet passed in a function. Fun() will store all the passed integer inside an array named n
    {
        System.out.println(Arrays.toString(n));
    }

    static void multi(int a, char b, String ...s) //Variable length argumnet should always be last, and we should never skip writing any of the argumnet before variable length argumnet because it will give us error.
    {
        System.out.println( "first variable is " + a + "\nSecond variable is " + b + "\nVariable length string will be " + Arrays.toString(s));
    }
}

