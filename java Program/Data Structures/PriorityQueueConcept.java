//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);

            int[] A = new int[N];

            String S1[] = read.readLine().split(" ");
            for (int i = 0; i < N; i++)
                A[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxDiamonds(A, N, K));
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    static long maxDiamonds(int[] a, int n, int k) {
        // code here
        PriorityQueue<Integer> q = new PriorityQueue<>((d, b) -> b - d); // It will store the large element in the first
                                                                         // or in top
        // PriorityQueue<Integer> q = new PriorityQueue<>((d, b) -> d - b); // It will store the smallest element in the
                                                                         // first or in top
        int ans = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            q.add(a[i]);
        }
        for (int i = 0; i < k; i++) {
            sum += q.peek();
            q.add(q.peek() / 2);
            q.poll();
        }
        return sum;
    }
};