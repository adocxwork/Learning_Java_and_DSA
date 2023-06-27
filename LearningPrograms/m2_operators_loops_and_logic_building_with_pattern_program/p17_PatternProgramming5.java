class p17_PatternProgramming5 {
    public static void main(String[] args) {
        int n=11;
        for(int j=0; j<n; j++)
        {
            for(int i=0; i<n; i++)
            {
                if(j==0 || j==(n-1) || i==(n-1)/2)
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
