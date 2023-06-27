class p6_DataTypes
{
    public static void main(String[] args)
    {
        // Data Types :-

        // 1. Non decimal numbers data types :-
        // *byte - short - int - long*
        
        // Formula for range of numbers that a datatype can support :-
        // n >> Number of Bits
        // -2^(n-1) to 2^(n-1)-1

        // byte - 1 bytes
        // byte a = 100; >> right
        // byte a = 130; >> wrong, it's out of range..!
        
        // short - 2 bytes
        // int - 4 bytes >> Java prefers int data type for non decimal numbers. | uses base 2 format
        // long - 8 bytes

        // long a = 45l; >> we need to give "l"/"L" suffix because Java assumes every number as int.
        
        // byte x = 10;
        // byte y = 5;
        // byte z = x+y; >> wrong, expression results are always in int data type as java prefers int..
        // int z = x+y; >> right
        // long z = x+y; >> right
        // (tm int ko byte mai store kar rahe ho)
        // you can't store a value of bigger data type(int) into a variable of smaller data type(byte)

        // 2. Decimal numbers data types :-
        // *float - double* | uses IEEE single/double precision format | memory understands 0,1 only.
        
        // By default, java prefers double datatype therefore,
        // float a = 45.3; >> wrong >> tm double(8 byte) ko float(4 byte) mai store kr rhe ho..
        // float a = 45.3f; >> right >> we need to give "f" suffix at the end of decimal literal.
        // float - 4 bytes
        
        // double - 8 bytes
        // double a = 45.3; >> right
        // Higher accuracy after decimal point
        // Java prefers Double, Int.

        // 3. Boolean data type (this datatype uses build-in classes) :-
        // boolean data = true;
        // boolean data = false;
        // It only stores either true or false.

        // 4. Char data type :-
        // Char - 2 Bytes
        // char data = 'x'; >> right >> it stores single alphabet b/w single quotes.
        // Java follows UTF format

        byte a1 = 10;
        short a2 = 20;
        int a3 = 30; //java's fav.
        long a4 = 40l;
        float a5 = 45.22f;
        double a6 = 44.44; //java's fav.
        boolean a7 = true;
        boolean a8 = false;
        char a9 = 'x';
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a8);
        System.out.println(a9);
    }
}