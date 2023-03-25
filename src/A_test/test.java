
package A_test;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next= null;
    }
}
        class linkedList{

            Node head;
            void pushLast(int data){
                Node newNode = new Node(data);
                newNode.data = data;

                if(head == null){
                    head =  newNode;
                }
                else {
                    Node  temp = head;
                    while (temp.next != null){
                        temp =  temp.next;
                    }
                    temp.next = newNode;

                }

                }
                void pushBegin(int data) {
                Node newNode = new Node(data);
                newNode.data = data;
                if(head == null){
                    head = newNode;
                }
                else {
                    newNode.next = head;
                    head = newNode;
                }
            }
            int popBegin(){
                if(head == null){
                    System.out.println("my list is empty");
                    return -1;

                }
                if(head.next == null){
                    System.out.println("my list is empty!!");
                    return -1;
                }
                Node temp = head;
                while (temp.next.next!= null){
                    temp = temp.next;
                }
                int delval =  temp.next.data;
                temp.next.next = null;
                return delval;
            }
            void print(){
                Node temp = head;
                while (temp!=null){
                    System.out.print(temp.data + "-->");
                    temp = temp.next;
                }
                System.out.println(temp);
            }
}
       public class test{

        public static void main(String[] args) {
            linkedList mylist = new linkedList();
            mylist.pushLast(10);
            mylist.pushLast(20);
            mylist.pushLast(30);
            mylist.pushLast(40);
            mylist.pushLast(50);
            mylist.print();
            mylist.pushBegin(5);
            mylist.print();
            mylist.popBegin();
            mylist.print();


        }
    }
