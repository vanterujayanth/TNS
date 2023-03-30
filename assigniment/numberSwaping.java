package assigniment;

import java.util.Scanner;

public class numberSwaping {
    public void swap()
    {
        int a, b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("befreing swapig :" + a + "and" + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping :"+a + "and " +b);
    }
    public static void main(String[]ard)
    {
      numberSwaping s=new numberSwaping();
        System.out.println("enter the  numbers");
      s.swap();


    }
}