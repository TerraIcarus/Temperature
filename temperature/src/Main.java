import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите температуру за 5 дней");
        int temperature[] = new int[6];
        int day = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Введите температуру в " +i+ " день");
            temperature[i]=in.nextInt();
            day=day+temperature[i];
        }
        day=day/5;
        System.out.println("Вывод " +day);

        if (day <8)
        {
            System.out.println("Отопление скоро включат \uD83D\uDE0A \uD83D\uDE0A \uD83E\uDD73");
        }
        else
        {
            System.out.println("Отопление включат не скоро \uD83D\uDE31 \uD83D\uDE31 \uD83E\uDD76");
        }
    }
}