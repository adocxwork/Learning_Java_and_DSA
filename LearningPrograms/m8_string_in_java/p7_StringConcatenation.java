class p7_StringConcatenation {
    public static void main(String[] args) {
        
        String s1 = "aditya";

        String s2 = s1.concat(" gupta"); //s2 >> outside of SCP >> reference variable + inbuild method

        String s3 = new String("aditya");
        s3 = s3.concat(" gupta");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // s1 >> SCP
        // s2 >> outside SCP as, it uses the reference variable and inbuild method
        // s3 will be outside SCP >> it will be assigned to new object

        // every string object outside the SCP will have a copy inside the SCP
    }
}