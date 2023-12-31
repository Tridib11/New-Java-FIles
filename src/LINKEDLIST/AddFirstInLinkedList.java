package LINKEDLIST;

public class AddFirstInLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step 1 - create new Node
        Node newNode=new Node(data);
        //if the linkedlist is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2 - newNode next=head
        newNode.next=head;
        //step3 - head=newNode
        head=newNode;
    }

    public static void main(String[] args) {
        AddFirstInLinkedList ll=new AddFirstInLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
