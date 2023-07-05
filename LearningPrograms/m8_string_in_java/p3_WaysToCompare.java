class p3_WaysToCompare {
    public static void main(String[] args) {
        
        // String a1 = "adi"; >> it will be stored in SCP
        // String a2 = "adi"; >> it will be stored in SCP
        // a1,a2 will refer to the same object/address

        // String a1 = new String("adi"); >> it will be stored in Heap memory outside the SCP
        // String a2 = new String("adi"); >> it will be stored in Heap memory outside the SCP
        // a1,a2 will refer to 2 different objects/addresses...

        String a1 = "adi";
        String a2 = "adi";
        System.out.println(a1==a2); //true
        System.out.println(a1.equals(a2)); //true
        
        String a3 = new String("aditya");
        String a4 = new String("aditya");
        System.out.println(a3==a4); //false
        System.out.println(a3.equals(a4)); //true

        // == >> this compares the references
        // a3.equals(a4) >> this only compares the values
    }
}