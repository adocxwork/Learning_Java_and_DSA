class p2_IncrementationDecrementation
{
    public static void main(String[] args)
    {
        // a++; >> return, update >> post incrementation
        // ++a; >> update, return >> pre incrementation
        // a--; >> return, update >> post decrementation
        // --a; >> update, return >> pre decrementation

        int a = 5; //9
        int b = a++ + ++a + a++ + ++a; //28
        //       5     7     7     9
        System.out.println(a);
        System.out.println(b);

        int n1 = 7;
        int n2 = n1++;
        int n3 = ++n1;
        System.out.println(n2);
        System.out.println(n3);
    }
}