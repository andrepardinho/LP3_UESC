package andrePardinho.listas.cap3;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee (String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * (percentage/100);
        }
    }

    public void showInformation() {
        System.out.println("Employee: " + firstName + " " + lastName + " | Salário Anual: R$" + getAnnualSalary());
    }
}
