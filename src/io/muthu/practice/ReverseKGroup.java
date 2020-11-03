package io.muthu.practice;

public class ReverseKGroup {

    Node head;
    
    static class Node {
        
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        
        int reverse = 3;
        
        head = reverseKthGroupLinkedList( head, reverse);
        printlist(head);
        
    }

    private static Node reverseKthGroupLinkedList(Node head, int reverse) {

        Node current = head, next = null, prev = null;
        int count =0;
        while(current!=null&&count<reverse){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next!=null){
            Node rest_head = reverseKthGroupLinkedList(next,reverse);
            head.next=rest_head;

        }
       return  prev;
    }



    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

}
