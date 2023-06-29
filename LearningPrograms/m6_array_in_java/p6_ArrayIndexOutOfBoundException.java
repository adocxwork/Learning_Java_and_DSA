public class p6_ArrayIndexOutOfBoundException {
    public static void main(String[] args) {

        int n[] = {4,5,6,7,8,9,3};
        System.out.println(n[n.length-1]);
        //write "n.length-1" for having the last index value of an array(avoid confusion)

        for(int i=0; i<n.length; i++) // use i<n.length (avoid confusion)
        {
            System.out.print(n[i] + " ");
        }
        System.out.println();

        for(int j : n) //use enhanced for loop (avoid confusion)
        {
            System.out.print(j + " ");
        }
        

    }
}