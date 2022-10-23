package MassiveMulti;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
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
        int sum1 = 1;
        int sum2 = 1;
        for (int i = 0; i < n; i++) {
            sum1 *= mass[i][i];
        }
        System.out.println(sum1 + " ");
        for (int i = 0; i < n; i++) {
            for (int j = mass.length - 1 - i; j < n; j++) {
                sum2 *= mass[i][j];
                break;

            }

        }
        if (sum1 > sum2) {
            System.out.println("Произведение элементов главной диагонали  " + sum1 + " является больше.");
        } else if (sum1 < sum2) {
            System.out.println("Произведение элементов побочной диагонали  " + sum2 + " является больше.");
        } else {
            System.out.println("Главная диагональ и побочная - равны");
        }
    }
}
