public class FindMatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 3, 4},
            {5, 6, 4}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Matris:");
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }

        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Transpoze:");
        for (int[] row : transpose) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }
}
