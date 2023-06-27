class p7_Typecasting
{
    public static void main(String[] args)
    {
        // Implicit Typecasting >> Small to Big
        int a = 10;
        double b;
        b=a;
        System.out.println(b);

        // Explicit Typecasting >> Big to Small
        double x = 25.4;
        int y;
        // y = x; >> error, you can't store a value of bigger datatype into a variable of smaller datatype.
        y = (int)x; //explicit typecasting >> .4 will be truncated
        System.out.println(y);

        // Truncation
        int n1 = 12;
        int n2 = 5;
        // float n3 = n1/n2; //.4 will be truncated, int-int will result in int
        // float n3 = (float)(n1/n2); //operations b/w int will result in int(value - 2 >> 2.0)
        float n3 = (float)n1/(float)n2; //float-float will result in float >> No truncation
        // operations b/w byte-byte & short-short will result in int
        // operations b/w int-int will result in int
        // operations b/w long-long will result in long
        // operations b/w float-float will result in float
        // operations b/w double-double will result in double

        System.out.println(n3);
    }
}