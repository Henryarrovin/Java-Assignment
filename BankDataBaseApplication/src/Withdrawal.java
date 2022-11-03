import java.util.*;
public class Withdrawal extends Thread{
    String name;
    double totalMoney;
    double withdraw;
    Withdrawal(String name){
        this.name=name;
    }
    public void run(){

        try {
            Scanner s = new Scanner(System.in);
            if (Objects.equals(name, "Henry")) {
                totalMoney = 100000;
                System.out.println("Your total amount is:"+totalMoney);
                System.out.print("Enter the money to withdraw:");
                withdraw = s.nextDouble();
                System.out.println(name + " withdrew " + withdraw + " amount of money...");
                System.out.println("\n\t\t\tBALANCE AMOUNT...");
                System.out.println("Balance amount of money:" + (totalMoney - withdraw));
            } else if (Objects.equals(name, "Arrovin")) {
                totalMoney = 9987657;
                System.out.println("Your total amount is:"+totalMoney);
                System.out.print("Enter the money to withdraw:");
                withdraw = s.nextDouble();
                System.out.println(name + " withdrew " + withdraw + " amount of money...");
                System.out.println("\t\t\tBALANCE AMOUNT...");
                System.out.println("Balance amount of money:" + (totalMoney - withdraw));
            } else if (Objects.equals(name, "Hen")) {
                totalMoney = 123458;
                System.out.println("Your total amount is:"+totalMoney);
                System.out.print("Enter the money to withdraw:");
                withdraw = s.nextDouble();
                System.out.println(name + " withdrew " + withdraw + " amount of money...");
                System.out.println("\t\t\tBALANCE AMOUNT...");
                System.out.println("Balance amount of money:" + (totalMoney - withdraw));
            } else {
                System.out.println("There is no such user in our application...");
            }

            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
