public class Stack<T> {
    private T[] stack;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        stack = (T[]) new Object[size];
        top = -1;
    }

    public void push(T item) {
        if (top == size - 1) {
            System.out.println("Stack is full!");
        } else {
            stack[++top] = item;
        }
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        } else {
            return stack[top--];
        }
    }

    public T Top() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
