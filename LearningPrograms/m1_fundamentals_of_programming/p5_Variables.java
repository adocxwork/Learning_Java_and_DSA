class p5_Variables
{
    public static void main(String[] args)
    {
        // we need to define the datatype for variables only for the first time, as Java is statically typed...
        // Variables can hold single value at a time..

        // small case, capital case, numbers, underscore, dollar are allowed to name a variable
        // variables can't be a reserved word
        // whitespaced are not allowed in a variable name
        // Variable can't start with a number
        // we must give sensible name to variables so that, we can understand, "for what that particular variable is meant for?"
        // Variable's name are case sensitive.
        // We should follow cammelCase for variables.., it's cool..& Pascal Case for class name..
        
        // Identifiers are the names of variables, class, object, method, function, package, interface etc.
        // Above rules are also valid for other types of Identifiers.

        // single declaration (with value)
        int a;
        a = 7;
        int b = 7;
        System.out.println(b);
        System.out.println(a);

        //chain declaration with values (valid)
        int x=1,y=2,z=3;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //chain declaration
        int m1,m2,m3,m4;
        
        //chain single-value assignment
        m1=m2=m3=m4=7;
        System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);
    }
}