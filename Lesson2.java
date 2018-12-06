
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {
        invert();
        fill();
        change();
        changeDiag();
        minMax();
    }

    public static void invert(){
        int[] a = {1,0, 0 ,1 ,0 , 1};
        System.out.println("Исходный массив" + Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1){
                a[i] = 0;
            }
            else a[i] = 1;
        }
        System.out.println("Измененный массив" + Arrays.toString(a));
    }

    public static void fill(){
        int[] a = new int[8];
        for (int i = 0; i < a.length; i++) {
            a[i] = i*3;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void change() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) a[i] *= 2;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void changeDiag(){
        int[][] a = new int[5][5];
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) a[i][j] = 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void minMax(){
        Random rnd = new Random();
        int[] a = new int [10];
        int max, min;
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(100);
        }
        max = a[0];
        min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) min = a[i];
            if (a[i] > max) max = a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("минимум " + min + " максимум " + max);
    }
}
