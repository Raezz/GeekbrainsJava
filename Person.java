public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int pay;
    private int age;

    public int getAge() {
        return age;
    }

    public Person(String name, String position, String email, String phone, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public void showInfo(){
        System.out.printf("ФИО: %s \nДолжность: %s \nemail: %s \nНомер телефона: %s \n" +
                "Зарплата: %d \nВозраст: %d\n\n",
                this.name, this.position, this.email, this.phone, this.pay, this.age);
    }
}
