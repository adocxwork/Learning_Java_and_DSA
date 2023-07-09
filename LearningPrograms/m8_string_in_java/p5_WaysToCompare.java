class p5_WaysToCompare {
    public static void main(String[] args) {
        String a1 = "adi";
        String a2 = new String("Adi");
        String a3 = "ADI";

        // System.out.println(a1==a2);
        // System.out.println(a1.equals(a2));

        System.out.println(a1.equalsIgnoreCase(a2)); //true
        //this method compares only the value ignoring the cases..
        
        System.out.println(a2.equals(a3)); //false
        System.out.println(a2.equalsIgnoreCase(a3)); //true
    }
}