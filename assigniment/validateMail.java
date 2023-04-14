package assigniment;

import java.util.Scanner;

public class validateMail
{
    public static void main(String[]are)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the mailID for check :");
        String str=sc.nextLine();
        System.out.println(str.matches(".*[@gmail|@yahoo].*"));
            int i = str.indexOf("@");
            String username = str.substring(0, i);
            String domainname = str.substring(i++);
        System.out.println(username);
        System.out.println(domainname);
            System.out.println(domainname.startsWith("@gmail"));

    }
}
