import java.util.*;

public class Subsets {
    static void findSubsets(int[] arr, int idx, List<Integer> current) {
        if (idx == arr.length) {
            System.out.println(current);
            return;
        }

        // choice 1 → element lena
        current.add(arr[idx]);
        findSubsets(arr, idx + 1, current);

        // backtrack (undo)
        current.remove(current.size() - 1);

        // choice 2 → element na lena
        findSubsets(arr, idx + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        findSubsets(arr, 0, new ArrayList<>());
    }
}
