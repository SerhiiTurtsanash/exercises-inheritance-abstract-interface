package Herencia_3;

public class InternationalStudent extends Student {
    private String country;

    public InternationalStudent() {
        super();
        System.out.println("Sóc el constructor de la classe InternationalStudent");

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
