class Calculations
{
    public int add(int n[])
    {
        int res = 0;
        for(int i : n)
        {
            res = res + i;
        }
        return res;
    }
}

public class p8_AnonymousArray
{
    public static void main(String[] args)
    {
        
        Calculations obj = new Calculations();
        // int n2[] = {8,8,9}; //Array for addition >> needs documentations...

        int result = obj.add(new int[]{8,8,9}); //anonymous array >> only one time use >> no documentations for variables
        System.out.println(result);

    }
}