class p3_MainMethod //file name should be the same as class name(containing main method)
// file name tells the JVM, "where is the main method..?"
{
    public static void main(String[] args) // main method is the starting point of a program to begin with..
    // static public void main(String[] args)
    // static public void main(String args[])
    // public static void main(String... args)
    {
        // main >> name of method, it can't be changed (rest of method's name can be given as per the user's choice)
        // main method is the start point of a program

        // void >> return type of method

        // static >> this keyword is used so that, main method
        // can be called without creating the object of it's class

        // public >> it's a access specifier which makes the visibility of main method outside the class..

        // String[] args >> it's an array, which is compulsory to give as it comes under
        // the basic syntax of main method. it's given so that if the program is called from
        // command line, and if the user gives additional data then, this array stores the user's inputs..
        System.out.println("Hello all...");
        // System.out.println(args[0]); //this will print the user input given from the command line
        // System.out.println(args[1]); //this will print the user input given from the command line
    }
}
// How to execute program from command line?
// get into the right path from command line
// javac .\p3_MainMethod.java (press tab for autocomplete)
// java p3_MainMethod hi there
// hi there >> these are the user's inputs from command line.., this will be stored in Strings[] args.

// Method | Function :-
// int add(x)
// {
//      System.out.println("The sum is...");
//      return 10;
// }
// 
// 1. name - add
// 2. parameter - x
// 3. body
// 4. return type - int