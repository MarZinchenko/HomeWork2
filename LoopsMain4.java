//1.3

package HomeWork2.loops;

import java.util.Scanner;

public class LoopsMain4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number = in.nextDouble();
        System.out.print("Введите степень числа: ");
        int powNumber = in.nextInt();
        double result = 1;

        for (int i = 1; i <= powNumber; i++) {
            result = result * number;
        }
        System.out.println("Возведение в степень: " + result);
    }
}
