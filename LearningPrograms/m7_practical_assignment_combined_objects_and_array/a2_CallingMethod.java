// WAP to create an object of an class which contain a method and call that class method in main method.
class Demo
{
    public void view()
    {
        System.out.println("Method Called...");
    }
}

class a2_CallingMethod {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.view(); //method called..

    }
}