class p20_PatternProgramming8 {
    public static void main(String[] args) {
        int n=11;
        for(int j=0; j<n; j++)
        {
            for(int i=0; i<n; i++)
            {
                if(j==0 && i>0 && i<(n-1)/2 || i==0 && j>0 || i==(n-1)/2 && j>0 || j==(n-1)/2 && i<=(n-1)/2)
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
