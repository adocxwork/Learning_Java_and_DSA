public class p4_EnhancedArray {
    public static void main(String[] args) {

        // For 1D Array
        int a[] = {5,6,7,8,9};

        for(int n : a) //Enhanced For Loop
        {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();

        // For 2D Array
        int b[][] = {
            {2,3,4},
            {5,6,7,8},
            {0,9}
        };

        for(int n2[] : b) //Enhanced For Loop
        {
            for(int n3 : n2)
            {
                System.out.print(n3 + " ");
            }
            System.out.println();
        }

    }
}