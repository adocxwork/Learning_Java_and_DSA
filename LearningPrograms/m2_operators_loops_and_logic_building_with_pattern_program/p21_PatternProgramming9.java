class p21_PatternProgramming9 {
    public static void main(String[] args) {
        int n=11;
        for(int j=0; j<n; j++)
        {
            for(int i=0; i<n; i++)
            {
                if(i==0 || j==0 && i<(n-1)/2 || j==(n-1) && i<(n-1)/2 || i==(n-1)/2 && j>0 && j<(n-1))
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
