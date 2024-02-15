import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        float x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a floating point value (e.g) 2.345f ...");

        x = scanner.nextFloat();
        System.out.println("x is = " + x);

        y = 1.0 / x;
        System.out.println("(1.0 / x) equals i.e. y = " + y);

        z = x * y;
        System.out.println("(x * y) = " + z);
        System.out.println("(x * y) - 1 = " + (z - 1));
    }
}