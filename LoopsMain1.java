// 1.1.1 Используя только цикл

package HomeWork2.loops;

import java.util.Scanner;

public class LoopsMain1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int result = in.nextInt();
        System.out.println("Ответ: " + factorial(result));

    }

    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; ++i)
            result *= i;
        return result;
    }
}
