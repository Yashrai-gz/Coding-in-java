public class Shadowing{
    static int x=77; //This will be shadowed when we try to acess x in a function where there is another variable with name x
    public static void main(String[] args) {
        int x=10; //the class variable x will be shadowed by this local variable & scope of this local variable will began when x is initialised

        System.out.println(x);

        fun();
       
    }

    public static void fun()
    {
        System.out.println(x);
    }
}
