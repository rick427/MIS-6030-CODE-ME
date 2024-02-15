import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String text = scanner.nextLine();

        // Find the first occurrence of "hate"
        int index = text.toLowerCase().indexOf("hate");

        // Replace the first occurrence if found
        if (index != -1) {
            String newText = text.substring(0, index) + "love" + text.substring(index + 4);
            System.out.println("New text: " + newText);
        } else {
            System.out.println("The word 'hate' was not found in the text.");
        }

        // Test-case: "I hate the way you hate new things"
    }
}
