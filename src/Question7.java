import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit integer: ");
        int number = scanner.nextInt();

        // Validations
        if (number < 1000 || number > 9999) {
            System.out.println("Error. Please enter a four-digit integer.");
            return;
        }

        // Get each digit using integer division and mod opt.
        int thousandsDigit = number / 1000;
        int hundredsDigit = (number % 1000) / 100;
        int tensDigit = (number % 100) / 10;
        int unitsDigit = number % 10;

        // Print each digit on a separate line
        System.out.println(thousandsDigit);
        System.out.println(hundredsDigit);
        System.out.println(tensDigit);
        System.out.println(unitsDigit);
    }
}
