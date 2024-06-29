import java.util.ArrayList;
import java.util.HashSet;

public class final_assignment2 {
    public static ArrayList<Integer> removeDuplicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> uniqueElements = new ArrayList<>();

        // Add elements to set and ArrayList if not already present
        for (int num : array) {
            if (!set.contains(num)) {
                set.add(num);
                uniqueElements.add(num);
            }
        }

        return uniqueElements;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        ArrayList<Integer> uniqueElements = removeDuplicates(array);
        System.out.println(uniqueElements);
    }
}