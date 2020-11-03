package io.muthu.educative;

public class InsertionAtEnd {

    Node head;

    static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(3);
        Node third = new Node(5);
        Node fourth = new Node(7);
        head.next = second;
        second.next = third;
        third.next = fourth;
        insertionAtEnd(head,9);
        printLinkedList(head);


    }

    private static void printLinkedList(Node head) {
     Node current = head;
     while(current!=null){
         System.out.print(current.data+ "   ");
         current = current.next;
     }
        System.out.println();
    }

    private static void insertionAtEnd(Node head, int i) {


        Node result;
        Node new_node = new Node(i);
        if(head==null){
          head = new_node;
          result = head;
        }else{

        }
        while (head.next!=null) {
            head = head.next;
        }
            head.next = new_node;
            result = head;
        }

}
