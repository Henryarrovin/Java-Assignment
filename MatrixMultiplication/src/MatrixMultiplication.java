import java.util.Scanner;

public class MatrixMultiplication {
    int r1, c1, r2, c2;
    int a[][], b[][], mul[][];
    Scanner s = new Scanner(System.in);
    void GetInput() {
        System.out.println("Enter the number of rows and columns of first matrix:");
        r1 = s.nextInt();
        c1 = s.nextInt();
        System.out.println("Enter the number of rows and columns of second matrix:");
        r2 = s.nextInt();
        c2 = s.nextInt();
        try {
            if (c1 != r2 || r1 != c2) {
                MyException e = new MyException("Matrix Multiplication is not possible");
                throw e;
            }
            else {
                a = new int[r1][c1];
                b = new int[r2][c2];
                mul = new int[r1][c2];
                System.out.println("Enter the elements of first matrix:");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        a[i][j] = s.nextInt();
                    }
                }
                System.out.println("Enter the elements of second matrix:");
                for (int i = 0; i < r2; i++) {
                    for (int j = 0; j < c2; j++) {
                        b[i][j] = s.nextInt();
                    }
                }
            }
        }
        catch(Exception e){
        }

    }
    void Multiplication() {
        try {
            if (c1 != r2||r1!=c2) {
                MyException e=new MyException("Matrix Multiplication is not possible");
                throw e;
            }
            else {
                //Display your matrix
                System.out.println("First Matrix:");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Second Matrix:");
                for (int i = 0; i < r2; i++) {
                    for (int j = 0; j < c2; j++) {
                        System.out.print(b[i][j] + " ");
                    }
                    System.out.println();
                }

                //Multiplication
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        for (int k = 0; k < c2; k++) {
                            mul[i][j] += a[i][k] * b[k][j];
                        }
                    }
                }

                //displaying the result
                System.out.println("Result of Matrix Multiplication:");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        System.out.print(mul[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        catch (MyException e) {
            System.out.println(e);
        }
    }

}

