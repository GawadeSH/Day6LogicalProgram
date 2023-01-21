public class FibonacciSeries
{
    static int num1 = 0, num2 = 1, num3;
    public static void main(String[] args)
    {

        FibonacciSeries.Fibonacci();
    }

    static void Fibonacci() {
        System.out.print(num1 + "  " + num2);

        for (int i = 1; i < 10; i++) {
            num3 = num1 + num2;
            System.out.print(" "+num3+" ");
            num1 = num2;
            num2 = num3;

        }

    }
}

