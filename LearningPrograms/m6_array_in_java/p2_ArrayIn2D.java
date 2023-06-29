public class p2_ArrayIn2D {
    public static void main(String[] args) {

        int num[][] = {
            {2,3},
            {4,5},
            {7,8}
        };
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        int num2[][] = new int[3][2];
        num2[0][0] = 2;
        num2[0][1] = 3;
        num2[1][0] = 4;
        num2[1][1] = 5;
        num2[2][0] = 7;
        num2[2][1] = 8;
        for(int a=0; a<3; a++)
        {
            for(int b=0; b<2; b++)
            {
                System.out.print(num2[a][b] + " ");
            }
            System.out.println();
        }

    }
}
