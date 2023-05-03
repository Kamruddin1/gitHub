package OOPs.Constructors;

class  Student{
    int rollNo;
    String name;
    int age;

    void printDetails(){
                System.out.println(name);
        System.out.println(rollNo);
        System.out.println(age);


    }
}

public class Oops1 {
    public static void main(String[] args) {

        Student stud1 = new Student();

        stud1.rollNo = 25;
        stud1.name = "ansari";
        stud1.age = 22;
//
//        System.out.println("My name is "+stud1.name);
//        System.out.println("and my rollNo is "+stud1.rollNo);
//        System.out.println(" and i'm "+stud1.age + " years old");

        stud1.printDetails();


        // agr hm data ko update krna chahte h to kaise kare

        stud1.name = "srijal";

        stud1.printDetails();





    }
}
