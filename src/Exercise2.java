package MassiveMulti;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (mass[i][j] % 2 != 0) {
                    System.out.print(mass[i][j] + " ");
                }
            }
        }
    }
}
