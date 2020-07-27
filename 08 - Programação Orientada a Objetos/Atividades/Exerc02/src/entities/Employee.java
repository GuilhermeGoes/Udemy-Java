package entities;

public class Employee {
    //ATRIBUTOS
    public String name;
    public double grossSalary;
    public double tax;

    //METODOS
    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage/100;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }

}
