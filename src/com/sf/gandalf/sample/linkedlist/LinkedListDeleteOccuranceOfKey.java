package com.sf.gandalf.sample.linkedlist;

import java.util.LinkedList;

public class LinkedListDeleteOccuranceOfKey {

// Java Program to delete all occurrences of a given key in linked list

    static Node head; // head of list

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Given a key, deletes all occurrence
    of the given key in linked list */
    void deleteKey(int key)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key
        // or multiple occurrences of key
        while (temp != null && temp.data == key)
        {
            head = temp.next; // Changed head
            temp = head; // Change Temp
        }

        // Delete occurrences other than head
        while (temp != null)
        {
            // Search for the key to be deleted,
            // keep track of the previous node
            // as we need to change 'prev->next'
            while (temp != null && temp.data != key)
            {
                prev = temp;
                temp = temp.next;
            }

            // If key was not present in linked list
            if (temp == null)
                return;

            // Unlink the node from linked list
            prev.next = temp.next;

            // Update Temp for next iteration of outer loop
            temp = prev.next;
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    /* This function prints contents of linked list
    starting from the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        LinkedListDeleteOccuranceOfKey llist = new LinkedListDeleteOccuranceOfKey();

        llist.push(7);
        llist.push(2);
        llist.push(3);
        llist.push(2);
        llist.push(8);
        llist.push(1);
        llist.push(2);
        llist.push(2);

        int key = 2; // key to delete

        System.out.println("Created Linked list is:");
        llist.printList();

        // Function call
        llist.deleteKey(key);

        System.out.println("\nLinked List after Deletion is:");
        llist.printList();
    }
}
