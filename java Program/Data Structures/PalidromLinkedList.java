/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> sc=new Stack<Integer>();
        ListNode temp=head;
        boolean c=true;
        while(temp!=null){
            sc.push(temp.val);
            temp=temp.next;
        }
        while(head!=null){
            int i=sc.pop();
            if(head.val==i){
                c=true;
            }
            else{
                c=false;
            }
            head=head.next;
        }
       return c;   
    }
}
