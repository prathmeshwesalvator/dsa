public class problem7 {

    public static void main(String[] args) {

        int n = 5;

        // outer loop
        for (int i = 0; i < n; i++) {

            // spaces loop
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(' ');
            }

            // pattern loop
            for (int k = 0; k < i + 1; k++) {
                System.out.print('*');
            }

            // second pattern loop
            for (int l = 0; l < i; l++) {
                    System.out.print('*');
            }

            System.out.println();

        }
    }
}

// ___*|
// __**|*  <--- how it comes in second line , as per code it should comes in forst 
// _***|**
// ****|***