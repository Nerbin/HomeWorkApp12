package app;

public class HomeWorkApp12 {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Олексій Іваненко", "Менеджер",  "+380123456789", 29);
        Employee employee2 = new Employee("Марія Петрівна", "Бухгалтер", "+380987654321", 34);

        System.out.println("Інформація про співробітників:");
        employee1.displayInfo();
        employee2.displayInfo();

        Car car = new Car();
        System.out.println("\nЗапускаємо автомобіль:");
        car.start();
    }
}
