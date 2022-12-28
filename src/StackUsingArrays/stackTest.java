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
   boolean isEmpty(){
       return top <= -1;
   }
    int pop(){
       if(isEmpty()){
           System.out.println("Stack is Empty!! ");
           return -1;
       }
       int delval  = stack[top];
       top--;
       return delval;
    }
   void print(){
       for(int i=0; i<=top; i++){
           System.out.print(stack[i]+" ");

       }
       System.out.println();
   }

}
public class stackTest {
    public static void main(String[] args) {
        Stack mystack = new Stack();
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);
        mystack.print();
        System.out.println(mystack.pop());
        mystack.print();

    }
}
