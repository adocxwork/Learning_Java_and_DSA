class View
{
    // public void show(byte n)
    // {
        //     System.out.println("byte : " + n);
        // }
    public void show(short n)
    {
        System.out.println("short : " + n);
    }
    public void show(int n)
    {
        System.out.println("int : " + n);
    }
    public void show(long n)
    {
        System.out.println("long : " + n);
    }
    // public void show(char n)
    // {
    //     System.out.println("char : " + n);
    // }
    public void show(float n)
    {
        System.out.println("float : " + n);
    }
    public void show(double n)
    {
        System.out.println("double : " + n);
    }
}


public class p5_AutomaticTypePromotion {
    public static void main(String[] args) {
        View obj = new View();

        // obj.show(7); //number's default data type : int

        byte a = 3;
        obj.show(a);
        
        char a2 = 'A';
        obj.show(a2);
        
    }
}

// Automatic Type promotion
// byte >> short >> int >> long >> float >> double
// char >> int >> long >> float >> double