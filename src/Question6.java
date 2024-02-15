import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int res1 = scanner.nextInt();

        System.out.println("Enter the first number ");
        int res2 = scanner.nextInt();

        System.out.println("Enter the first number ");
        int res3 = scanner.nextInt();

        double average = (res1 + res2 + res3) / 3.0;
        System.out.println("Average of all numbers is " + average);
    }
}
