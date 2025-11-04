package Hashing;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
public class countNumberOfFrequency {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static List<Integer>frequencyCount(int[] arr) {
        // do modify in the given array
        int n = arr.length;
        int[] freq = new int[n + 1]; // Index 0 is ignored for 1-based indexing

        // Count frequencies
        for (int num : arr) {
            if (num >= 1 && num <= n) { // Consider only valid range
                freq[num]++;
            }
        }

        // Convert frequency array to a list
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) { // Ignore index 0 for 1-based indexing
            result.add(freq[i]);
        }

        return result;
    }




    public static void main(String[] args) {
        int[] arr={2,3,2,5,5};
        System.out.println(frequencyCount(arr));
    }
}
