package Interfaces_6;

public class Test {
    public static void main(String[] args) {
        Pegasus pegasus = new Pegasus("Pegasus", 1);

        System.out.println(pegasus);
        pegasus.birdNoise();
        pegasus.horseNoise();
        pegasus.fly();
    }
}
