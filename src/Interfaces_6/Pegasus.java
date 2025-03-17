package Interfaces_6;

public class Pegasus extends Animal implements Bird, Horse {
    public Pegasus(String name, int age) {
        super(name, age);
    }

    @Override
    public void birdNoise() {
        System.out.println(name + " birdNoise");
    }

    @Override
    public void horseNoise() {
        System.out.println(name + " horseNoise");
    }

    public void fly() {
        System.out.println(name + " fly");
    }

    @Override
    public String toString() {
        return "Pegasus [Name: " + name + ", Age: " + age + "]";
    }
}
