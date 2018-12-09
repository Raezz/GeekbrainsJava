import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int end = 1;
        while (end != 0 ) {
            int numb = rnd.nextInt(9);
            getanswer(numb);
            end = more();
        }
    }

    private static void getanswer(int numb) {
        Scanner in = new Scanner(System.in);
        int p = 3;
        while (p != 0) {
            System.out.printf("У вас %d попыток. \n", p);
            System.out.println("Введите число: ");
            int a = in.nextInt();
            if (a == numb) {
                System.out.println("Вы выиграли");
                return;
            }
            else {
                System.out.println("Неверно");
                if (a < numb)     System.out.println("Загаданное число больше введенного.");
                else    System.out.println("Загаданное число меньше введенного.");
                p--;
            }
        }
        System.out.printf("Загаданное число %d \n", numb);
        return;
    }

    private static int more() {
        Scanner in = new Scanner(System.in);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int a = in.nextInt();
        if (a != 0 && a != 1) {
            more();
        }
        return a;
    }
}
