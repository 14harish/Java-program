public class longestSubarraySum {
    public static void main(String[] args) {
        int arr[]={10, 5, 2, 7, 1, 9};
        int n=arr.length;
        int k=15;
         int i=0,j=0,sum=arr[0],max=0,len=0;
        while(j<n){
            while(i<=j && sum>k){
                sum-=arr[i];
                i++;
            } 
            if(sum==k){
                len=(j-i)+1;
                if(len>max){
                    max=len;
                }
            }
            j++;
            if(j<n) sum+=arr[j];
        }
        System.out.println(max);
        // int n = a.length; // size of the array.

        // Map<Integer, Integer> preSumMap = new HashMap<>();
        // int sum = 0;
        // int maxLen = 0;
        // for (int i = 0; i < n; i++) {
        //     //calculate the prefix sum till index i:
        //     sum += a[i];

        //     // if the sum = k, update the maxLen:
        //     if (sum == k) {
        //         maxLen = Math.max(maxLen, i + 1);
        //     }

        //     // calculate the sum of remaining part i.e. x-k:
        //     int rem = sum - k;

        //     //Calculate the length and update maxLen:
        //     if (preSumMap.containsKey(rem)) {
        //         int len = i - preSumMap.get(rem);
        //         maxLen = Math.max(maxLen, len);
        //     }

        //     //Finally, update the map checking the conditions:
        //     if (!preSumMap.containsKey(sum)) {
        //         preSumMap.put(sum, i);
        //     }
        // }

        // return maxLen;
    }
    }
