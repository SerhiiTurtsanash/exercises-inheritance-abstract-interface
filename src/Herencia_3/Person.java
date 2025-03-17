package Herencia_3;

public class Person {
    private String name;
    private String address;

    public Person() {
        System.out.println("Sóc el constructor de la classe Person");
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

}
