package AddTwoNumbers;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString(){
        String string = val+"";
        if (this.next != null) string += ", "+this.next.toString();
        return string;
    }
}
