package assigniment;

import java.util.Scanner;

public class primeNumber
{
    void prime()
    {
        int num,flag=0;

        Scanner sc=new Scanner(System.in);
        num= sc.nextInt();        // getting the number to check
        if(num==0||num==1)
            System.out.println(num +" number is not prime");
        else {
                 for(int i=2;i<=num/2;i++)
                 {
                    if (num % i == 0)
                    {
                        System.out.println(num + " is not a prime number");
                        flag = 1;
                        break;
                   }
                }
                   if(flag==0)
                       System.out.println(num + " is prime number");


            }

        }
        public static void main(String[]are)
        {
           primeNumber s=new primeNumber();
            System.out.println("enter the number to check");
           s.prime();
        }
    }

