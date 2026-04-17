import java.util.Scanner;

public class FindEbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        int n2 = input.nextInt();

        // EBOB using while loop (homework requirement)
        int a = n1, b = n2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int ebob = a;
        int ekok = (n1 * n2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        input.close();
    }
}
