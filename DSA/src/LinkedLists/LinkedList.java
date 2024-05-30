package LinkedLists;

public class LinkedList {
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length;
    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            if(length == 1){
                System.out.println(temp.value);
                temp = temp.next;
            }
            else if (temp.next == null){
                System.out.print(temp.value);
                temp = temp.next;
            }
            else{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }

        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.print("Linked List: ");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
        System.out.println();
    }

    public void append(int value){
        Node newNode = new Node(value);
        if( length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
}

