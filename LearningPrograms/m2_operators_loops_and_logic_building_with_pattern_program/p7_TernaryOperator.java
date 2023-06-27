class p7_TernaryOperator
{
    public static void main(String[] args)
    {
        int a=10, b=20, c=30;

        int res1 = (a<c)? a:c ; //this will return a, as its the smallest one..
        System.out.println(res1);

        int res2 = (a<b)? ((a<c)? a:c) : ((b<c)? b:c ); //Nested ternary operator in use..
        System.out.println(res2);
        // Same thing can be done through if-else statements., bt it's lenghty..

        String res3 = (a>c)? "Condition True" : "Condition False" ;
        System.out.println(res3);
    }
}