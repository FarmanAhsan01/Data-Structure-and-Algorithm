package Array_Level_II;

public class matrix_90_rotate {
//    public static ArrayList<ArrayList<Integer>>rotate(ArrayList<ArrayList<Integer>>matrix,int n,int m){
//            for(int i=0;i<n;i++){
//                for (int j=0;j<m;j++){
//
//                }
//            }
//    }
    //BRUTE APPROACH
//     public static int[][] rotate(int[][] matrix){
//        int n=matrix.length;
//        int rotate[][]=new int[n][n];
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                rotate[j][n-i-1]=matrix[i][j];
//            }
//        }
//        return rotate;
//    }
//
//    public static void main(String[] args) {
//        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//        int rotate[][]=rotate(arr);
//        for (int i=0;i<rotate.length;i++){
//            for (int j=0;j<rotate.length;j++){
//                System.out.print(rotate[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }


//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>>matrix=new ArrayList<>();
//        matrix.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
//        matrix.add(new ArrayList<>(Arrays.asList(5,6,7,8)));
//        matrix.add(new ArrayList<>(Arrays.asList(9,10,11,12)));
//        matrix.add(new ArrayList<>(Arrays.asList(13,14,15,16)));
//
//        int n=matrix.size();
//        int m=matrix.get(0).size();
//
//        ArrayList<ArrayList<Integer>>ans=rotate(matrix,n,m);
//        for (ArrayList<Integer>row:ans){
//            for (Integer ele:row){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }
//
//    }

    //OPTIMAL APPROACH
//    public static int[][] rotate(int[][] matrix){
//        int n=matrix.length;
//        int rotate[][]=new int[n][n];
//        for (int i=0;i<n-2;i++){
//            for (int j=i+1;j<n-1;j++){
//               int temp= matrix[i][j];
//               matrix[i][j]=matrix[j][i];
//               matrix[j][i]=temp;
//            }
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length / 2; j++) {
//                int temp = 0;
//                temp = matrix[i][j];
//                matrix[i][j] = matrix[i][matrix.length - 1 - j];
//                matrix[i][matrix.length - 1 - j] = temp;
//            }
//        }
//        return rotate;
//    }
//    public static void main(String[] args) {
//        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//        int rotated[][]=rotate(arr);
//        for (int i=0;i<rotated.length;i++){
//            for (int j=0;j<rotated.length;j++){
//                System.out.print(rotated[i][j]);
//            }
//            System.out.println();
//        }
//    }

    //Optimal Approach..........................................................
    static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
    public static void main(String args[]) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
