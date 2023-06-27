class p2_OOPsBasic_Student //class should be of collective noun type.., like student, people etc.
{
    // class blueprint, it contains default attributes & methods..
    String name; // default value : null
    int marks; // default value : 0
    void study()
    {
        System.out.println("Student is studying...");
    }
    public static void main(String[] args)
    {
        // creating object (A1)
        p2_OOPsBasic_Student A1 = new p2_OOPsBasic_Student();
        
        // Adding values for the object created..
        A1.name = "Aditya Gupta";
        A1.marks = 68;

        // Calling class method through the object..
        A1.study();

        // Printing the values assigned to the object..
        System.out.println("Name : " + A1.name);
        System.out.println("Marks : " + A1.marks);
    }
}