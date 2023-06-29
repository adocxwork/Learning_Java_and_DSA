public class p5_LenghtPropertyVsLenghtMethod {
    public static void main(String[] args) {
        int n1[] = {7,8,9,0};
        System.out.println(n1.length); //4

        int n2[][] = {
            {2,3},
            {1,7,9},
            {0,4,5,6,8}
        };
        System.out.println(n2.length); //3
        System.out.println(n2[2].length); //5

        String name = "Gupta";
        System.out.println(name.length()); //5


        // lenght >> for array >> its a property
        // lenght() >> for string >> its a method
    }
}