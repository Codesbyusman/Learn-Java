import java.util.*;

public class ExceptionHandling_v6 {

    static Scanner input = new Scanner(System.in);
    static public void main (String[] args)
    {
        dbyz(3);

        try{
            input.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
        catch(Exception we)
        {
            System.out.println(we);
        }
        finally {
            System.out.println("llll");
        }

     }

     public static void dbyz(int a){
        try{
            System.out.println(a/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.toString());
        }
     }

}
