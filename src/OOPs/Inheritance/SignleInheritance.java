package OOPs.Inheritance;
// inheritance , it can be reuse code from super class to sub class
// inheritance there are four type
// 1: single type inheritance => sigle inheritance means one super class and one sub class we can acees the again and again the code
// 2: multiple type inheritance => muliple class like multiple super class we can accesss the code but java not allow the multiple super class
// 3 : multi- level inheritance => we can access the code again and again for example one super class and multiple subclass
// 4: herarical type inheritance  => we can access the code one super class , direct acees the code from super class in sub class

class student{
    String name;
    int rollNo;
    int  marks;
    void input(){
        name = "ansari";
        rollNo = 23;
        marks = 80;
        System.out.println("enter the name roll no and marks: ");
    }


}
class ansari extends  student{


    void display(){
        System.out.println(name + " " +rollNo + " " +marks);
    }

}
public class SignleInheritance {

    public static void main(String[] args) {

        ansari r = new ansari();
        r.input();
        r.display();

    }
}
