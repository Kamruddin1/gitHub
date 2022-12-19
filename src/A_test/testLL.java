package A_test;

import javax.management.StandardEmitterMBean;
import java.util.Scanner;

// user i/p
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
// list ko link krne ke liy
class LinkedList{
    private Node head;
    void pushlast(int data){
        Node newNode = new Node(data);
        newNode.data = data;
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while (temp.next !=null){
                temp = temp.next;
            }
            temp.next = newNode;

        }

    }
    void pushBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    int popLast(){
        Node temp = head;
        if(head==null){
            System.out.println("Error: mylist is empty!!");
            return -1;
        }
        if(head.next == null){
            int delval = head.data;
            head = null;
            return  delval;
        }
        while (temp.next.next != null){
            temp = temp.next;
        }
        int delval = temp.next.data;
        temp.next = null;
        return delval;
    }
    void pushPos(int data,int pos){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=1; i<pos-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // print
    void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println(temp);// null define krne ke
    }
}

public class testLL {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.pushlast(10);
        myList.pushlast(20);
        //15
        myList.pushlast(30);
        myList.print();
        System.out.println(myList.popLast());
        myList.print();
        myList.pushBegin(5);
        myList.print();
        myList.pushPos(15,2);
        myList.print();
    }
}
