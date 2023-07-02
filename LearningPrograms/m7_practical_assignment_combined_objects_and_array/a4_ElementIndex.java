// WAP to find the index of a specific element in an integer array
import java.util.Scanner;
class a4_ElementIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to find it's Index value :-");
        int ele = sc.nextInt();

        int n[] = {8,0,9,6,7,4,5,3};

        for(int i=0; i<n.length; i++)
        {
            if(n[i] == ele)
            {
                System.out.println("The Index value is : " + i);
                break;
            }
        }
        
        sc.close();
    }
}