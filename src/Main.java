import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int numToExamine = 2;
// program will then determine that since 2 mod 2 is 0 that numToExamine is Even.
        System.out.print("Enter a number: ");
        Scanner reader = new Scanner(System.in);

        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
