class p6_StringConcatenation {
    public static void main(String[] args) {
        
        String a1 = "Aditya";

        // a1.concat(" Gupta");
        // Creates another object, we need to change the reference address of a1
        // String is immutable..

        System.out.println(a1);
        a1 = a1.concat(" Gupta"); //we need to assign a new object to a1 in order to have a new value, String is immutable..
        System.out.println(a1);

        // we are not changing the value of a1, as String is immutable..
        // we are assigning a complete new value/object to a1

    }
}