class p23_PatternProgramming11 {
    public static void main(String[] args) {
        int n=17;
        for(int j=0; j<n; j++)
        {
            for(int i=0; i<n; i++)
            {
                if(i==0 || j==0 || i==(n-1) || j==(n-1) || //Square boundary
                i==j || i+j==(n-1) || //Diagonals
                i+j==(n-1)/2 || //P1
                j-i==(n-1)/2 || //P2
                i-j==(n-1)/2 || //P3
                i+j==(n-1)+((n-1)/2)) //P4
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("       ");
            for(int i=0; i<n; i++)
            {
                if(i==0 || j==0 || i==(n-1) || j==(n-1) || //Square boundary
                i+j==(n-1)/2 || //P1
                j-i==(n-1)/2 || //P2
                i-j==(n-1)/2 || //P3
                i+j==(n-1)+((n-1)/2)) //P4
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
