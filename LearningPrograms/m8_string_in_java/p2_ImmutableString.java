class p2_ImmutableString {
    public static void main(String[] args) {
        
        // Heap Memory >> String Constant Pool (SCP)

        // Inside the heap, there lies the region of SCP where String literals
        // are stored which are created without "new" keyword

        // SCP doesn't allows the duplicate literals
        // Heap area(outside the SCP) allows duplicate literals

        // Garbage collector can't delete anything inside SCP

        String a1 = "adi"; //a1,a2 has it's literal inside the SCP & refer to the same object/address
        String a2 = "adi"; //a2 refers to the same address as a1 for literal inside the SCP

        String a3 = new String("Aditya"); //a3,a4 has its literal outside the SCP & inside the heap
        String a4 = new String("Aditya"); //a3 & a4 refers to two different object/address

        System.out.println(a1==a2); //true
        // a1 & a2 refers to the same address/object which lies inside the SCP

        System.out.println(a3==a4); //false
        // a3 & a4 refers to different
    }
}