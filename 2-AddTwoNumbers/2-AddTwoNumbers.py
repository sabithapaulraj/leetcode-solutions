# Last updated: 6/17/2025, 10:28:37 PM
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        dummy = ListNode()
        result = dummy
        carry = 0

        while l1 or l2 or carry:
            current = carry

            if l1:
                current += l1.val
                l1 = l1.next
            if l2:
                current += l2.val
                l2 = l2.next

            num = current % 10
            carry = current // 10

            dummy.next = ListNode(num, None)
            dummy = dummy.next

        return result.next

        

            
            



