class p2_TypesOfVariables {
    int var=7;
    String name="adi";
    public static void main(String[] args) {
        // Primitive variable's datatype >> byte, short, int, long, float, double, boolean, char
        // Non Primitive variable's datatype >> String, Array etc.
        // Reference variable >> (Variable refering to object)

        // System.out.println(var); >> error >> static memory & instance's memory(heap) are different
        // System.out.println(obj1.var); >> right

        int num = 7; // primitive variable
        p2_TypesOfVariables obj1 = new p2_TypesOfVariables(); // obj >> reference variable
        p2_TypesOfVariables obj2 = new p2_TypesOfVariables(); // obj >> reference variable

        obj1.name = "Aditya Gupta";

        System.out.println(obj1.var);
        System.out.println(obj1.name);

        System.out.println(obj2.var);
        System.out.println(obj2.name);

        // no. of methods = no of stack memory
        // no. of heap memory = 1
        // stack will contain all kinds variables and its value/address
        // as soon as the method finishes, the stack memory gets deleted and, the connection b/w
        // reference variable and object gets over.., and the useless object is ready for garbage collection.

        int num2; // local variable doesn't have the default value

        // Scope based varibles :-
        // 1. Instance variable >> belongs to instance only and last as long as the object stays for..
        // 2. Static variable
        // 3. Local variable >> local to a particular method

        // Instance = Object
    }    
}
