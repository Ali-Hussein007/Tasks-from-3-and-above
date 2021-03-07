/**
 * Created by Ali on 07/03/2021.
 */
// R-3.6 ANS : second to last
import java.io.*;

class LinkedList
{
    Node head;

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

    void printSecondFromLast()
    {

        Node temp = head;
        if(temp == null)
            System.out.println("No node in linked list");
        else if(temp.next == null)
            System.out.println("Only one node in linked list");
        else{

            while (temp.next.next != null)
            {
                temp = temp.next;
            }

            System.out.println(temp.data);
        }
    }

    public void add(int new_data)
    {
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    public static void main(String [] args)
    {
        LinkedList llist = new LinkedList();
        llist.add(7);
        llist.add(6);
        llist.add(10);
        llist.add(12);
        llist.printSecondFromLast();
    }
}