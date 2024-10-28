package app;

public class Employee {
    private String name;
    private String position;
    private String phone;
    private int age;

    public Employee(String name, String position, String phone, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.printf("ПІБ: %s, Посада: %s, Телефон: %s, Вік: %d%n", name, position, phone, age);
    }
}
