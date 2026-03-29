package Programs.Array.problems;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ArrayOperations {

    public static int arraySum(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }

        return result;
    }

    public static int[] reverseArray(int[] array) {
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print("-->" + array[i]);
        }
    }

    public static Object[] removeDuplicatesHashSet(Integer[] array) {

        Set<Integer> hashSet = new HashSet<>(Arrays.asList(array));
        return hashSet.toArray();

    }
}

public class array_problems {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int result = ArrayOperations.arraySum(array);

        System.out.println(result);

        int[] response = ArrayOperations.reverseArray(array);

        ArrayOperations.printArray(response);

    }
}
