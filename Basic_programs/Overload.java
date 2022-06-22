public class Overload {
    //In function overloading the number of varaibles or types of variables should be diffrent.
    //It does not matter what is the return type of function, We cannot overload by return type.
    // We can have two ore more static methods with same name, but differences in input parameters.
    //Java doesn’t allow user-defined overloaded operators. Internally Java overloads operators, for example, + is overloaded for concatenation.

    // Overloading is about same function have different signatures. Overriding is about same function, same signature but different classes connected through inheritance.
    // Overloading is an example of compiler time polymorphism and overriding is an example of run time polymorphism.
    
    public static void main(String[] args) {
        Over1(12);

        Over1(4,2);

        Over1(" YASH ");
    }

    static void Over1(int a)
    {
        System.out.println("Here function having  one argumnet with value " + a + " is being called." );
    }

    static void Over1(int a, int b)
    {
        System.out.println("Here function having two argumnet is being  called " + a + " and " + b + " having sum " + a+b);
    }

    static void Over1(String s)
    {
        System.out.println("Here function having one argumnet and that is "  + s + " but diffrent argument type is  being called.");
    }
}
