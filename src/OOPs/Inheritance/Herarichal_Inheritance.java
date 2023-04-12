package OOPs.Inheritance;


// mulit level inheritance we can directs access from super class to sub class indivisual reused code again and again
class Super_class{ // super class
    String name;
    int rollNo;
    int age;
    int marks;

}

class Ansari extends  Super_class{   //  sub class 1


    void section_A(){
        name = "Ansari";
        rollNo = 1;
        age = 22;
        marks = 90;

        System.out.println("section A details of students: "+ name+ " "+ rollNo+ " "+ age+ " "+marks);
    }
}
class  Srijal extends Super_class{ // sub class 2

    void section_B(){
        name = "Srijal";
        rollNo = 2;
        age = 22;
        marks = 95;
        System.out.println("section B details of students: "+ name+ " "+ rollNo+ " "+ age+ " "+marks);
    }
}

public class Herarichal_Inheritance {

    public static void main(String[] args) {
        Ansari A = new Ansari();
        Srijal B = new Srijal();
        A.section_A();
        B.section_B();

    }
}
