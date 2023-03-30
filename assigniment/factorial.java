package assigniment;

import java.util.Scanner;

public class factorial {

   void  factorial()
    {
        Scanner sc=new Scanner(System.in);
        int num,sum=1;
        num= sc.nextInt();
        while ( num > 1)
        {
            sum = sum*num;
            num=num-1;

        }
       // return sum;
        System.out.println(sum + " is the factorial of the " +num );
    }
    public static void main(String[]aes) {
        factorial p = new factorial();
        System.out.println("enter the number ");
        p.factorial();

    }
}

