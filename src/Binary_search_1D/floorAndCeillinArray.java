package Binary_search_1D;

public class floorAndCeillinArray {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int low=0;
        int high=n-1;
        int floor=-1;;
        int ceil=-1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == x) {
                return new int[]{a[mid], a[mid]}; // If exact match, return immediately
            }
            else if (a[mid] < x) {
                floor = a[mid]; // Floor candidate
                low = mid + 1; // Move right
            }
            else {
                ceil = a[mid]; // Ceil candidate
                high = mid - 1; // Move left
            }
        }

        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        int arr[]={3, 4, 4, 7, 8, 10};
        int x=5;
        int n=arr.length;
        int result[]=getFloorAndCeil(arr,n,x);
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
    }
}
