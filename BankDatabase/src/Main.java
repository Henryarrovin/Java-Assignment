public class Main {
    public static void main(String[] args) {
        Bank obj = new Bank();

        // Custom input - Transactions
        obj.withdrawn("Henry", 20);
        obj.withdrawn("Arrovin", 40);
        obj.deposit("Helen", 35);
        obj.withdrawn("Arosha", 80);
        obj.withdrawn("Hen", 40);
    }
}
