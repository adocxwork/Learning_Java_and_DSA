class p2_ImmutableString {
    public static void main(String[] args) {
        
        // Heap Memory >> String Constant Pool (SCP)

        // Inside the heap, there lies the region of SCP where String literals
        // are stored which are created without "new" keyword

        // SCP doesn't allows the duplicate literals
        // Heap area(outside the SCP) allows duplicate literals

        // Literals created in Heap area(outside SCP), their copies are kept inside the SCP
        // the extra copies aren't refered by anything still, it's not ready for Garbage collection

        // Garbage collector can't delete anything inside SCP

        String a1 = "adi"; //a1,a2 has it's literal inside the SCP & refer to the same object/address
        String a2 = "adi"; //a2 refers to the same address as a1 for literal inside the SCP

        // Constructor approch of creating string objects
        String a3 = new String("Aditya"); //a3,a4 has its literal outside the SCP & inside the heap
        String a4 = new String("Aditya"); //a3 & a4 refers to two different object/address

        char ch[] = {'a','d','i'};
        String a5 = new String(ch); //We can also give an array as an argument
        System.out.println(a5); //ch="adi"

        System.out.println(a1==a2); //true
        // a1 & a2 refers to the same address/object which lies inside the SCP

        System.out.println(a3==a4); //false
        // a3 & a4 refers to different object/address
    }
}