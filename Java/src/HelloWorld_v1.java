public class HelloWorld_v1 {
    // working with variables
    // varaibles are case sentive
    static String name = "usman";
    static final double CONSTANTINUPPERCASE = 3.14;

    public static void main(String[] args)
    {
        System.out.println(name);
        System.out.println(CONSTANTINUPPERCASE);

        int a = 0;
        // byte
        // short
        // int
        // long a = 9340000030300303030l
        // double
        // float = 90.3777f

        System.out.println(Long.MAX_VALUE);

        //CONVERSION TO STRING
        String inttostring = Integer.toString(9);

        // type casting
//        int double to int = (int) double

//        parse functions for conversion
        int stringtoint = Integer.parseInt("34");
        System.out.println(stringtoint);
    }
}