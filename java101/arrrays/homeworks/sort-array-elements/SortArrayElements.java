import java.util.Scanner;

public class SortArrayElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarini giriniz:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemani: ");
            arr[i] = input.nextInt();
        }

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Siralama: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();

        input.close();
    }
}
