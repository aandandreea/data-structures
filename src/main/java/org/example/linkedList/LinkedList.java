package org.example.linkedList;

public class LinkedList {
    Node head;
    /*
    -- initializare prin constructor
    -- metoda add prin care adaugam un element nou in lista
     */

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList() {
        this.head = null;
    }
    /*
        []
        -- adaugam 1
            -- este lista goala?
               -> da = atunci head la numar 1
               -> nu =
                2->3->6
                1
                nouNod = 1->null
                nouNod.next = head
                head = nouNod
     */

    public void addFront(int s) {
        if (head != null) {
            Node newNode = new Node(s);
            newNode.next = head;
            head = newNode;
        } else {
            Node newNode = new Node(s);
            head = newNode;
        }
    }

    /*
        1,2,3
        head -> 1 -> 2 -> 3 -> null
     */
    public void addBack(int info) {
        if (head == null) {
            Node newNode = new Node(info);
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            Node lastNode = new Node(info);
            current.next = lastNode;

        }
    }

    public void display() {
        if (head == null) {
            System.out.println("null");

        } else {
            System.out.print("head =>");
            System.out.print(" " + head.number + " " + "-->");

            Node current = head.next;
            while (current != null) {
                System.out.print(" " + current.number + " " + "-->");

                current = current.next;

            }
            System.out.println("null");
        }
    }

    public void sum() {
        if (head == null) {
            System.out.println("Sum is null");
        } else {
            Node current = head;
            int sum = 0;
            while (current != null) {
                sum = current.number + sum;
                current = current.next;

            }
            System.out.println("sum = " + sum);
        }

    }

    public void negativeSum() {
        if (head == null) {
            System.out.println("Sum is null");
        } else {
            Node current = head;
            int negativeSum = 0;
            while (current != null) {
                if (current.number < 0) {
                    negativeSum = current.number + negativeSum;
                }

                current = current.next;

            }
            System.out.println("negativeSum = " + negativeSum);
        }
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is null");
        } else if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }
/*
 1->2->3->4->2->4->1

 */
    public void countOccurrencesOf(int n){
        int numberOfOccurrences = 0;
        Node current = head;

        while(current != null ){
            if(current.number == n){
                numberOfOccurrences++;
            }
            current = current.next;
            }
        System.out.println("Occurrences " + numberOfOccurrences);
        }
    }





