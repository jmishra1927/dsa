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

    //Find number of element in the linked list
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

    //Add new element at the end of SinglyLinkedList
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    //This method will insert a node in specified position
    public void insert(int position, int value){    //position : 2, value : 7
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        }else{
            int count = 1;
            ListNode previous = head; // 1 --> 2 --> 3 --> 4 --> null
            while(count < position -1 ){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;   //current:  3 --> 4 --> null
            previous.next = node;   // 1 --> 2 --> 7
            node.next = current;  //1 --> 2 --> 7 --> 3 --> 4 --> null
        }
    }
    
    //This will delete a node from beginning
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode first = head;
        head = head.next;
        first.next = null;
        return first;
    }

    //This will delete a node from the last position of SinglyLinkedList
    public ListNode deleteFromLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    //This will delete node from a given position
    public ListNode delete(int position){
        if(position == 1){
            ListNode current = head;
            head = head.next; //Previous head will be garbage collected because there is no reference to that
            return current;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < position -1 ){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
            return current;
        }
    }

    //This method will search for an element in SinglyLinkedList
    public boolean find(ListNode head, int searchKey){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
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
        sll.insertLast(23);
        sll.display();
        System.out.println("Size after inserting new node a end is: "+sll.length());
        System.out.println("===========Insert at specific position===========");
        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.insert(1, 5);
        sll2.display();
        sll2.insert(1, 8);
        sll2.display();
        sll2.insert(3, 9);
        sll2.display();
        sll2.insert(2, 7);
        sll2.display();
        System.out.println("===========Delete First==============");
        sll.display();
        System.out.println("Deleted first node's data is: "+sll.deleteFirst().data);
        System.out.println("Deleted first node's data 2nd time is: "+sll.deleteFirst().data);
        sll.display();
        System.out.println("==========Delete from last===============");
        sll.insertLast(26);
        sll.insertLast(14);
        sll.insertLast(78);
        sll.display();
        System.out.println("Deleted last node's data is: "+sll.deleteFromLast().data);
        sll.display();
        System.out.println("==========Delete from given position===============");
        System.out.println("Deleted first node's data is: "+sll.delete(1).data);
        sll.display();
        System.out.println("Deleted fourth node's data is: "+sll.delete(4).data);
        sll.display();
        System.out.println("=============Search for Key=================");
        int searchKey = 11;
        if(sll.find(sll.head, searchKey)){
            System.out.println(searchKey+" is present in list");
        }else{
            System.out.println(searchKey+" is not present in list");
        }
        searchKey = 100;
        if(sll.find(sll.head, searchKey)){
            System.out.println(searchKey+" is present in list");
        }else{
            System.out.println(searchKey+" is not present in list");
        }
    }
}
