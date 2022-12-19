package LinkedList;
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
            count++;
            temp = temp.next;

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
    int popPos(int pos){
        Node temp = head;
        int size=0;
        if(pos > size){
            System.out.println("Error: list has only" + size + "!!");
            return -1;
        }
        if(pos == 1){
            int delval = temp.next.data;
            head = head.next;
            return delval;
        }
        if(head.next == null){
            int delval = temp.next.data;
            head = head.next;
            return delval;

        }
        for(int i=1; i<pos-1; i++){
            temp = temp.next;
        }
        int delval = temp.next.data;
        temp.next = temp.next.next;
        return delval;
    }
    void reverse(){
        Node pre = head;
        Node curr = pre.next;
        Node pos = curr.next;
        while (curr != null){
            curr.next = pre;
            pre = curr;
            curr = pos;
            if(pos !=null)
               pos = pos.next;
        }
        head.next = null;
        head = pre;
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
        myList.print();
        myList.reverse();
        myList.print();

//        myList.pushPos(30,2);



//        myList.print();
//       // System.out.println(myList.pop());my

//        myList.pushBegin(30);
//        myList.print();
//        System.out.println(myList.popBegin());
//        myList.print();
//        System.out.println(myList.popPos(3));
//        myList.print();
//        System.out.println(myList.getSize());
//        myList.print();
    }
}
