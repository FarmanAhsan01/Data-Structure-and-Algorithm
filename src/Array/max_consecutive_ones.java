package Array;

public class max_consecutive_ones {
    public static int maxOnes(int nums[]){
        int n=nums.length;
        int flag=0;
        int max=0;
        for (int i=0;i<n;i++){
            if(nums[i]==1){
                flag++;
            }
            else{
                flag=0;
            }
            max=Math.max(max,flag);
        }
        return flag;
    }
    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1};
        System.out.println(maxOnes(nums));
    }
}
