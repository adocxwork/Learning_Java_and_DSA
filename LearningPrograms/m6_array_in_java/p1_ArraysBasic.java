public class p1_ArraysBasic {
    public static void main(String[] args) {

        int nums[] = {9,0,7,8};
        for(int i=0; i<4; i++)
        {
            System.out.println(nums[i]);
        }
        System.out.println(); //for spacing(clear output)

        // System.out.println(nums[2]); >> for printing the 2nd index element of nums array

        int nums2[] = new int[3]; //for array whose value is not known at the moment
        // size = 3, type = int,
        // 'new' keyword is used to create memory for array in heap
        // Array memory is created in heap and, array's address is stored in stack memory(refering to variable name)

        nums2[0] = 0;
        nums2[1] = 9; //assigning values for array nums2
        nums2[2] = 8;
        for(int j=0; j<3; j++)
        {
            System.out.println(nums2[j]);
        }
        System.out.println();

        // String names[] = {"adi", "Adi", "ADI"}; //This is also right
        String names[] = new String[3];
        names[0] = "adi";
        names[1] = "Adi";
        names[2] = "ADI";
        for(int k=0; k<3; k++)
        {
            System.out.println(names[k]);
        }

    }
}