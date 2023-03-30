package assigniment;

import java.util.Scanner;

public class armstrongNumber {
    void armstrong()
    {
        Scanner sc=new Scanner(System.in);
        int num,num2,sum=0,rem;
        num= sc.nextInt();
        num2=num;
        while ( num > 0)
        {
            rem = num % 10;
            sum = sum * 10 + (rem* rem * rem);
            num = num / 10;
        }

        if (num2== sum)
            System.out.println(num2 + " num is a armstrong number ");
        else
            System.out.println( num2 + " num is not a armstrong number");

    }
    public static void main(String[]aes)
    {
       armstrongNumber p=new armstrongNumber();
        System.out.println("enter the number ");
        p.armstrong();
    }
}
