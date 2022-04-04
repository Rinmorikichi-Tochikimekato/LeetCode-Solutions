// 1721. Swapping Nodes in a Linked List
// Medium

// 1745

// 75

// Add to List

// Share
// You are given the head of a linked list, and an integer k.

// Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

 

// Example 1:


// Input: head = [1,2,3,4,5], k = 2
// Output: [1,4,3,2,5]
// Example 2:

// Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
// Output: [7,9,6,6,8,7,3,0,9,5]
 

// Constraints:

// The number of nodes in the list is n.
// 1 <= k <= n <= 105
// 0 <= Node.val <= 100
// Accepted
// 104,211
// Submissions
// 158,675

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
    public ListNode swapNodes(ListNode head, int k) {
        
    ListNode p = head;
    int counter = 0;
    ListNode start = null;
    while(p!=null){
        if(++counter == k){
            start = p;
        }
        p=p.next;
    }
    
    // System.out.println(counter);
        
    int newCounter = counter - k;
    
    p = head;
    ListNode end = null;
    while(p!=null){
     if(newCounter-- == 0){
         end = p;
         break;
     }   
    p=p.next;
    }
    // System.out.println(start.val);
    // System.out.println(end.val);
    
    ListNode temp = new ListNode();
    temp.val = start.val;
    start.val = end.val;
    end.val = temp.val;
    return head;
    
    }
}
