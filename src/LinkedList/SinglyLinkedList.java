package LinkedList;

import java.time.chrono.ThaiBuddhistEra;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next= null;
    }
}
class LinkedList{
    private Node head;
    void pushLast(int data){
        Node newNode = new Node(data);
        newNode.data = data;
        if(head == null){
            head = newNode;
        }

        else {
            Node temp = head;
            while (temp.next !=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }
    int pop(){
        Node temp = head;
        if(head == null){
            System.out.println("Error: myList is Empty::");
            return -1;
        }
        if(head.next == null){
            int delval = head.data;
            head = null;
            return delval;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        int delval = temp.next.data;
        temp.next.next = null;
        return delval;

    }



    void pushBegin(int data){
        Node newNode = new Node(data);
        newNode.data = data;
        if(head == null){
            head = newNode;
        }
        else{
           newNode.next = head;
           head = newNode;
        }

    }
    int popBegin(){
        if(head == null){
            System.out.println("Error: myList is Empty");
            return -1;
        }
        int delval = head.data;
        head = head.next;
        return delval;
    }
    int getSize(){
        int count =0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    void pushPos(int data, int pos){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=1; i<pos-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" --> ");
            temp = temp.next;
        }
        System.out.println(temp);
    }

}
public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.pushLast(10);
        myList.pushLast(20);
        myList.pushLast(20);
        myList.pushPos(30,2);
        myList.print();


        myList.print();
       // System.out.println(myList.pop());my

        myList.pushBegin(30);
        myList.print();
        System.out.println(myList.popBegin());
        myList.print();
    }
}
