import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        float x;
        float y;
        int z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a floating point value (e.g) 2.345f ...");

        x = scanner.nextFloat();
        y = (float) (x % 2.0);

        System.out.println("x is = " + x);
        System.out.println("y is = " + y);

        z = (int) x;
        System.out.println("x is = " + x);
        System.out.println("z is = " + z);
        System.out.println("z % 2 is = " + (z % 2));
    }
}
