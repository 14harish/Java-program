import java.util.*;

public class longestCommonSequence {
    public static void main(String[] args) {
        
    String s=" "+"aabcef";
    String s1=" "+"abcf";
    char arr1[]=s.toCharArray();    
    char arr2[]=s1.toCharArray();    
    int arr[][]=new int[arr1.length][arr2.length];

    String store="";
    for(int i=1;i<arr1.length;i++){
        for(int j=1;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
                arr[i][j]=arr[i-1][j-1]+1;
                if(arr[i-1][j]==arr[i][j-1]){
                    store+=arr1[i];
                }
            }else{
                arr[i][j]=arr[i-1][j]>arr[i][j-1]?arr[i-1][j]:arr[i][j-1];  
            }
        }
    }
    System.out.println(store);
       System.out.println(arr[arr1.length-1][arr2.length-1]);
    }}

