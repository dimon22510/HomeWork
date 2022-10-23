package MassiveMulti;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите размерность массива - ");
        Random random = new Random();
        int n = scanner.nextInt();
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = random.nextInt(50);
                System.out.print(mass[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                int c = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i] = c;
            }
        }
        System.out.println();
        for (int i = 0; i<n; i++) {
            for (int  j = 0; j<n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
