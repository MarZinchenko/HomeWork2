// 1.1.2 Используя рекурсию

package homework2.loops;

import java.util.Scanner;

public class LoopsMain2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int result = in.nextInt();
        System.out.println(factorial(result));
    }

    public static int factorial(int x) {
        int result = 1;

        if (x == 0) {
            System.out.print(" = ");
            return result;
        }
        if (x == 1) {
            System.out.print(" * 1 = ");
            return result;
        }
        System.out.print(x);

        if (x != 2) {
            System.out.print(" * ");
        }
        result = x * factorial(x-1);
        return result;
    }
}

