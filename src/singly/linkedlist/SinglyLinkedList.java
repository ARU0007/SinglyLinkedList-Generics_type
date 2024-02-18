package singly.linkedlist;

import java.util.Scanner;

//creating a generics type class''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
public class SinglyLinkedList<T> {
    Node<T> head = null;


    //creating functions''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
    //creation "

    public void create() {
        int n;
        T data;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the data");
            data = (T) sc.next();
            Node<T> new_node = new Node<>(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("enter 1 for more data");
            n = sc.nextInt();

        } while (n == 1);
    }


    //Traverse function''''''''''''''''''''''''''''''''''''''''''''''''''''''

    public void traverse() {
        Node<T> temp = head;
        if (head == null) {
            System.out.print("Empty linked list");

        } else {
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;

            }

        }


    }


    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;

        }


    }

}


