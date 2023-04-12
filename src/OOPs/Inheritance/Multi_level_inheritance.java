package OOPs.Inheritance;
// multi level inheritance give the access from super class to sub class we can reused the again again code
class  A{  // super class
    int a, b, c;

    void Add(){
        a = 10; b = 5;
        c= a+b;
        System.out.println("Sum of two numbers: " +c);
    }

    void Sub(){
        a= 20;
        b = 10;
        c= a-b;
        System.out.println("sub of two numbers: "+c);
    }
}
class  B extends  A{   //  sub class 1
   void multi(){
       a = 10;
       b = 5;
       c = a*b;
       System.out.println("multiplication of two numbers: "+ c);
   }

}
class C extends  B{ // sub class 2
    void div(){
        a = 10;
        b = 5;
        c = a/b;
        System.out.println("division of two numbers: "+ c);
    }

}
public class Multi_level_inheritance {
    public static void main(String[] args) {
        C c = new C();  // objects
        c.Add();
        c.Sub();
        c.multi();
        c.div();
    }

}
