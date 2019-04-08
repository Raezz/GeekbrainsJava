public class Lesson5HW {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivan Ivanov","Engineer","ivan@mail.ru",
                "89991234567", 40000,30);
        persArray[1] = new Person("Dmitriy Stepanov","Tester","dmstep@mail.ru",
                "89999876573", 45000,28);
        persArray[2] = new Person("Stepan Korolev","Engineer","korolevstep@mail.ru",
                "89585439456",45000,41);
        persArray[3] = new Person("Igor Kovalev","Engineer","kovalevig@gmail.com",
                "89688378016",43000,36);
        persArray[4] = new Person("Leonid Belov","Guard","belov@mail.ru",
                "89587507291",35000,47 );
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40){
                persArray[i].showInfo();
            }
        }
    }
}
