// WAP to calculate the sum of all elements in an integer array
class Calc
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

class a3_SumOfIntArray {
    public static void main(String[] args) {
        Calc obj = new Calc();

        // int num[] = {7,8,3,4}; >> Requires documentation
        // int result = obj.add(num);
        
        int result = obj.add(new int[]{7,8,3,4}); //Anonymous array >> No documentations for variables
        System.out.println(result); //Sum of all the elements of Integer array gets printed
    }
}