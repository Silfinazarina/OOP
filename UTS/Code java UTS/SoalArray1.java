public class SoalArray1 {
    public static void main(String[] args) {
    int[][] arrayInt = {{1, 1, 4}, {2, 1, 2}, {3, 2, 1}};
    // hitung jumlah elemen array 2 dimensi
    // gunakan perulangan
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//SILFI NAZARINA