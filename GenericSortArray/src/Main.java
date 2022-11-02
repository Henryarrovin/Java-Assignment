import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer n,a[];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = s.nextInt();
        a = new Integer[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        Sort s1 = new Sort(n,a);
        s1.sort();
        s1.print();
    }
}