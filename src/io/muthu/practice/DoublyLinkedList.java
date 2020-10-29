package io.muthu.practice;

public class DoublyLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data= data;
            this.next = null;
            this.prev = null;

        }

    }


    public static void main(String[] args) {
        Node head = new Node (5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next= fourth;
        fourth.prev = third;

        //Insert as Head Node of List
        Node n1 = insertAtBeginning(head,1);
        insertAtEnd(head,25);
        //DisplayTheList
        displayList(n1);
    }

    private static Node insertAtEnd(Node head, int i) {
        if(head==null){
            Node node = new Node(i);
            head = node;
            return head;
        }
        else{

        }

        return null;
    }

    private static Node insertAtBeginning(Node head,int i) {
        Node result;
        if(head==null){
           Node node = new Node(i);
           head = node;
           return head;
        }else{
            Node node = new Node(i);
            node.next = head;
            head.prev = node;
            result = node;
        }

        return result;
    }

    private static void displayList(Node head) {

        Node current= head;
        while(current!=null){
            System.out.print(current.data+"   ");
            current = current.next;
        }
        System.out.println();

    }
}
