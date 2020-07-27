package entities;

public class Rent {
    //ATRIBUTOS
    private String name;
    private String email;

    //CONSTRUTORES
    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //METODOS
    public String toString() {
        return name
                + ", "
                + email;
    }
}
