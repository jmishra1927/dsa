public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;   //Can be any Generic Type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+ " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    //Add new node at  beginning
    public void insertFirstNode(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //Assign reference of one node to another
        sll.head.next = second;  //10 -->1
        second.next = third;   //10 --> 1 --> 8
        third.next = fourth;     //10-->1-->8-->11

        //Print elements of Singly Linked List
        sll.display();
        System.out.println("Linked list size is: "+sll.length());
        sll.insertFirstNode(15);
        sll.display();
        System.out.println("Size after inserting new node a beginning is: "+sll.length());

    }
}
