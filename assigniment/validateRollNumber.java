package assigniment;

import java.util.Scanner;

public class validateRollNumber
{
    public static void main(String are[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        String str= sc.nextLine();
        if(str.length()==12)
        System.out.println(str.matches("[0-9]*"));
    }

}
