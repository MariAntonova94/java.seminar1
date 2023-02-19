package org.example.seminar1.hw2;
import java.util.Scanner;
import java.util.SplittableRandom;

public class ex2 {
    public static void main(String[] args){
        System.out.printf("Сумма равна %d", dz());
    }
    public static int dz() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num1 = scanner.nextInt();
        while (num1 != 0) {
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 < 0) {
                sum += num1;
            }
            num1 = num2;
        }
        scanner.close();
        return sum;
    }
}
