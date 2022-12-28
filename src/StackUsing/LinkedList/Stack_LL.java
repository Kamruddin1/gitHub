package StackUsing.LinkedList;
class Node{
    int data;
    Node next;
   Node(int data){
       this.data = data;
   }
}
class stackLinkedList{
    Node top;
    void push(int data){
        Node newNode = new  Node(data);
        newNode.data = data;
        if(top == null){
            top = newNode;
        }
        else{
            Node temp = top;
           while (temp.next != null){
            temp = temp.next;
           }
           temp.next = newNode;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("stack is empty!!");
            return -1;
        }
        int delval = top.data;
        top = top.next;
        return delval;
    }
    boolean isEmpty(){
        return top == null;
    }
    void print(){
        Node temp = top;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(temp);
    }
}
public class Stack_LL {
    public static void main(String[] args) {
        stackLinkedList myList = new stackLinkedList();
        myList.push(10);
        myList.push(20);
        myList.push(30);
        myList.print();
        System.out.println(myList.pop());
        myList.print();


    }
}
