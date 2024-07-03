import java.util.Scanner;

public class UserInputs_v2 {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Input something: ");
        if (userinput.hasNextInt())
        {
            int entered = userinput.nextInt();
            System.out.println(entered);

            entered += 2;

            entered--;
            entered++;

            int abs = Math.abs(entered);
            int bigger = Math.max(45, 45);

            System.out.println(bigger);

            System.out.println(Math.random() * 10);

        }
        else{
            System.out.println("please enter integer");
        }
    }
}
