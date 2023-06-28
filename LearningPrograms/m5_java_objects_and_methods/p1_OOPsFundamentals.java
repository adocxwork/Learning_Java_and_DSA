class p1_OOPsFundamentals //its not compulsory to have the same name for file and class
{
    int a;
    String name;
    public static void main(String[] args)
    {
        p1_OOPsFundamentals obj = new p1_OOPsFundamentals(); //object created using "new" keyword
        // obj >> reference variable
        // new p1_OOPsFundamentals() >> Object
        // Object address is stored into the reference variable
        // "new" keyword is used to create an object

        System.out.println(obj.a); //default value for int = 0
        System.out.println(obj.name); //default value for String = "null"
        
        // deletion of useless object is the responsibility of garbage collector.
        // JRE >> Java Runtime Environment
        // JVM >> Java Virtual Machine



        // Memory >> Content
        // Method Area >> Byte code(.class file)
        // Stack Area >> obj
        // Heap Area >> new p1_OOPsFundamentals() >> int a; String name;

        // In Heap Area, object will be there and object will have it's address too..
    }
}