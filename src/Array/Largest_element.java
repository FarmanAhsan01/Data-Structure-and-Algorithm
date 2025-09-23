package Array;

public class Largest_element {
    public static void main(String[] args) {

            int arr[]={3,5,7,1,8,4};
            int n=arr.length;
            int max=arr[0];
            for (int i=0;i<n;i++){
                if( arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println(max);

        //with sorting
//        int arr[]={2,5,1,8,25,0};
//        int n=arr.length;
//        for (int i=1;i<n;i++) {
//            if (arr[i] < arr[i - 1]) {
//                int temp = arr[i - 1];
//                arr[i - 1] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        System.out.println(arr[n-1]);
    }
}
