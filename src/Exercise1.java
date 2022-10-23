package MassiveMulti.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива - ");
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
        for (int i = 0; i < n; i++) {
            if (mass[i][i] % 2 == 0) {
                sum += mass[i][i];
            }
        }
        System.out.println("Сумма чётных элементов на главной диагонали состовляет - " + sum);

    }
}
