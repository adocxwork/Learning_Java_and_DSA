class p6_ConditionalStatement
{
    public static void main(String[] args)
    {
        int age = 100;
        
        if(age>=0 && age<100)
        {
            System.out.println("Valid age");
            if(age>=0 && age<16)
            {
                System.out.println("Kid");
            }
            else if(age>=16 && age<18)
            {
                System.out.println("Teenager");
            }
            else if(age>=18 && age<60)
            {
                System.out.println("Legal Adult");
            }
            else if(age>=60)
            {
                System.out.println("Old Man");
            }
            else
            {
                System.out.println("Error");
            }
        }
        else
        {
            System.out.println("Invalid age");
        }
        // Conditional operators >> Logical || + Logical && + Ternary operator
    }
}