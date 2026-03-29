public class problem9 {
    public static void main(String[] args) {
        int n = 5;

        // upper pyramid
        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // star pattern
            for (int k = 0; k < i + 1; k++) {
                System.out.print('*');
            }

            // second star pattern
            for (int l = 0; l < i; l++) {
                System.out.print('*');
            }

            System.out.println();
        }

        for (int e = n; e > 0; e--) {

            // spaces
            for (int f = n; f > e; f--) {
                System.out.print(' ');
            }

            // star pattern
            for (int g = 0; g < e; g++) {
                System.out.print('*');
            }

            // 2nd star pattern
            for (int h = 0; h < e - 1; h++) {
                System.out.print('*');
            }

            System.out.println();

        }

    }
}
