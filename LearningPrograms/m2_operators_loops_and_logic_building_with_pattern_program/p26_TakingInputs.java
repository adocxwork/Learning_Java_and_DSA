import java.util.Scanner; //import Scanner class
class p26_TakingInputs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Byte :-");
        byte v1 = sc.nextByte();
        System.out.println("Byte : " + v1);
        
        System.out.println("Short :-");
        Short v2 = sc.nextShort();
        System.out.println("Short : " + v2);
        
        System.out.println("Integer :-");
        int v3 = sc.nextInt();
        System.out.println("Integer : " + v3);
        
        System.out.println("Long :-");
        long v4 = sc.nextLong();
        System.out.println("Long : " + v4);

        System.out.println("Float :-");
        float v5 = sc.nextFloat();
        System.out.println("Float : " + v5);

        System.out.println("Double :-");
        double v6 = sc.nextDouble();
        System.out.println("Double : " + v6);

        // System.out.println("String (Single word) :-");
        // String v7 = sc.next();
        // System.out.println("String (Single word) : " + v7);

        // System.out.println("String :-");
        // String v8 = sc.nextLine();
        // System.out.println("Sting : " + v8);

        System.out.println("Boolean :-");
        boolean v9 = sc.nextBoolean();
        System.out.println("Boolean : " + v9);

        sc.close(); //closing of Scanner object
    }
}