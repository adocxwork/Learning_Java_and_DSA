class p19_PatternProgramming7 {
    public static void main(String[] args) {
        int n=11;
        for(int j=0; j<n; j++)
        {
            for(int i=0; i<n; i++)
            {
                if(j==0 || j==(n-1)/2 || i==0)
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
