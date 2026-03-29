public class problem8 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }

            // first star pattern
            for (int k = n; k > i; k--) {
                System.out.print('*');
            }

            // second star pattern
            for (int l = n - 1; l > i; l--) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}
