import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter element of stack: ");
        for(int i = 0; i < 5; i++) {
            stack.push(new Scanner(System.in).nextInt());
        }

        stack.printStack();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        stack.printStack();
    }
}