import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how much time u want to push elements in the stack:");
        n=s.nextInt();
        Stack<Integer> stack = new Stack<>(n);
        
        System.out.println("Enter element of stack: ");
        for(int i = 0; i < 5; i++) {
            stack.push(new Scanner(System.in).nextInt());
        }

        stack.printStack();
        System.out.println("Top: " + stack.Top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.Top());
        stack.printStack();
    }
}
