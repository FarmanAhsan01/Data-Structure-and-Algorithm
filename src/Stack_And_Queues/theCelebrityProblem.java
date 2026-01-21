package Stack_And_Queues;

public class theCelebrityProblem {
    //Brute Approach.........................................
//    public static int theCelebrity(int arr[][]){
//        int n=arr.length;
//        int knowMe[]=new int[n];
//        int iknow[]=new int[n];
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (arr[i][j]==1){
//                    knowMe[j]++;
//                    iknow[i]++;
//
//                }
//            }
//        }
//
//        for (int i=0;i<n;i++){
//            if (knowMe[i]==n-1 && iknow[i]==0){
//                return i;
//            }
//        }
//        return -1;
//    }

    //Optimal Approach.....................................
    public static int theCelebrity(int arr[][]){
        int n=arr.length;
        int top=0;
        int down=n-1;
        while(top<down){
            if (arr[top][down]==1){
                top++;
            }
            else if (arr[down][top]==1) {
                down--;
            }
            else {
                top++;
                down--;
            }
        }
        if (top>down){
            return -1;
        }

        for (int i=0;i<n;i++){
            if (i==top){
                continue;
            }
            if(arr[top][i]==1 || arr[i][top]==0){
                return -1;
            }
        }
        return top;
    }
    public static void main(String[] args) {
        int arr[][]={
                {0,1,1,0},
                {0,0,0,0},
                {1,1,0,0},
                {0,1,1,0}
        };
        System.out.println(theCelebrity(arr));
    }
}
