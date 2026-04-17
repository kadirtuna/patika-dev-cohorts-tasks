import java.util.Scanner;

public class MineSweeper {
    private String[][] mineMap;
    private String[][] playerMap;
    private int rows;
    private int cols;
    private int mineCount;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.mineCount = (rows * cols) / 4;
        this.mineMap = new String[rows][cols];
        this.playerMap = new String[rows][cols];
        initMaps();
        placeMines();
    }

    private void initMaps() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                mineMap[i][j] = "-";
                playerMap[i][j] = "-";
            }
    }

    private void placeMines() {
        int placed = 0;
        while (placed < mineCount) {
            int r = (int) (Math.random() * rows);
            int c = (int) (Math.random() * cols);
            if (!mineMap[r][c].equals("*")) {
                mineMap[r][c] = "*";
                placed++;
            }
        }
    }

    private int countAdjacentMines(int r, int c) {
        int count = 0;
        for (int i = r - 1; i <= r + 1; i++)
            for (int j = c - 1; j <= c + 1; j++)
                if (i >= 0 && i < rows && j >= 0 && j < cols && mineMap[i][j].equals("*"))
                    count++;
        return count;
    }

    private void printMap(String[][] map) {
        for (String[] row : map) {
            for (String cell : row) System.out.print(cell + " ");
            System.out.println();
        }
    }

    private boolean allOpened() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (playerMap[i][j].equals("-") && !mineMap[i][j].equals("*"))
                    return false;
        return true;
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz!");
        printMap(playerMap);

        while (true) {
            int r = -1, c = -1;
            while (true) {
                System.out.print("Satir Giriniz: ");
                r = input.nextInt();
                System.out.print("Sutun Giriniz: ");
                c = input.nextInt();
                if (r < 0 || r >= rows || c < 0 || c >= cols) {
                    System.out.println("Gecersiz koordinat. Tekrar giriniz.");
                } else if (!playerMap[r][c].equals("-")) {
                    System.out.println("Bu koordinat daha once secildi, baska bir koordinat girin.");
                } else {
                    break;
                }
            }

            if (mineMap[r][c].equals("*")) {
                playerMap[r][c] = "*";
                System.out.println("Game Over!!");
                printMap(playerMap);
                break;
            } else {
                int adjMines = countAdjacentMines(r, c);
                playerMap[r][c] = String.valueOf(adjMines);
                System.out.println("===========================");
                printMap(playerMap);
                if (allOpened()) {
                    System.out.println("Oyunu Kazandiniz!");
                    printMap(playerMap);
                    break;
                }
            }
        }

        input.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = 0, cols = 0;

        while (rows < 2 || cols < 2) {
            System.out.print("Satir sayisini giriniz (min 2): ");
            rows = input.nextInt();
            System.out.print("Sutun sayisini giriniz (min 2): ");
            cols = input.nextInt();
            if (rows < 2 || cols < 2)
                System.out.println("Boyut en az 2x2 olmalidir. Tekrar giriniz.");
        }

        MineSweeper game = new MineSweeper(rows, cols);
        game.play();
    }
}
