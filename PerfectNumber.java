import java.util.Scanner;

public class PerfectNumber
{
    int Num;
    public static void main(String[] args)
    {

        PerfectNumber p=new PerfectNumber();
                p.Perfect();

    }
        void Perfect()
        {
            int sum=0;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Number:-");
            Num = s.nextInt();
            for (int i = 1; i <= Num / 2; i++) {
                if (Num % i == 0) {
                    sum = sum + i;
                } else {
                }
            }
            if (sum == Num) {
                System.out.println("This is perfect number");
            } else {
                System.out.println("This is not perfect number");

            }
        }

}
