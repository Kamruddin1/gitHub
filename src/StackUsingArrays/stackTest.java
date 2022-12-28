package StackUsingArrays;
class Stack{
   private int MAX_SIZE = 5;
   private int stack[] = new int[MAX_SIZE];
   private int top = -1;

   void push(int data){
       if(top+1 == MAX_SIZE){
           System.out.println("stack has reached its limits!! ");
           return;
       }
       top++;
       stack[top] = data;
   }
//   boolean isEmpty(){
//       if(top <=0){
//           System.out.println("stack is empty!! ");
//           return -1;
//       }
//   }
   void print(){
       for(int i=0; i<=top; i++){
           System.out.print(stack[i]+" ");
       }
   }

}
public class stackTest {
    public static void main(String[] args) {
        Stack mystack = new Stack();
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(10);
        mystack.push(40);
        mystack.push(50);
        mystack.print();

    }
}
