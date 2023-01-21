import java.util.Scanner;

public class PrimeNumber
{
    int Num,Count=0;
    public static void main(String[] args)
    {
        PrimeNumber p=new PrimeNumber();
        p.Prime();

    }
    void Prime()
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number:-");
        Num = s.nextInt();
        for (int i = 1; i <= Num; i++) {
            if (Num % i == 0)
            {

               Count=Count+1;

            }
        }
        if (Count == 2) {
            System.out.println("This is prime number");
        }
        else {
            System.out.println("This is not prime number");
        }
        }


        }



