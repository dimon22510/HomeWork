package MassiveMulti;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
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
        int sum = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (mass[i][j] % 2 == 0) {
                    sum += mass[i][j];
                }
            }

        }
        System.out.println("—умма чЄтных элементов над побочной диагональю не включительно - " + sum);
    }
}
