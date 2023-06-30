// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        firstName = firstName.toUpperCase();
        String middleName = "Ivanovich";
        middleName = middleName.toUpperCase();
        String lastName = "Ivanov";
        lastName = lastName.toUpperCase();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    public static void task3() {
        System.out.println("Задача 3");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Семёнов";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}