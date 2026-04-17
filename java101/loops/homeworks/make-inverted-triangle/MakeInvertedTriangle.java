import java.util.Scanner;

public class MakeInvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
