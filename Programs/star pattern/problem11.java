public class problem11 {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            int start = i % 2;

            for (int j = 0; j <= i; j++) {
                start = 1 - start;
                System.out.print(start);
            }

            System.out.println();
        }

    }
}