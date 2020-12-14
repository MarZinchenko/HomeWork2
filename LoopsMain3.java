//1.2
package homeWork2.loops;

import java.util.Scanner;

public class LoopsMain3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        while(n != 0){
            a = (n % 10);
            b = b * a;
            n/=10;
        }
    }
}
