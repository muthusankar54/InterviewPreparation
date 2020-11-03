package io.muthu.practice;

public class DetectLoop {

    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }

    public static void main(String args[])
    {
        Node head=new Node(15);
        head.next=new Node(10);
        head.next.next=new Node(12);
        head.next.next.next=new Node(20);
        head.next.next.next.next=head.next;
        if (isLoop(head))
            System.out.print("Loop found");
        else
            System.out.print("No Loop");
    }

    static boolean isLoop(Node head)
    {   Node slow_p = head,fast_p = head;

        while (fast_p!=null && fast_p.next!=null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                return true;
            }
        }
        return false;
    }
}
