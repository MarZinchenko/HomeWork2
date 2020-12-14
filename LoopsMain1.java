// 1.1.1 Используя только цикл

package homeWork2.loops;

import java.util.Scanner;

public class LoopsMain1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();
        int result = 1;

        for (int i = 1; i <= x; i++) {
            result *= i;
                if (i < x) {
                    System.out.print(i + " * ");
                    continue;
                }
                System.out.print(i);
            }
        System.out.print(" = ");
        System.out.print(result);
    }
}