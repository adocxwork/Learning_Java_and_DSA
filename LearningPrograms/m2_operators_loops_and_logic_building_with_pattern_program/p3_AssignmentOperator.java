class p3_AssignmentOperator
{
    public static void main(String[] args)
    {
        // Chain declaration & value assignment
        int m1,m2,m3;
        m1=m2=m3=7;
        System.out.println(m1+" "+m2+" "+m3); //concatenation

        // Compound Assignment
        int a = 10;
        a += 5; // a = a + 5;
        System.out.println(a);

        int b = 10;
        b -= 5; // b = b - 5;
        System.out.println(b);

        int c = 10;
        c /= 5; // c = c / 5;
        System.out.println(c);

        int d = 10;
        d *= 5; // d = d * 5;
        System.out.println(d);

        int e = 10;
        e %= 3; // e = e % 3;
        System.out.println(e);
    }
}