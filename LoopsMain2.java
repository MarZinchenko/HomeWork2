// 1.1.2 Используя рекурсию

package HomeWork2.loops;

import java.util.Scanner;

public class LoopsMain2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int result = in.nextInt();
        System.out.println("Ответ: " + factorial(result));
    }

    public static int factorial(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }
}

