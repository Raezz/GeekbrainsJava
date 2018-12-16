public class Lesson1 {
    public static void main(String[] args) {
        int a = 5;
        long b = 1000000000000L;
        short c = 32000;
        byte d = 127;
        float f = 1.3252365f;
        double g = 1.34634543653;
        boolean l = true;
        char ch = 'l';
        System.out.println(calc(1,2,3,4));
        System.out.println(sum10to20(5,6));
        posorneg(3);
        System.out.println(ifneg(-5));
        greetings("Георгий");
        LeapYear(100);
    }

    public static int calc(int a, int b, int c, int d){
        return a*(b+(c/d));
    }

    public static boolean sum10to20 (int x, int y){
        if (x + y >= 10 && x + y <= 20 ){
            return true;
        }
        else return false;
    }

    public static void posorneg(int x){
        if (x >= 0) System.out.println("Положительное число");
        else System.out.println("Отрицательное число");
    }

    public static boolean ifneg(int x){
        if (x < 0)
            return true;
        return false;
    }

    public static void greetings (String name){
        System.out.println("Привет, " + name + "!");
        //альтернативный способ System.out.printf("Привет, %s!" , name);
    }

    public static void LeapYear (int year){
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) System.out.printf("Год %d високосный.", year);
        else System.out.printf("Год %d не високосный", year);
    }
}
