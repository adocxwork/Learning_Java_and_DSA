class p1_StringTypes {
    public static void main(String[] args) {
        
        // Immutable String
        String a1 = "adi";
        System.out.println(a1);
        a1.concat("Aditya"); //new object is created, it's immutable
        System.out.println(a1);
        
        System.out.println();
        
        // Mutable String
        StringBuilder a2 = new StringBuilder("Aditya");
        System.out.println(a2);
        a2.append(" Gupta"); //it's mutable
        System.out.println(a2);
        
    }
}