public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1.");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println();


        System.out.println("Exercise 2.");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "
                + fullNameUpperCase);
        System.out.println();


        System.out.println("Exercise 3.");
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName);
        System.out.println();
    }
}