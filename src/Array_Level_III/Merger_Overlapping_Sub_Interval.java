package Array_Level_III;
import java.util.*;
public class Merger_Overlapping_Sub_Interval {

    //Brute Approach..........................................................
//    public static int[][] mergeOverlappingIntervals(int[][] arr) {
//        int n = arr.length; // size of the array
//    //sort the given intervals:
//        Arrays.sort(arr, new Comparator<int[]>() {
//        public int compare(int[] a, int[] b) {
//            return a[0] - b[0];
//        }
//    });
//
//        List<int[]> ans = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) { // select an interval:
//        int start = arr[i][0];
//        int end = arr[i][1];
//
//        //Skip all the merged intervals:
//        if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
//            continue;
//        }
//
//        //check the rest of the intervals:
//        for (int j = i + 1; j < n; j++) {
//            if (arr[j][0] <= end) {
//                end = Math.max(end, arr[j][1]);
//            } else {
//                break;
//            }
//        }
//            ans.add(new int[]{start, end});
//    }
//        return ans.toArray(new int[ans.size()][]);
//}
//
//    public static void main(String[] args) {
//        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
//        int[][] result = mergeOverlappingIntervals(arr);
//
//        // Print the merged intervals
//        System.out.println("Merged Intervals:");
//        for (int[] interval : result) {
//            System.out.print(Arrays.toString(interval));
//        }
//    }

    //Optimal Approach.....................................................
    public static int[][] mergerOverlappingInterval(int[][] arr){
        int n=arr.length;
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
        });
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(new int[]{arr[i][0], arr[i][1]});
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans.get(ans.size() - 1)[1]=Math.max(ans.get(ans.size() - 1)[1], arr[i][1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        int[][] result = mergerOverlappingInterval(arr);
        // Print the merged intervals
        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval));
        }

    }
}
