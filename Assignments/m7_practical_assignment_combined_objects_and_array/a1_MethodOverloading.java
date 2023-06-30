// WAP to demonstrate method overloading with 3 different parameters.
class Calculation
{
    public void add(byte n1, short n2, int n3)
    {
        System.out.println("byte,short,int");
    }
    public void add(byte n1, int n3, short n2)
    {
        System.out.println("byte,int,short");
    }
    public void add(short n1, byte n2, int n3)
    {
        System.out.println("short,byte,int");
    }
    public void add(short n1, int n3, byte n2)
    {
        System.out.println("short,int,byte");
    }
    public void add(int n1, byte n2, short n3)
    {
        System.out.println("int,byte,short");
    }
    public void add(int n1, short n3, byte n2)
    {
        System.out.println("int,short,byte");
    }
}

class a1_MethodOverloading
{
    public static void main(String[] args)
    {
        Calculation obj = new Calculation(); //object created..

        byte m1 = 2;
        short m2 = 7;
        int m3 = 1;

        // methods being called
        obj.add(m1,m2,m3);
        obj.add(m1,m3,m2);
        obj.add(m2,m1,m3);
        obj.add(m2,m3,m1);
        obj.add(m3,m1,m2);
        obj.add(m3,m2,m1);
        // Outputs(orders) :-
        // byte,short,int
        // byte,int,short
        // short,byte,int
        // short,int,byte
        // int,byte,short
        // int,short,byte

        // This is the example of method overloading, in this program, the methods of Calculation class gets
        // executed only if the order & datatype of given arguments and received parameters matches and,
        // just to avoid confusion, I also printed the order of parameter for each method.

    }    
}