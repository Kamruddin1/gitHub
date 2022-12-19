package L_DoublyLinkedList;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
    }
}
class D_LinkedList{
    private Node head;
    private Node tail;
    boolean isEmpty(){
        return (head == null && tail == null);
    }
    void pushLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    int popLast(){
        if(isEmpty()){

            System.out.println("Error: list is empty!!");
            return -1;
        }
        if(head == null && head != null){
            int delval = tail.data;
            head = null;
            tail = null;
            return delval;
        }
        else{
            int delval  = tail.data;
            tail = tail.prev;
            tail.next = null;
            return  delval;
        }
    }
    void pushBegin(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    void print(){
        Node temp = head;
        while( temp!= null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp);
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        D_LinkedList myList = new D_LinkedList();
        myList.pushLast(10);
        myList.pushLast(20);
        myList.pushLast(30);
        myList.print();
        myList.pushBegin(30);
        myList.print();
        System.out.println(myList.popLast());
        myList.print();


    }
}
