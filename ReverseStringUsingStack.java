import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {
        // Step 1: Prompt the user to enter a string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Step 3: Push each character of the string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i)); // Push each character onto the stack
        }

        // Step 4: Create an empty string to store the reversed result
        String reversed = "";

        // Step 5: Pop characters from the stack and append them to the result
        while (!stack.isEmpty()) {
            reversed += stack.pop(); // Pop character from stack and add to reversed string
        }

        // Step 6: Display the reversed string
        System.out.println("The reversed string is: " + reversed);

        // Step 7: Close the scanner to avoid resource leak
        scanner.close();
    }
}
