package Herencia_1;

public class TestObjecteGeometric {
    public static void main(String[] args) {
        ObjecteGeometric circulo1 = new Cercle(10,10,"red",10);
        ObjecteGeometric circulo2 = new Cercle(0,0,"blue",15);

        ObjecteGeometric quadrat1 = new Quadrat(10,10,"red",10);
        ObjecteGeometric quadrat2 = new Quadrat(0,0,"blue",15);

        System.out.println(circulo1);
        System.out.println(circulo2);

        System.out.println(quadrat1);
        System.out.println(quadrat2);

    }
}
