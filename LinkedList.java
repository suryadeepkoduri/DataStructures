package linkedlist;

public class LinkedList {
    Node head;

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertLast(int data) {
        if (head == null) {
            insertFirst(data);
            return;
        }

        Node node = new Node(data);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void deleteFirst() {
        if (head != null)
            head = head.next;
    }

    public void deleteLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }


    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
