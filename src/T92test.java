public class T92test {
    public ListNode reverse(ListNode head, int m, int n) {
        ListNode curHead = new ListNode(0);
        curHead.next=head;
        int index=1;
        ListNode pre=head;
        ListNode cur=head.next;
        ListNode next;
        ListNode last=head;
        ListNode first=curHead;


        while (index < n) {
            if (index >= m && index <= n) {
                while (index < n) {
                    next=cur.next;
                    cur.next=pre;
                    pre=cur;
                    cur=next;
                    index++;
                }
            } else if (index < m) {
                first=first.next;
                pre=pre.next;
                cur=cur.next;
                last=pre;
                index++;
            }
        }
        first.next=pre;
        last.next=cur;
        return curHead.next;
    }
}
