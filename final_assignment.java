import java.util.ArrayList;
import java.util.HashSet;

public class final_assignment {
    public static ArrayList<Integer> findCommonElements(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> common = new ArrayList<>();

        // Add elements of array1
        for (int num : array1) {
            set1.add(num);
        }

        // Check for common elements in array2
        for (int num : array2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        return common;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 3, 4};
        ArrayList<Integer> commonElements = findCommonElements(array1, array2);
        System.out.println(commonElements);
    }
}
