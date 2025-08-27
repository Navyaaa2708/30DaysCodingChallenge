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
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // StringBuilder s1=new StringBuilder();
        // StringBuilder s2=new StringBuilder();
        // while(l1!=null){
        //     s1.insert(0,l1.val);
        //     l1=l1.next;
        // }
        // while(l2!=null) {
        //     s2.insert(0,l2.val);
        //     l2=l2.next;
        // }
        // BigInteger n1=new BigInteger(s1.toString());
        // BigInteger n2=new BigInteger(s2.toString());
        // BigInteger sum=n1.add(n2);
        // String ans=sum.toString();
        // ListNode res=new ListNode(0);
        // ListNode curr=res;
        // for (int i=ans.length()-1;i>=0;i--) {
        //     curr.next=new ListNode(ans.charAt(i)-'0');
        //     curr=curr.next;
        // }
        // return res.next;
        ListNode res=new ListNode(0);
        ListNode curr=res;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        return res.next;
    }
}