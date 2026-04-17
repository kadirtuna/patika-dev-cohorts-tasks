public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 6, 8, 4, 10, 12, 6};

        System.out.println("Tekrar eden cift sayilar:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) continue;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }
    }
}
