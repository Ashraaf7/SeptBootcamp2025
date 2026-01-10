package SessionTwo.Polymorphism.Overloading;

public class Overloading {

    public static void sum(int x, int y) {
        System.out.println(x + y);
    }

    public static void sum(double x, double y) {
        System.out.println(x + y);
    }

    public static void sum(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    public static void main(String[] args) {
        sum(10.5, 20.5);
    }

}
