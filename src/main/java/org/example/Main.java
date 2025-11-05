package org.example;


import org.example.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFront(1);
        list.addFront(3);
        list.addFront(9);
        list.addFront(5);
        list.addFront(2);
        list.SelectionSort();
        list.display();



    }
}