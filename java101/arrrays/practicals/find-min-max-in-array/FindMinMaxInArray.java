import java.util.Scanner;

public class FindMinMaxInArray {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        int min = list[0], max = list[0];
        for (int val : list) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        System.out.println("Minimum Deger: " + min);
        System.out.println("Maximum Deger: " + max);

        // Homework: find closest smaller and closest larger than a given number
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int target = input.nextInt();

        Integer closestSmaller = null;
        Integer closestLarger = null;

        for (int val : list) {
            if (val < target) {
                if (closestSmaller == null || val > closestSmaller) closestSmaller = val;
            } else if (val > target) {
                if (closestLarger == null || val < closestLarger) closestLarger = val;
            }
        }

        System.out.println("Girilen sayidan kucuk en yakin sayi: " + closestSmaller);
        System.out.println("Girilen sayidan buyuk en yakin sayi: " + closestLarger);

        input.close();
    }
}
