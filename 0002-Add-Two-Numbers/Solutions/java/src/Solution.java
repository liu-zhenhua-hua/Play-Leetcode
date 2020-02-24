/*
* @Author: Tony Liu
* @Date:   2020-02-24 20:13:59
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-24 20:28:45
*
* 1) digit = l1.val + l2.val + carry; 
*    val   = digit%10;
*    carry = digit/10;
*
*
*
*
*/

public class Solution{

	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		if(l1 == null && l2 == null)
			throw new IllegalArgumentException("Two ListNode is null !");

		ListNode fake = new ListNode(0);
		ListNode current = fake;
		int carray = 0;

		while(l1 != null && l2 != null){
			int digit = l1.val + l2.val + carry;
			int val = digit%10;
			carry = digit/10;

			curent.next = new ListNode(val);

			l1 = l1.next;
			l2 = l2.next;

		}



	}


}