package andrePardinho.listas.cap3;

public class EmployeeTest {
    public static void main(String[] args) {


        Employee employee1 = new Employee("André", "Pardinho", 2350.00);
        Employee employee2 = new Employee("João","Silva", 3500.00);

        employee1.showInformation();
        employee2.showInformation();

        employee1.increaseSalary(10);
        employee2.increaseSalary(10);

        System.out.println("\nDepois do aumento de 10%:");

        employee1.showInformation();
        employee2.showInformation();

    }
}
