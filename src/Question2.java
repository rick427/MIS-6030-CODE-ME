import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        float x;
        int y;
        int z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a floating point value (e.g) 2.345f ...");

        x = scanner.nextFloat();
        y = (int) x;

        System.out.println("x is = " + x);
        System.out.println("y is = " + y);

        z = (byte) y;
        System.out.println("x is = " + x);
        System.out.println("z is = " + z);
    }
}
