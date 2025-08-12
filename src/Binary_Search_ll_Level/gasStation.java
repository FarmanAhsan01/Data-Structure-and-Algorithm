package Binary_Search_ll_Level;

public class gasStation {

    //Brute Approach....................................
    public static double minimiseMaxDistance(int nums[],int k){
        int n=nums.length;
        int[] howMany = new int[n-1];
        for(int gasStation=1;gasStation<=k;gasStation++){
            double maxSection=-1;
            int maxInd=-1;
            for (int i=0;i<n-1;i++) {
                double diff = nums[i + 1] - nums[i];
                double sectionLength = diff / (double) (howMany[i] + 1);
                if (sectionLength > maxSection) {
                    maxSection = sectionLength;
                    maxInd = i;
                }
            }
            howMany[maxInd]++;
        }

        double maxAns=-1;
        for (int i=0;i<n-1;i++){
            double diff =nums[i+1]-nums[i];
            double sectionLength=diff/(double)(howMany[i]+1);
            maxAns=Math.max(maxAns,sectionLength);
        }
        return maxAns;
    }
    public static void main(String[] args){
        int nums[]={1,13,17,23};
        int k=4;
        double ans =minimiseMaxDistance(nums,k);
        System.out.println("The answer is: " + ans);
    }
}
