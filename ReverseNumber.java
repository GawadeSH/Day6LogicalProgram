import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        int num, mod, reversed=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number:-");
        num = s.nextInt();
        for(;num!=0;num=num/10)
        {
            mod=num%10;
            reversed=reversed*10+mod;

        }
        System.out.println(reversed);

    }
}