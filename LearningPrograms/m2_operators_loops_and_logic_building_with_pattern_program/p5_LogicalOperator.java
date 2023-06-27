class p5_LogicalOperator
{
    public static void main(String[] args)
    {
        int a=10,b=20,c=30;
        System.out.println(a<b && a<c && b<=c); // all 3 conditions are true therefore, it's true
        System.out.println(a<b && a>c && b<=c); // 1 condition is false therefore, it's false

        System.out.println(a>b || a<c || b>c); // 1 condition is true therefore, it's true
        System.out.println(a>b || a>c || b>c); // every condition is false therefore, it's false

        System.out.println(!false); //true
        System.out.println(!(a<b)); //false
    }
}