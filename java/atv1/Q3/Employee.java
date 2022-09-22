package Q3;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary  += grossSalary * (percentage/100);
    }
    @Override
    public String toString() {
        return String.format("%s, $ %f ", name, NetSalary());
    }
}
