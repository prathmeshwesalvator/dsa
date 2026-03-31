public class problem10 {

    public static void main(String[] args) {

        int n = 5;

        // first star incrementing pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        // second star decrementing pattern
        for (int k = n - 1; k > 0; k--) {
            for (int l = 0; l < k; l++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}