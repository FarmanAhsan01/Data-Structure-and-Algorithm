package Array;

public class check_Array_Sorted {
    public  static boolean check(int nums[]){
        int countBreaks = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare current element with the next (circular check)
            if (nums[i] > nums[(i + 1) % n]) {
                countBreaks++;
            }
        }

        // The array is valid if there is at most one "break" in the order
        return countBreaks <= 1;
    }
    public static void main(String[] args) {
        int nums[]={3,4,5,6,1,2};
        System.out.println(check(nums));
    }
}
