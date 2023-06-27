class p14_PatternProgramming2 {
    public static void main(String[] args) {
        int n=7;
        for(int j=0; j<n; j++)
        {
            for(int i=0; i<n; i++)
            {
                if(i==0 || i==(n-1) || j==0 || j==(n-1))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
