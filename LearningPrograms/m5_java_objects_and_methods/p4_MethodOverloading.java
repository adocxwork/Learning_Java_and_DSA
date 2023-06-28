class Calc
{
    public int add(int n1, int n2)
    {
        int res = n1+n2;
        return res;
    }

    public int add(int n1, int n2, int n3)
    {
        int res = n1+n2+n3;
        return res;
    }

    public double add(double n1, double n2)
    {
        double res = n1+n2;
        return res;
    }
}

public class p4_MethodOverloading {
    public static void main(String[] args) {
        Calc obj = new Calc();

        int r1 = obj.add(4,5);
        System.out.println(r1);

        int r2 = obj.add(4,5,2);
        System.out.println(r2);

        double r3 = obj.add(7.7, 8.9);
        System.out.println(r3);

        // In Method overloading, we create multiple methods with same name but,
        // with different no of parameters OR different data types.
        // So that, while calling the function, if no. of parameters OR data type differs..,
        // then we can execute anyone method as per our need.

        // In method overloading, only that method is called, whose no. of parameters and,
        // data types matches with the given arguments.
    }
}