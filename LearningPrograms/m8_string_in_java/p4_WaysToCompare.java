class p4_WaysToCompare {
    public static void main(String[] args) {

        String a1 = "adi";
        String a2 = new String("adi");

        System.out.println(a1==a2); //false
        System.out.println(a1.equals(a2)); //true

        // == >> this compares the references
        // a3.equals(a4) >> this only compares the values
        // 7:50
    }
}