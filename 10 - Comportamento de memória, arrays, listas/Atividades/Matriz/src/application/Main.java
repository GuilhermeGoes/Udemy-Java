package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = in.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.print("Enter the value of X: ");
        int x = in.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Position " + i + ", " + j + ":");

                    if (j-1 >= 0) {
                        System.out.println("Left:" + matrix[i][j-1]);
                    }
                    if (i-1 >= 0) {
                        System.out.println("Up:" + matrix[i-1][j]);
                    }
                    if (j+1 < n) {
                        System.out.println("Right:" + matrix[i][j+1]);
                    }
                    if (i+1 < m) {
                        System.out.println("Down:" + matrix[i+1][j]);
                    }
                }
            }
        }

        in.close();
    }
}
