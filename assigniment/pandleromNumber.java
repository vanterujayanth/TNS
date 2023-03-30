package assigniment;

import java.util.Scanner;

public class pandleromNumber
{
      void check() {
        Scanner sc=new Scanner(System.in);
        int a, sum = 0, rem = 0;
        a= sc.nextInt();
        int num=a;
        while ( a > 0)
        {
            rem = a % 10;
            sum = sum * 10 + rem;
            a = a / 10;
        }

        if (num == sum)
            System.out.println(num + " num is palindrome");
        else
            System.out.println( num + " num is not palindrome");

    }
    public static void main(String[]aes)
    {
        pandleromNumber p=new pandleromNumber();
        System.out.println("enter the number ");
        p.check();
    }
}
