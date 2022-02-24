// Given the head of a linked list, return the list after sorting it in ascending order.

 

// Example 1:


// Input: head = [4,2,1,3]
// Output: [1,2,3,4]
// Example 2:


// Input: head = [-1,5,3,4,0]
// Output: [-1,0,3,4,5]
// Example 3:

// Input: head = []
// Output: []
 

// Constraints:

// The number of nodes in the list is in the range [0, 5 * 104].
// -105 <= Node.val <= 105
 

// Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?

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

// Time O(nlogn) Space O(n)
// class Solution {
//     public ListNode sortList(ListNode head) {
        
//         Queue<ListNode> pq = new PriorityQueue(new Comparator<ListNode>()
//         {
//             public int compare(ListNode l1, ListNode l2){
//                 if(l1.val > l2.val){
//                     return 1;
//                 }else if(l1.val < l2.val)
//                 {
//                     return -1;
//                 }else
//                     return 0;
//             }
            
//         });
        
//         ListNode iter = head;
//         while(iter!=null){
//             pq.offer(iter);
//             iter = iter.next;
//         }
        
        
        
//         ListNode newRoot = null;
//         head = null;
//         while(pq.size()!=0){
//            ListNode intermediate =  pq.poll();
//             // System.out.println(intermediate.val);
//             if(head == null){
//                 head = intermediate;
//                 newRoot = head;
//             }else{
//                 head.next = intermediate;
//                 head = head.next;
//             }
//         }
        
//         if(head != null)
//         head.next = null;
        
//         return newRoot;
        
//     }
// }

