package org.example.linkedList;

public class Node {

    Node next;
    int number;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node(Node next, int number) {
        this.next = next;
        this.number = number;
    }

    public Node(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", number=" + number +
                '}';
    }

}