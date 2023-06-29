class Calculation
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
public class p8_AnonymousArray {
    public static void main(String[] args) {

        Calculation obj = new Calculation();
        // int n2[] = {5,6,7,8};
        int result = obj.add(new int[]{5,6,7,8}); //anonymous array >> only one time use
        System.out.println(result);

    }
}