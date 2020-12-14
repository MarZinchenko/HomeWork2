//1.5

package homeWork2.loops;

public class LoopsMain5 {
    public static void main(String[] args) {

        printRow(2, 5);
        System.out.println();
        printRow(6, 9);
    }

    public static void printRow(int from, int to) {

        for (int i = 1; i <= 10; i++) {
            for (int j = from; j <= to; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            }
            System.out.print("\n");
        }
    }
}