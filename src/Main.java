import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Choose you're language! / Виберіть Вашу мову!");
        System.out.println("1 - Українська");
        System.out.println("2 - English");
        System.out.println("---------------------------------------------");

        byte lang = in.nextByte();

        if (lang == 1) {
            Ukraine ukr = new Ukraine();
            System.out.println("---------------------------------------------");
            System.out.println("Введіть ваше число: ");
            System.out.println("Ваше число: " + ukr.inwords(in.nextFloat()));
            System.out.println("---------------------------------------------");

        } else if (lang == 2) {
            English eng = new English();
            System.out.println("---------------------------------------------");
            System.out.println("Enter you're number: ");
            in.useLocale(Locale.ENGLISH);
            System.out.println("You're number: " + eng.inwords(in.nextFloat()));
            System.out.println("---------------------------------------------");

        } else {
            System.out.println("---------------------------------------------");
            System.out.println("Please choose you're language in range from 1 to 2");
            System.out.println("---------------------------------------------");
            System.out.println("Будь-ласка, виберіть Вашу мову в діапазоні від 1 до 2");
            System.out.println("---------------------------------------------");
        }
    }

}
