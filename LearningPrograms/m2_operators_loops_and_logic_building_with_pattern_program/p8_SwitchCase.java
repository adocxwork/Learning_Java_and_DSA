class p8_SwitchCase
{
    public static void main(String[] args)
    {
        int num = 2;
        switch(num)
        {
            default: System.out.println("No Cases found...");
            System.out.println("Ye default wala hai.., multiple statements support karta hai..");
            break;
            //its optional to give default case, it gets executed when no cases are matched..

            case 1: System.out.println("Case No. : 1");
            break;
            //its important to give break statement at the end of every case else, onced the case gets matched,
            //that case is executed but, cases below the matched case also gets executed(without break)..

            case 2: System.out.println("Case No. : 2");
            break; //it can also execute multiple statements

            case 3: System.out.println("Case No. : 3");
            break;

            case 4: System.out.println("Case No. : 4");
            break;
        }
    }
}