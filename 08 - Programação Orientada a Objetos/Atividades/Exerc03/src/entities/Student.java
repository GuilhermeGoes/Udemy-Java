package entities;

public class Student {
    //ATRIBUTOS
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    //METODOS
    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (finalGrade() > 60)
            return 0;
        else
            return 60 - finalGrade();
    }
}
