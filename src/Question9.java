import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (pounds): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (inches): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your age (years): ");
        int age = scanner.nextInt();

        // Female BMR
        double femaleBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);

        // Male BMR
        double maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);

        // Chocolate bars for Females
        double femaleBars = femaleBMR / 230;

        // Chocolate bars for Males
        double maleBars = maleBMR / 230;

        System.out.printf("For a woman: %.2f chocolate bars per day\n", femaleBars);
        System.out.printf("For a man: %.2f chocolate bars per day\n", maleBars);
    }
}
