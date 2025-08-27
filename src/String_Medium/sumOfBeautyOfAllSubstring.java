package String_Medium;

public class sumOfBeautyOfAllSubstring {
    public int beautySum(String s){
        int n = s.length(); int totalBeauty = 0;
        // Step 1: Iterate over all substrings
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            // frequency array for chars
            for (int j = i; j < n; j++) {
                // Add current character to frequency
                freq[s.charAt(j) - 'a']++;
                // Step 2: Calculate beauty of substring s[i..j]
                int maxFreq = 0, minFreq = Integer.MAX_VALUE;
                for (int f : freq) {
                    if (f > 0) {
                        // only consider characters present
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }
                totalBeauty += (maxFreq - minFreq);
            }
        }
        return totalBeauty;
    }
    public static void main(String[] args) {
        sumOfBeautyOfAllSubstring sol=new sumOfBeautyOfAllSubstring();
        String s="aabcb";
        System.out.println(sol.beautySum(s));
    }
}
