import java.util.*;
public class Main {
    public static void main(String[] args) {
        String name;
        System.out.println("\t\t\tBANK APP...");
        System.out.println("The people who uses our bank account are...\nArrovin\nHenry\nHen");
        Scanner s=new Scanner(System.in);
        System.out.print("User Name:");
        name=s.next();
        Withdrawal w=new Withdrawal(name);
        Greetings g=new Greetings();
        w.start();
        g.start();
    }
}