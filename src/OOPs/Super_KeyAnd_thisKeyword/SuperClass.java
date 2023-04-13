package OOPs.Super_KeyAnd_thisKeyword;
// the void the confusion bitween variable nd method as same name then we use super keyword that is called super keyword

// the super class and sub class same name then we can use only super keyword
// constructor always reserve super keyword by default
// if gives paramaterizes type construtor then conpersoly give super keyword



class A {  // super class




//        int a = 10;   // 13 line that is same variable then we can use super keyword


//   void show(){
//
//       System.out.println("hello dosto");  //    16-20 that is same metho then use super keyword
//   }
}

class B extends A{ // sub class


//    int a = 20;
//  void B(){
//                                   // 23-27 line  same variable then use super keyword
//       System.out.println(a);
//      System.out.println(super.a);
//   }
//    void show(){
//        super.show();
//        System.out.println("hello tester");   // that is super keyword the use super keyword
//    }
}


public class SuperClass {

    public static void main(String[] args) {

        B test = new B();
//        test.B();


    }

}
