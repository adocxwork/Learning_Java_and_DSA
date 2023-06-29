public class p3_JaggedArrayIn2D {
    public static void main(String[] args) {

        int num[][] = {
            {5,6,7,8},
            {1,3},
            {9,0,2}
        };

        for(int i=0; i<num.length; i++)
        {
            for(int j=0; j<num[i].length; j++) //.length property returns the length of an array
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        int num2[][] = new int[3][];
        num2[0] = new int[4];
        num2[1] = new int[2];
        num2[2] = new int[3];

        num2[0][0] = 5; 
        num2[0][1] = 6; 
        num2[0][2] = 7; 
        num2[0][3] = 8; 
        num2[1][0] = 1; 
        num2[1][1] = 3; 
        num2[2][0] = 9; 
        num2[2][1] = 0; 
        num2[2][2] = 2;

        for(int a=0; a<num2.length; a++)
        {
            for(int b=0; b<num2[a].length; b++)
            {
                System.out.print(num[a][b] + " ");
            }
            System.out.println();
        }
        
    }
}